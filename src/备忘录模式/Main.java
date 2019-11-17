package 备忘录模式;

public class Main {
    public static void main(String[] args) {
        Originator originator=new Originator();
        originator.setState(1);
        Caretaker caretaker=new Caretaker();
       caretaker.setMemento(originator.createMemento());
       originator.setState(2);
       originator.getMenmento(caretaker.getMemento());

    }
}
