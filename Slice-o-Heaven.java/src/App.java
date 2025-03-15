public class App {
    public static void main(String[] args) throws Exception {

        Slice_o_Heaven PIZZA = new Slice_o_Heaven("DEF-SOH-099", "Mozzarella Cheese", 15.00);
        PIZZA.takeOrder();
       
        Slice_o_Heaven offer = new Slice_o_Heaven("Hawaiian pizza", "chips ", 39.90);
        offer.specialOfTheDay("Hawaiian pizza", "chips ", "39.9 yuan");
        System.out.println(PIZZA.toString());
    }
}