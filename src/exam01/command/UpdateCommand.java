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

public class UpdateCommand implements Command {
    private MemberDao memberDao;
    
    public UpdateCommand() {
        memberDao = MemberDao.getInstance();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getMethod().equalsIgnoreCase("get")) {
            String no = request.getParameter("custno");
            Member member = memberDao.readMember(Integer.parseInt(no));
            request.setAttribute("member", member);
            return "template.jsp?pp=update";  //초기 인덱스 페이직를 보여주는 부분
        }else {
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
            
            Member member = new Member(num, name, tel, address, joinDate, grade, city);
            
            System.out.println("member > " + member);
            memberDao.updateMember(member);
            
            return "redirect:list.do";
        }

    }

}
