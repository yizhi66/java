public class CustomPizza {
    private String toppings;
    private double price;
    public CustomPizza(String toppings, double price) {
        this.toppings = toppings;
        this.price = price;
    }
    public String gettoppings() {
        return toppings;
    }
    public void settoppings(String toppings) {
        this.toppings = toppings; 
    }
    public double getprice() {
        return price; 
    }
    public void setprice(double price) {
        this.price = price; 
    }
    @Override
    public String toString() {
        return "CustomPizza{" +
                "toppings='" + toppings + '\'' +
                ", price=" + price +
                '}';
    }
}
