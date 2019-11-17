package 建造者模式;

public class Director {
    public  void Constuct(Builder builder)
    {
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
