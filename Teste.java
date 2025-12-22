public class Teste {

    public static void main(String[] args) {
        
        RoupaSocialFactory socialFactory = new RoupaSocialFactory();

        CamisaSocial camisa = socialFactory.criarCamisa();
        camisa.setCor("Vermelho");

        Produto camisaComGola = new GolaPoloDecorator(camisa);
        System.out.println(camisaComGola.getNome());

    }
    
}
