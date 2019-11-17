package 访问者模式;

public interface Visitor {
    abstract  void HandleWithMan(Man man);
    abstract  void HandleWithWoman(Woman woman);
}
