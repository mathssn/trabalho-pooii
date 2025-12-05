import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Product> produtos = new ArrayList<Product>();

    public void addProduct(Product produto) {
        produtos.add(produto);
    }

    public void showCart() {
        int i = 1;
        for (Product produto: produtos) {
            System.out.println(i + ". " + produto.getNome());
            System.out.println(produto.getPrice());
            System.out.println();
            i++;
        }
    }
    
}
