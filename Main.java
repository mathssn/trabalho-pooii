import java.util.Scanner;

public class Main {

    public static Inventario inventario = new Inventario();
    
    public static void main(String[] args) {
        Carrinho cart = new Carrinho();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Seja bem vindo!");

        while (true) {
            System.out.println("======================");
            System.out.println("1. Ver meu carrinho");
            System.out.println("2. Ver produtos");
            System.out.println("0. Sair");
            System.out.println("======================");
            System.out.print("Escolha: ");
            int escolha = input.nextInt();
            if (escolha == 0) {
                break;
            } else if (escolha == 2) {
                verProdutos(input, cart);
            } else if (escolha == 1) {
                cart.showCart();
            }
        }

        input.close();
    }

    public static void verProdutos(Scanner input, Carrinho cart) {
        inventario.showInventory();
        System.out.print("Escolha algum produto para adicionar ao carrinho: ");
        int escolha = input.nextInt();
        if (escolha == 0) {
            return;
        }

        Product item = inventario.getProduct(escolha);
        System.out.println(item);
        if (item != null) {
            cart.addProduct(item);
        }
    }
}
