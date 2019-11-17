package 访问者模式;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SubjectList subjectList=new SubjectList(new ArrayList<Person>());
        VisitorA visitorA=new VisitorA();
    }
}
