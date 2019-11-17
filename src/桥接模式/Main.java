package 桥接模式;

public class Main {
    public static void main(String[] args) {
        Game dota2=new dota2();
        Game pokemon=new pokemon();
        huawei huawei=new huawei(pokemon);
        iphone iphone=new iphone(dota2);

    }
}
