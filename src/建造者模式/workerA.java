package 建造者模式;

public class workerA implements  Builder {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void BuildPartA() {

    }

    @Override
    public void BuildPartB() {

    }

    @Override
    public Product GetResults() {
        return product;
    }
}
