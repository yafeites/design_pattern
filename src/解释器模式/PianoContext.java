package 解释器模式;

import java.util.Collection;
import java.util.List;

public class PianoContext extends Context
{
    List<String>lists;
    @Override
    void dosomething() {

    }

    public PianoContext(List<String> lists) {
        this.lists = lists;
    }
}
