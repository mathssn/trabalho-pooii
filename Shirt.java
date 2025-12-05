public class Shirt implements Product {
    
    private String size;
    private String color;
    private double price;
    private String marca;

    public Shirt(String size, String color, double price, String marca) {
        this.size = size;
        this.color = color;
        this.price = price;
        this.marca = marca;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getNome() {
        return "Camisa " + color + " " + size + " " + marca;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
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
    public Shirt clone() {
        return new Shirt(size, color, price, marca);
    }
}
