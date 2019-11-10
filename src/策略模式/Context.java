package 策略模式;

public class Context {
    private Strategy strategy;

    public Context(String s){
        switch (s)
        {
            case "0":
           strategy =  new NomarlStrategy();
           break;
            case "1":
                strategy=new returnStrategy();
        }

    }
}
