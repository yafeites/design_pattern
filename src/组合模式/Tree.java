package 组合模式;

public interface Tree {
    abstract void add(Tree tree) ;
    abstract void delete(Tree tree);


    abstract void dosomething();
}
