package 访问者模式;

public class Man extends  Person {
    @Override
    void work(Visitor visitor) {
        visitor.HandleWithMan(this);
    }
}
