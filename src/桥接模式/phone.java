package 桥接模式;

public abstract class phone {
    private Game game;

    public phone(Game game) {
        this.game = game;
    }

    public abstract void  playgame();


}
