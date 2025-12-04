import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Cart cart = new Cart();
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
            }
        }

        input.close();
    }
}
