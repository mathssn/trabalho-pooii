public class Shirt implements Product {
    
    private String size;
    private String color;
    private double price;

    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String getNome() {
        return "Camisa " + color + " " + size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Shirt clone() {
        return new Shirt(size, color, price);
    }
}
