public class GolaPoloDecorator extends ProdutoDecorator {

    public GolaPoloDecorator(Produto produto) {
        super(produto);
        this.setPreco(produto.getPreco() + 10);
    }

    @Override
    public String getNome() {
        return produto.getNome() + " + Gola Polo";
    }
}
