public abstract class ProdutoDecorator implements Produto {

    protected Produto produto;

    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String getNome() {
        return produto.getNome();
    }

    @Override
    public void setPreco(double price) {
        produto.setPreco(price);
    }

    @Override
    public double getPreco() {
        return produto.getPreco();
    }

    @Override
    public Produto clone() {
        return produto.clone();
    }

}
