package 适配器模式;

public class Translate implements Amercian {
    private Chinese chinese=new wyj();
    @Override
    public void sayhello() {
        chinese.saynihao();
    }
}
