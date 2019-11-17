package 职责链模式;

public abstract class manager {
    public  manager siperior;
    void setsuperior(manager manager) {
        this.siperior=manager;
    }
    abstract void handlerequest(request request);
}
