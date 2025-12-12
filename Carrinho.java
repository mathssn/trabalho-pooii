import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void addProduct(Produto produto) {
        produtos.add(produto);
    }

    public void showCart() {
        int i = 1;
        for (Produto produto: produtos) {
            System.out.println(i + ". " + produto.getNome());
            System.out.println(produto.getPreco());
            System.out.println();
            i++;
        }
    }
    
}
