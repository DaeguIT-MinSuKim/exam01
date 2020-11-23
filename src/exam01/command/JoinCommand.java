package exam01.command;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam01.action.Command;
import exam01.dao.MemberDao;
import exam01.dto.Member;

public class JoinCommand implements Command {
    private MemberDao memberDao;
    
    public JoinCommand() {
        memberDao = MemberDao.getInstance();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        if (request.getMethod().equalsIgnoreCase("get")) {
            int nextNum = memberDao.nextNum();
            request.setAttribute("nextNum", nextNum);
            return "template.jsp?pp=join";  //초기 인덱스 페이직를 보여주는 부분
        }else {
            Member member = getMember(request);
            System.out.println("member > " + member);
            int res = memberDao.insertMember(member);
            response.getWriter().write(res);
            return "redirect:list.do";
        }
    }

    private Member getMember(HttpServletRequest request) {
        int num = Integer.parseInt(request.getParameter("num"));
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");
        String address = request.getParameter("address");
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date joinDate = null;
        try {
            joinDate = formatter.parse(request.getParameter("joinDate"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        String grade = request.getParameter("grade");
        int city = Integer.parseInt(request.getParameter("city"));
        return new Member(num, name, tel, address, joinDate, grade, city);
    }

}
