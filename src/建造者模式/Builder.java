package 建造者模式;

public interface Builder {
    abstract void BuildPartA();
    abstract void BuildPartB();
    abstract Product GetResults();
}
