package 备忘录模式;

public class Memento {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Memento(int state) {
        this.state = state;
    }
}
