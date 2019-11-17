package 命令模式;

public abstract class command {
    private  receiver receiver;

    public command(receiver receiver) {
        this.receiver = receiver;
    }
    public  abstract void excutor();
}
