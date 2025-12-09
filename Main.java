import java.util.Scanner;

public class Main {

    public static Inventario inventario = new Inventario();
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Carrinho cart = new Carrinho();
        
        System.out.println("Seja bem vindo!");

        while (true) {
            System.out.println("======================");
            System.out.println("1. Ver meu carrinho");
            System.out.println("2. Ver produtos");
            System.out.println("0. Sair");
            System.out.println("======================");
            int escolha = inputInt("Escolha: ");
            if (escolha == 0) {
                break;
            } else if (escolha == 2) {
                verProdutos(cart);
            } else if (escolha == 1) {
                cart.showCart();
            }
        }

        input.close();
    }

    public static void verProdutos(Carrinho cart) {
        inventario.showInventory();
        int escolha = inputInt("Escolha algum produto para adicionar ao carrinho: ");
        if (escolha == 0) {
            return;
        }

        Product prototipo = inventario.getProduct(escolha);
        if (prototipo == null) {
            return;
        }

        Product item = prototipo.clone();

        if (item instanceof Shirt) {
            Shirt shirt = (Shirt) item;
            String cor = inputStr("Cor: ");
            String tamanho = inputStr("Tamanho: ");

            shirt.setColor(cor);
            shirt.setSize(tamanho);

            Product camisaDecorada = shirt;

            System.out.println("Deseja adicionar extras?");
            System.out.println("1. Estampa (+15)");
            System.out.println("2. Gola Polo (+10)");
            System.out.println("0. Nenhum");
            int extra = inputInt("Escolha: ");

            if (extra == 1) {
                camisaDecorada = new EstampaDecorator(camisaDecorada);
            } 
            else if (extra == 2) {
                camisaDecorada = new GolaPoloDecorator(camisaDecorada);
            }

            cart.addProduct(camisaDecorada);
            //cart.addProduct(shirt);
        }
    }

    public static int inputInt(String msg) {
        System.out.print(msg);
        int numero = input.nextInt();
        return numero;
    }

    public static String inputStr(String msg) {
        System.out.print(msg);
        String texto = input.next();
        return texto;
    }
}
