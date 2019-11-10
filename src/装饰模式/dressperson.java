package 装饰模式;

public class dressperson extends  drawperson {
    @Override
    public void dosomething() {
        System.out.println("我在穿裙子");
        super.dosomething();
    }
}
