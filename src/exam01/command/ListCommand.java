package exam01.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam01.action.Command;
import exam01.dao.MemberDao;
import exam01.dto.Member;

public class ListCommand implements Command {
    private MemberDao memberDao;
    
    public ListCommand() {
        memberDao = MemberDao.getInstance();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Member> list = memberDao.getList();
        request.setAttribute("list", list);
        return "template.jsp?pp=list";  //초기 인덱스 페이직를 보여주는 부분
    }

}
