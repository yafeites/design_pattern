public class work {
    private state state;
    private int hour;

    public work(state state) {
        this.state = state;
    }

    public state getState() {
        return state;
    }

    public void setState(state state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public  void run()
    {
        state.dosomething(this);
    }
}
