package 中介者模式;

public abstract  class Country {
    Mediator mediator;

    public Country(Mediator mediator) {
        this.mediator = mediator;
    }
    abstract  void getmessage(String message);
    abstract void sendmessage(String message);
}
