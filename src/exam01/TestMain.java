package exam01;

import java.sql.Connection;

import exam01.dao.MemberDao;
import exam01.ds.JdbcUtil;
import exam01.dto.Member;

public class TestMain {

    public static void main(String[] args) {
        Connection con = JdbcUtil.getConnection();
        
        System.out.println(con);
        
        MemberDao dao = MemberDao.getInstance();
        /*
         * int res = dao.insertMember(new Member(100008, "test", "010-1111-2222",
         * "대구 수정구", "20151202", "A", 60)); System.out.println(res);
         */
        
        int res = dao.nextNum();
        System.out.println(res);
    }

}
