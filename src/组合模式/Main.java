package 组合模式;

public class Main {
    public static void main(String[] args) {
        company company=new company();
        department department=new department();
        company.add(department);
    }
}
