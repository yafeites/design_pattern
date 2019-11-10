package 工厂模式;

public class BicycleFactory  implements  ProductFactory
  {
      @Override
      public Product newProduct() {
          return new Bicycle();
      }
  }
