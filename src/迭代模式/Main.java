package 迭代模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(100);
        Iterator<Integer>iterator=list.iterator();
        while (iterator.hasNext())
        {
            int i= iterator.next();
            System.out.println(i);
        }

    }
}
