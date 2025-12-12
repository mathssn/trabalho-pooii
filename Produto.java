public interface Produto {
    
    String getNome();
    void setPreco(double preco);
    double getPreco();
    Produto clone();
    void setMarca(String marca);
    String getMarca();
    
}
