package 解释器模式;

public  abstract class Expression {

    public  void translate(Context context)
    {
      String s=dosomething();
      excute(s);

    }
    private   String  dosomething()
    {
                return null;
    }
    abstract  void excute(String s);
}
