public abstract class Camisa implements Produto {
    
    private String cor;
    private double preco;

    public Camisa(String cor, double preco) {
        this.cor = cor;
        this.preco = preco;
    }

    public abstract String getNome();
    public abstract Camisa clone();
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public double getPreco() {
        return preco;
    }
    
    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
