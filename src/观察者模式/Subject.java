package 观察者模式;

public interface Subject {
    public  abstract void attach(Observer observer);
    public  abstract void Detach(Observer observer);
    public  abstract void notifying();

}
