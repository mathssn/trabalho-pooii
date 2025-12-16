
public class CalcaSocial extends Calca {

    private String tecido;

    public CalcaSocial(String cor, double preco, String tecido) {
        super(cor, preco);
        this.tecido = tecido;
    }

    @Override
    public String getNome() {
        return "Calça Social (" + tecido + ") " + getCor() + " R$ " + getPreco();
    }

    @Override
    public CalcaSocial clone() {
        return new CalcaSocial(getCor(), getPreco(), tecido);
    }
    
}
