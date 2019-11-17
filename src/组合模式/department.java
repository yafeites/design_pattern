package 组合模式;

public class department implements  Tree{



    @Override
    public void add(Tree tree)  {
        System.out.println("无效方法");
    }

    @Override
    public void delete(Tree tree) {
        System.out.println("无效方法");
    }


    @Override
    public void dosomething() {

    }
}
