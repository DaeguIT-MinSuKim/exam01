package exam01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exam01.ds.JdbcUtil;
import exam01.dto.Member;

public class MemberDao {
    private static final MemberDao instance = new MemberDao();

    private MemberDao() {
        // TODO Auto-generated constructor stub
    }

    public static MemberDao getInstance() {
        return instance;
    }

    public int insertMember(Member member) {
        String sql = "insert into member_tbl_02(custno, custname, phone, address, joindate, grade, city) values(?, ?, ?, ?, ?, ?, ?)";
        int res = -1;
        try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, member.getNum());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getTel());
            pstmt.setString(4, member.getAddress());
            pstmt.setTimestamp(5, new Timestamp(member.getJoinDate().getTime()));
            pstmt.setString(6, member.getGrade());
            pstmt.setInt(7, member.getCity());
            res = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public int nextNum() {
        String sql = "SELECT max(custno) + 1 FROM MEMBER_TBL_02";
        try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public List<Member> getList(){
        String sql = "select custno, custname, phone, address, joindate, grade, city"
                  + " from member_tbl_02";
        List<Member> list = null;
        try (Connection con = JdbcUtil.getConnection(); 
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                list = new ArrayList<>();
                do {
                    list.add(getMember(rs));
                }while(rs.next());
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Member readMember(int no) {
        String sql = "select custno, custname, phone, address, joindate, grade, city"
                   + "  from member_tbl_02"
                   + " where custno = ?";
        try (Connection con = JdbcUtil.getConnection(); 
                PreparedStatement pstmt = con.prepareStatement(sql);){
            pstmt.setInt(1, no);
            try (ResultSet rs = pstmt.executeQuery()){
                if (rs.next()) {
                    return getMember(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private Member getMember(ResultSet rs) throws SQLException {
        int num = rs.getInt("custno");
        String name = rs.getString("custname");
        String tel = rs.getString("phone");
        String address = rs.getString("address");
        Date joinDate = rs.getDate("joindate");
        String grade = rs.getString("grade");
        int city = rs.getInt("city");
        return new Member(num, name, tel, address, joinDate, grade, city);
    }
    
    public int updateMember(Member member) {
        String sql = "update member_tbl_02"
                   + "   set custname=?, phone=?, address=?, joinDate=?, grade=?, city=? "
                   + " where custno = ?";
        
        try(Connection con = JdbcUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getTel());
            pstmt.setString(3, member.getAddress());
            pstmt.setTimestamp(4, new Timestamp(member.getJoinDate().getTime()));
            pstmt.setString(5, member.getGrade());
            pstmt.setInt(6, member.getCity());
            pstmt.setInt(7, member.getNum());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
