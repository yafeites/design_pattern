package 备忘录模式;

public class Originator {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public  Memento createMemento()
    {
        return new Memento(state);
    }
    public void getMenmento(Memento memento)
    {
        state=memento.getState();
    }
}
