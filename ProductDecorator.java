public abstract class ProductDecorator implements Product {

    protected Product produto;

    public ProductDecorator(Product produto) {
        this.produto = produto;
    }

    @Override
    public String getNome() {
        return produto.getNome();
    }

    @Override
    public void setPrice(double price) {
        produto.setPrice(price);
    }

    @Override
    public double getPrice() {
        return produto.getPrice();
    }

    @Override
    public Product clone() {
        return produto.clone();
    }

    @Override
    public void setMarca(String marca) {
        produto.setMarca(marca);
    }

    @Override
    public String getMarca() {
        return produto.getMarca();
    }
}
