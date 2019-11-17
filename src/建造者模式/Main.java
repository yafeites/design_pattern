package 建造者模式;

public class Main {
    public static void main(String[] args) {
        建造者模式.Director director=new 建造者模式.Director();
        Builder b1=new 建造者模式.workerA();
        Builder b2=new 建造者模式.workerB();
        director.Constuct(b1);
        director.Constuct(b2);
        b1.GetResults().show();
        b2.GetResults().show();
    }
}
