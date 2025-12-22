public class RoupaSocialFactory implements RoupaFactory {

    CamisaSocial prototipoCamisa = new CamisaSocial("preta", 30.0, "Algodão");
    CalcaSocial prototipoCalca = new CalcaSocial("Branca", 30.0, "não sei");
    
    @Override
    public CamisaSocial criarCamisa() {
      return prototipoCamisa.clone();
    }

    @Override
    public CalcaSocial criarCalca(){
        return prototipoCalca.clone();

    } 
}

