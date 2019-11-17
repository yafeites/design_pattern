package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    List<Observer>observers=new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifying() {
        for (Observer o :
                observers) {o.update();

        }
    }
}
