public class EstampaDecorator extends ProdutoDecorator {

    public EstampaDecorator(Produto produto) {
        super(produto);
        this.setPreco(produto.getPreco() + 15);
    }

    @Override
    public String getNome() {
        return produto.getNome() + " + Estampa";
    }
}
