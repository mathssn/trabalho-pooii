public class Camisa implements Produto {
    
    private String tamanho;
    private String cor;
    private double preco;
    private String marca;

    public Camisa(String tamanho, String cor, double preco, String marca) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
        this.marca = marca;
    }

    public void setSize(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setColor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getNome() {
        return "Camisa " + cor + " " + tamanho + " " + marca;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public Camisa clone() {
        return new Camisa(tamanho, cor, preco, marca);
    }

    public String getTamanho() {
        return tamanho;
    }
    
    public String getCor() {
        return cor;
    }


}
