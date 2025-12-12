
public class CamisaEsportiva extends Camisa {

    private String dryfit;

    public CamisaEsportiva (String tamanho, String cor, double preco, String marca, String dryfit){
        super(tamanho, cor, preco, marca);
        this.dryfit = dryfit;
    }

    @Override
    public String getNome() {
        return "Camisa Esportiva (" + dryfit + ") " + getMarca() + " R$ " + getPreco();
    }

    @Override
    public CamisaEsportiva clone() {
        return new CamisaEsportiva(getTamanho(), getCor(), getPreco(), getMarca(), dryfit);
    }

}
