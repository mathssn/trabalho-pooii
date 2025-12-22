public abstract class Calca implements Produto {
    
    private String cor;
    private double preco;

    public Calca(String cor, double preco) {
        this.cor = cor;
        this.preco = preco;
    }

    public abstract String getNome();
    public abstract Calca clone();
    
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
