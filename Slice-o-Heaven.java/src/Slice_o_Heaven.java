public class Slice_o_Heaven {
    public String storeAddress;

    private String storemenu;

    public String storeHours;
    public long storePhoneNumber;
    public String storeEmail;
    public String storeWebsite;
    public String pizaaname;
    public String sides;
    public String pizzaIngredients;

    private String orderID;
    private String orderDetails;
    private String orderStatus;
    private double orderTotal;

    public void takeOrder(String id, String details, double total){
        orderID = id;
        orderDetails = details;
        orderTotal = total;

        System.out.println("Order accepted!");

        System.out.println("Order is being prepared");
    
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!");

    


    }
    public void makepizza(String id, String details, double total){
        orderID = id;
        orderDetails = details;
        orderTotal = total;
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }
    
        System.out.println("Your pizza is ok!");

        printReceipt();
    }

    private void printReceipt(){
        System.out.println("********RECEIPT********");

        System.out.println("Order ID: " + orderID);
        System.out.println("Order Details: " + orderDetails);
        System.out.println("Order Total: " + orderTotal);
    }
    
}
