package 中介者模式;

public class Amercian extends Country {
    public Amercian(Mediator mediator) {
        super(mediator);
    }

    @Override
    void getmessage(String message) {
        mediator.declare(message,this);
    }

    @Override
    void sendmessage(String message) {
        System.out.println("Amercian"+"+"+message);
    }
}
