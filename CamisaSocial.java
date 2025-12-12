
public class CamisaSocial extends Camisa {

    private String tecido;

    public CamisaSocial (String tamanho, String cor, double preco, String marca, String tecido){
        super(tamanho, cor, preco, marca);
        this.tecido = tecido;
    }

    @Override
    public String getNome() {
        return "Camisa Social (" + tecido + ") " + getMarca() + " R$ " + getPreco();
    }

    @Override
    public CamisaSocial clone() {
        return new CamisaSocial(getTamanho(), getCor(), getPreco(), getMarca(), tecido);
    }

}



