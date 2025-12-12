public class RoupaSocialFactory implements RoupaFactory {
    @Override
    public Produto criarCamisa() {
        return new CamisaSocial("M", "Branca", 120, "Calvin Klein", "Algodão");
    }
}

