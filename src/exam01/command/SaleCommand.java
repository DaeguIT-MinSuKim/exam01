package exam01.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam01.action.Command;
import exam01.dao.SaleDao;
import exam01.dto.Sale;

public class SaleCommand implements Command {
    private SaleDao saleDao;
    
    public SaleCommand() {
        saleDao = SaleDao.getInstance();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Sale> list = saleDao.getList();
        request.setAttribute("list", list);
        return "template.jsp?pp=sale";  //초기 인덱스 페이직를 보여주는 부분
    }

}
