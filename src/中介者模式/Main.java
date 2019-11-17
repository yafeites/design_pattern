package 中介者模式;

public class Main {
    public static void main(String[] args) {
        Mediator mediator =new ConcreteMediator();
        Amercian amercian=new Amercian(mediator);
        Iran iran=new Iran(mediator);
        amercian.sendmessage("fuck you");
        iran.sendmessage("wocnm");
    }
}
