import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> cart = new ArrayList<Product>();

    public void addProduct(Product produto) {
        cart.add(produto);
    }
    
}
