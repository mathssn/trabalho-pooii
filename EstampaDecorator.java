public class EstampaDecorator extends ProductDecorator {

    public EstampaDecorator(Product produto) {
        super(produto);
        this.setPrice(produto.getPrice() + 15);
    }

    @Override
    public String getNome() {
        return produto.getNome() + " + Estampa";
    }
}
