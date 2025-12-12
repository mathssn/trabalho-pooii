public class RoupaEsportivaFactory implements RoupaFactory{

    public Produto criarCamisa(){
        return new CamisaEsportiva("m", "branco", 50, "nike", "Dry fit");
    }
}
