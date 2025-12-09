public class GolaPoloDecorator extends ProductDecorator {

    public GolaPoloDecorator(Product produto) {
        super(produto);
        this.setPrice(produto.getPrice() + 10);
    }

    @Override
    public String getNome() {
        return produto.getNome() + " + Gola Polo";
    }
}
