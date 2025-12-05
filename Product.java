public interface Product {
    
    String getNome();
    void setPrice(double price);
    double getPrice();
    Product clone();
    void setMarca(String marca);
    String getMarca();
    
}
