import java.util.ArrayList;
import java.util.Scanner;

public class HandleOrders {
    private ArrayList<CustomPizza> customPizzas;

    public HandleOrders() {
        customPizzas = new ArrayList<>();
    }

    public void processOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to order a custom pizza? (yes/no)");
        String response = scanner.nextLine();

        if ("yes".equalsIgnoreCase(response)) {
            StringBuilder customPizzaToppings = new StringBuilder();
            double customPizzaPrice = 10;

            System.out.println("Available toppings: Pepperoni, Mushrooms, Onions, Sausage, Olives");
            System.out.println("Enter toppings one by one. Type 'done' when finished.");

            while (true) {
                String topping = scanner.nextLine();
                if ("done".equalsIgnoreCase(topping)) {
                    break;
                }
                customPizzaToppings.append(topping).append(", ");
                customPizzaPrice += 2; 
            }

            if (customPizzaToppings.length() > 0) {
                customPizzaToppings.delete(customPizzaToppings.length() - 2, customPizzaToppings.length());
            }

            CustomPizza pizza = new CustomPizza(customPizzaToppings.toString(), customPizzaPrice);
            customPizzas.add(pizza);
            System.out.println("Custom pizza added to the order.");
        } else {
            System.out.println("No custom pizza ordered.");
        }
        scanner.close();
    }

    public ArrayList<CustomPizza> getCustomPizzas() {
        return customPizzas;
    }
    public void displayCustomPizzas() {
        for (CustomPizza pizza : customPizzas) {
            System.out.println(pizza);
        }
    }

    public static void main(String[] args) {
        HandleOrders orderHandler = new HandleOrders();
        orderHandler.processOrder();
        ArrayList<CustomPizza> pizzas = orderHandler.getCustomPizzas();
        for (CustomPizza pizza : pizzas) {
            System.out.println(pizza);
        }
    
    orderHandler.displayCustomPizzas();
    }
}    