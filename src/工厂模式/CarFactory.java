package 工厂模式;

public class CarFactory implements  ProductFactory {
    @Override
    public Product newProduct() {
        return  new Car();

    }
}
