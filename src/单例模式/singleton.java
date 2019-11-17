package 单例模式;

public class singleton {
    static singleton singleton1=new singleton();
    private  static singleton singleton2;
    //饿汉模式
    public  singleton getSingleton1() {
        return singleton1;
    }
    final  static  Object  locked=new Object();
    //懒汉模式
    public  static singleton getSingleton2()
    {
        if(singleton2==null)

        {
            synchronized (locked)
            {
                if(singleton2==null)
                {
                    singleton2=new singleton();
                }
            }
        }
        return  singleton2;
    }
}
