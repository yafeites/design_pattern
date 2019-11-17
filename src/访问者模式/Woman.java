package 访问者模式;

public class Woman extends  Person {
    @Override
    void work(Visitor visitor) {
        visitor.HandleWithWoman(this);
    }
}
