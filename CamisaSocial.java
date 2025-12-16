
public class CamisaSocial extends Camisa {

    private String tecido;

    public CamisaSocial (String cor, double preco, String tecido){
        super(cor, preco);
        this.tecido = tecido;
    }

    @Override
    public String getNome() {
        return "Camisa Social (" + tecido + ") " + getCor() + " R$ " + getPreco();
    }

    @Override
    public CamisaSocial clone() {
        return new CamisaSocial(getCor(), getPreco(), tecido);
    }

}



