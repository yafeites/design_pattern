package 适配器模式;

public class Main {
    public static void main(String[] args) {
        Amercian amercian1=new ironman();
        Amercian amercian2=new Translate();
        amercian1.sayhello();
        amercian2.sayhello();
    }


}
