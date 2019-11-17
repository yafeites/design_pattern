package 建造者模式;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String>parts;
    public  void add(String part)
    {
        parts.add(part);
    }

    public Product() {
        this.parts = new ArrayList<>();
    }
    public  void show()

    {

    }
}
