package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class company implements  Tree{
    List<Tree>lists=new ArrayList<>();

    public List<Tree> getLists() {
        return lists;
    }

    public void setLists(List<Tree> lists) {
        this.lists = lists;
    }

    @Override
    public void add(Tree tree) {

    }

    @Override
    public void delete(Tree tree) {

    }

    @Override
    public void dosomething() {

    }
}
