import java.util.ArrayList;

public class Inventario {

    private ArrayList<Product> produtos = new ArrayList<Product>();

    public Inventario() {
        produtos.add(new Shirt("-", "-", 0.0));
    }

    public void showInventory() {
        int i = 1;
        for (Product produto: produtos) {
            System.out.println(i + ". " + produto.getNome());
            i++;
        }
    }

    public Product getProduct(int index) {
        if (produtos.size() > (index-1) && (index-1) >= 0) {
            return produtos.get(index-1);
        }
        return null;
    }
}