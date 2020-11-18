package exam01.action;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam01.command.JoinCommand;
import exam01.command.ListCommand;
import exam01.command.SaleCommand;
import exam01.command.UpdateCommand;

@WebServlet
public class FrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private HashMap<String, Command> map; 

    public void init(ServletConfig config) throws ServletException {
        map = new HashMap<String, Command>();
        map.put("/list.do", new ListCommand());  //인텍스 페이지 호출
        map.put("/update.do", new UpdateCommand());
        map.put("/join.do", new JoinCommand());
        map.put("/sale.do", new SaleCommand());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }
    
    private void process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");  //한글깨짐 방지를 위해
        
        String uri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String commandPath = uri.substring(contextPath.length());
        
        Command command = map.get(commandPath);  //필요한 Command 객체를 찾아옴
        String viewPage = command.execute(request, response);  //명령실행후 보여줄 결과페이지 선택
        
        if (viewPage != null) {
            if (viewPage.startsWith("redirect:")) {
                String url = viewPage.substring(9);
                System.out.println("url > " + url);
                response.sendRedirect(url);
            }else {
                request.getRequestDispatcher(viewPage).forward(request, response);
            }
        }
    }
    
}
