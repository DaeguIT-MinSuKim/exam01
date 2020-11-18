package exam01.dto;

public class Sale {
    private int custno;
    private String name;
    private String grade;
    private int total;

    public Sale() {
        // TODO Auto-generated constructor stub
    }

    public Sale(int custno, String name, String grade, int total) {
        this.custno = custno;
        this.name = name;
        this.grade = grade;
        this.total = total;
    }

    public int getCustno() {
        return custno;
    }

    public void setCustno(int custno) {
        this.custno = custno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return String.format("Sale [custno=%s, name=%s, grade=%s, total=%s]", custno, name, grade, total);
    }

}
