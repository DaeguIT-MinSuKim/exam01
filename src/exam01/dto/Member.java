package exam01.dto;

import java.util.Date;

public class Member {
    private int num;
    private String name;
    private String tel;
    private String address;
    private Date joinDate;
    private String grade;
    private int city;

    public Member() {
        // TODO Auto-generated constructor stub
    }

    public Member(int num, String name, String tel, String address, Date joinDate, String grade, int city) {
        this.num = num;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.joinDate = joinDate;
        this.grade = grade;
        this.city = city;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Member [num=%s, name=%s, tel=%s, address=%s, joinDate=%s, grade=%s, city=%s]", num, name, tel, address, joinDate, grade, city);
    }

}
