import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
enum PizzaSelection{
    PEPPERONI("Pepperoni", "Lots of pepperoni and extra cheese", 18),
    HAWAIIAN("Hawaiian", "Pineapple, ham, and extra cheese", 22),
    VEGGIE("Veggie", "Green pepper, onion, tomatoes, mushroom, and black olives", 25),
    BBQ_CHICKEN("BBQ Chicken", "Chicken in BBQ sauce, bacon, onion, green pepper, and cheddar cheese", 35),
    EXTRAVAGANZA("Extravaganza", "Pepperoni, ham, Italian sausage, beef, onions, green pepper, mushrooms, black olives, and extra cheese", 45);
    private final String pizzaName;
    private final String pizzaToppings;
    private final int price;
    PizzaSelection(String pizzaName, String pizzaToppings, int price) {
        this.pizzaName = pizzaName;
        this.pizzaToppings = pizzaToppings;
        this.price = price;
    }
    public String getPizzaName() {
        return pizzaName;
    }
    public String getPizzaToppings() {
        return pizzaToppings;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Pizza: " + pizzaName +", Toppings: " + pizzaToppings + ", Price: $" + price;
    }
}
enum PizzaToppings{
    HAM("Ham", 2), 
    PEPPERONI("Pepperoni" ,2),
    BEEF("Beef", 2),
    CHICKEN("Chicken", 2), 
    SAUSAGE("Sausage", 2),
    PINEAPPLE("Pineapple", 1),
    ONION("Onion", 0.5), 
    TOMATOES("Tomatoes", 0.4), 
    GREEN_PEPPER("Green Pepper", 0.5), 
    BLACK_OLIVES("Black Olives", 0.5), 
    SPINACH("Spinach", 0.5), 
    CHEDDAR_CHEESE("Cheddar Cheese", 0.8), 
    MOZZARELLA_CHEESE("Mozzarella Cheese", 0.8), 
    FETA_CHEESE("Feta Cheese", 1), 
    PARMESAN_CHEESE("Parmesan Cheese", 1);  
    private final String topping;
    private final double toppingPrice;
        PizzaToppings(String topping, double toppingPrice) {
            this.topping = topping;
            this.toppingPrice = toppingPrice;
    }
    public String getTopping() {
        return topping;
    }
    public double getToppingPrice() {
        return toppingPrice;
    }
    @Override
    public String toString() {
        return "Topping: " + topping + ", Price: $" + toppingPrice;
    }
}
enum PizzaSize{
    LARGE("Large", 10), 
    MEDIUM("Medium", 5),
    SMALL("Small", 0);
    private final String pizzaSize;
    private final double addToPizzaPrice;
    PizzaSize(String pizzaSize, double addToPizzaPrice) {
        this.pizzaSize = pizzaSize;
        this.addToPizzaPrice = addToPizzaPrice;
    }
    public String getPizzaSize() {
        return pizzaSize; 
    }
    public double getAddToPizzaPrice() {
        return addToPizzaPrice; 
    }
    @Override
    public String toString() {
        return "Pizza Size: " + pizzaSize + ", Price: $" + addToPizzaPrice;
    }
}
enum SideDish{
    CALZONE("Calzone", 15), 
   CHICKEN_PUFF("Chicken Puff", 20),
    MUFFIN("Muffin", 12),
    NOTHING("No side dish", 0);
    private final String  sideDishName;
    private final double addToPizzaPrice;
    SideDish(String sideDishName, double addToPizzaPrice) {
        this.sideDishName = sideDishName;
        this.addToPizzaPrice = addToPizzaPrice;

    }
    public String getSideDishName() {
        return sideDishName; 
    }
    public double getAddToPizzaPrice() {
        return addToPizzaPrice;
    }
    @Override
    public String toString() {
        return "Side Dish: " + sideDishName + ", Price: $" + addToPizzaPrice;
    }

}
enum Drinks{
    COCA_COLA("Coca Cola", 8), 
   COCOA_DRINK("Cocoa Drink", 10),
    NOTHING("No drinks", 0);
    private final String  drinkName;
    private final double addToPizzaPrice;
    Drinks(String drinkName, double addToPizzaPrice) {
        this.drinkName = drinkName;
        this.addToPizzaPrice = addToPizzaPrice; 

    }
    public String getDrinkName() {
        return drinkName; 
    }
    public double getAddToPizzaPrice() {
        return addToPizzaPrice;
    }
    @Override
    public String toString() {
        return "Drink: " + drinkName + ", Price: $" + addToPizzaPrice;
    }
}


public class Slice_o_Heaven {
    public  final double  PIZZA_BASE_PRICE=10.0;
    private static final int MAX_TOPPINGS = 10;
    String[] pizzasOrdered = new String[10];
    String[] pizzaSizesOrdered = new String[10];
    String[] sideDishesOrdered = new String[20];
    String[] drinksOrdered = new String[20];
    private int pizzaIndex = 0;
    private double totalOrderPrice = 0;
    private int drinkIndex = 0;
    private int sideDishIndex = 0; 

 
 
   
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
    private double orderTotal=15.00;
    private final String DEF_ORDER_ID="DEF-SOH-099";
    private final String DEF_PIZZA_INGREDIENTS="Mozzarella Cheese";
    private final double DEF_ORDER_TOTAL=15.00;

  
    
    public Slice_o_Heaven(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }
    public String getorderID() {
        return this.orderID;
    }
    public void setorderID(String orderID) {
        this.orderID = orderID;
    }
    public String getorderDetails() {
        return this.orderDetails;
    }
    public void setorderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }
    public String getorderStatus() {
        return this.orderStatus;
    }
    public void setorderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public double getorderTotal() {
        return this.orderTotal;
    }
    public void setorderTotal(double orderTotal) {
       
        this.orderTotal = orderTotal;
    }
    public void processCardPayment(String cardNumber, String expiryDate, int cvv,String blacklistedNumber) {

        int cardLength = cardNumber.length();
        if (cardLength == 14) {
           
                        if (cardNumber.equals(blacklistedNumber)) {
                System.out.println("Card is blacklisted, Please use another card");
                return;
            }
            System.out.println("Card accepted");
        } else {
            System.out.println("Invalid card");
        }
        String firstCharStr = cardNumber.substring(0, 1);
        String lastfourCharStr = cardNumber.substring(cardNumber.length() - 4);
        int lastfourCardDigit = Integer.parseInt(lastfourCharStr);
        StringBuilder maskedPart = new StringBuilder();
        for (int i = 0; i < cardLength - 5; i++) {
            maskedPart.append('*');
        }
        String cardNumberToDisplay = firstCharStr + maskedPart + lastfourCardDigit;
   
    


    
        System.out.println("Processing card payment...");
        System.out.println("Card number: " + cardNumber);
        System.out.println("Expiry date: " + expiryDate);
        System.out.println("CVV: " + cvv);
        System.out.println("Payment processed successfully!");
    }
    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        StringBuilder message = new StringBuilder();
        message.append("The special offer information of the day is as follows:\n");
        message.append("The pizza of the day:").append(pizzaOfTheDay).append("\n");
        message.append("The side dish of the day:").append(sideOfTheDay).append("\n");
        message.append("Special price:").append(specialPrice);
        System.out.println(message.toString());
    }

        

    public void Order() {
        this.orderID = DEF_ORDER_ID;
        this.orderDetails = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = "None";

    }  
    public void isItYourBirthday(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birthdate (YYYY-MM-DD): ");
        
        String birthdate = input.nextLine();
        int year = Integer.parseInt(birthdate.substring(0, 4));
        int month = Integer.parseInt(birthdate.substring(5, 7));
        int day = Integer.parseInt(birthdate.substring(8, 10));

        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(dob, now);

        
        System.out.println("You are " + diff.getYears() + " years old.");
 
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Is it your birthday? (Y/N)");
            String answer = scanner.nextLine();
            if (answer.equals("Y")) {
                if(diff.getYears() >= 18){
                    System.out.println("Congratulations! You get a 50% discount on your order.");
                    this.orderTotal = this.orderTotal * 0.5;
                }
                else{
                    System.out.println("Sorry, you are not old enough to get our 50% discount.");
                }
            }
            if (answer.equals("N")) {
                System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
            }
        }
        if(diff.getYears() >= 120||diff.getYears() <= 5){
            System.out.println("nvalid date. You are either too young or too dead to order. Please enter a valid date:");
            
        }
        input.close(); 
    }
    public void makeCardPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your card number:");
        String cardNumber = scanner.nextLine(); 
        System.out.println("Enter your expiration date (MM/YY):");
        String expirationDate = scanner.nextLine();


    }
    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        boolean continueOrdering = true;

        while (continueOrdering) {
            // 显示菜单
            System.out.println("Welcome to Slice - o - Heaven Pizzeria. Here’s what we serve:");
            int option = 1;
            for (PizzaSelection pizza : PizzaSelection.values()) {
                System.out.println(option + ". " + pizza);
                option++;
            }
            System.out.println(option + ". Custom Pizza with a maximum of 10 toppings that you choose");

            System.out.print("Please enter your choice (1 - " + option + "): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            String pizzaDescription;
            double pizzaPrice;

            if (choice >= 1 && choice <= 5) {
                PizzaSelection selectedPizza = PizzaSelection.values()[choice - 1];
                pizzaDescription = selectedPizza.toString();
                pizzaPrice = selectedPizza.getPrice();
            } else if (choice == 6) {
                // 显示所有配料
                System.out.println("Available toppings:");
                for (PizzaToppings topping : PizzaToppings.values()) {
                    System.out.println(topping.getTopping());
                }

                System.out.println("Please enter up to " + MAX_TOPPINGS + " toppings, separated by commas:");
                String toppingInput = scanner.nextLine();
                String[] chosenToppings = toppingInput.split(",");
                StringBuilder toppingList = new StringBuilder();
                pizzaPrice = PIZZA_BASE_PRICE;

                for (int i = 0; i < Math.min(chosenToppings.length, MAX_TOPPINGS); i++) {
                    String toppingName = chosenToppings[i].trim();
                    for (PizzaToppings topping : PizzaToppings.values()) {
                        if (topping.getTopping().equalsIgnoreCase(toppingName)) {
                            if (toppingList.length() > 0) {
                                toppingList.append(", ");
                            }
                            toppingList.append(topping.getTopping());
                            pizzaPrice += topping.getToppingPrice();
                            break;
                        }
                    }
                }

                pizzaDescription = "Custom Pizza with " + toppingList + ", for €" + pizzaPrice;
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            pizzasOrdered[pizzaIndex] = pizzaDescription;
            totalOrderPrice += pizzaPrice;

            // 选择披萨尺寸
            System.out.println("Available pizza sizes:");
            option = 1;
            for (PizzaSize size : PizzaSize.values()) {
                System.out.println(option + ". " + size.getPizzaSize() + ": €" + size.getAddToPizzaPrice());
                option++;
            }
            System.out.print("Please choose a pizza size (1 - " + (option - 1) + "): ");
            int sizeChoice = scanner.nextInt();
            scanner.nextLine();
            PizzaSize selectedSize = PizzaSize.values()[sizeChoice - 1];
            pizzaSizesOrdered[pizzaIndex] = selectedSize.getPizzaSize();
            totalOrderPrice += selectedSize.getAddToPizzaPrice();

            // 选择配菜
            System.out.println("Available side dishes:");
            option = 1;
            for (SideDish sideDish : SideDish.values()) {
                System.out.println(option + ". " + sideDish.getSideDishName() + ": €" + sideDish.getAddToPizzaPrice());
                option++;
            }
            System.out.print("Please choose a side dish (1 - " + (option - 1) + "): ");
            int sideDishChoice = scanner.nextInt();
            scanner.nextLine();
            SideDish selectedSideDish = SideDish.values()[sideDishChoice - 1];
        sideDishesOrdered[sideDishIndex++] = selectedSideDish.getSideDishName();
            totalOrderPrice += selectedSideDish.getAddToPizzaPrice();

            // 选择饮料
            System.out.println("Available drinks:");
            option = 1;
            for (Drinks drink : Drinks.values()) {
                System.out.println(option + ". " + drink.getDrinkName() + ": €" + drink.getAddToPizzaPrice());
                option++;
            }
            System.out.print("Please choose a drink (1 - " + (option - 1) + "): ");
            int drinkChoice = scanner.nextInt();
            scanner.nextLine();
            Drinks selectedDrink = Drinks.values()[drinkChoice - 1];
            drinksOrdered[drinkIndex++] = selectedDrink.getDrinkName();
            totalOrderPrice += selectedDrink.getAddToPizzaPrice();

            pizzaIndex++;

            System.out.print("Do you want to order more? (yes/no): ");
            String response = scanner.nextLine();
            continueOrdering = response.equalsIgnoreCase("yes");
        }
    

       
      

        System.out.println("Order accepted!");

        System.out.println("Order is being prepared");
    
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!");

    


    }

    public void sizeChoice(String size){
        System.out.println(" ”What size should your pizza be?\r\n" + //
                        " 1. Large\r\n" + //
                        " 2. Medium\r\n" + //
                        " 3. Small\r\n" + //
                        " Enter only one choice (1, 2, or 3):”");
 

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                size = "Large";
                break;
            case 2:
                size = "Medium";
                break;
            case 3:
                size = "Small";
                break;
            default:
                q();
                break;
            }
        System.out.println("”Do you want extra cheese (Y/N):”");
        String extraCheese = scanner.nextLine();
               
    }
    public void q(){
        sizeChoice(DEF_ORDER_ID);
    }
  
    public void sideDishChoice(String sideDish){
        System.out.println("”Following are the side dish that go well with your pizza:\r\n" + //
                        " 1. Calzone\r\n" + //
                        " 2. Garlic bread\r\n" + //
                        " 3. Chicken puff\r\n" + //
                        " 4. Muffin\r\n" + //
                        " 5. Nothing for me\r\n" + //
                        " What would you like? Pick one (1, 2, 3,…):”");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                sideDish = "Calzone";   
                break;    
            case 2:
                sideDish = "Garlic bread";
                break; 
            case 3:
                sideDish = "Chicken puff";
                break;   
            case 4:
                sideDish = "Muffin";
                break;
            case 5:
                sideDish = "Nothing for me";
                break;
        }
    }
    public void drinksChoice(String drinks){
        System.out.println(" ”Choose from one of the drinks below. We recommend Coca Cola:\r\n" + //
                        " 1. Coca Cola\r\n" + //
                        " 2. Cold coffee\r\n" + //
                        " 3. Cocoa Drink\r\n" + //
                        " 4. No drinks for me\r\n" + //
                        " Enter your choice:”" );

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                drinks = "Coca Cola";
                break; 
            case 2:
                drinks = "Cold coffee";
                break;
            case 3:
                drinks = "Cocoa Drink";
                break;
            case 4:
                drinks = "No drinks for me";
                break;
        }

    }

    @Override
    public  String toString() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Thank you for dining with Slice-o-Heaven Pizzeria. Your order details are as follows:\n");
        for (int i = 0; i < pizzaIndex; i++) {
            orderDetails.append(i + 1).append(". ").append(pizzasOrdered[i]).append("\n");
            orderDetails.append(pizzaSizesOrdered[i]).append(": €").append(getSizePrice(pizzaSizesOrdered[i])).append("\n");
            orderDetails.append(sideDishesOrdered[i]).append(": €").append(getSideDishPrice(sideDishesOrdered[i])).append("\n");
            orderDetails.append(drinksOrdered[i]).append(": €").append(getDrinkPrice(drinksOrdered[i])).append("\n");
        }
        orderDetails.append("ORDER TOTAL: €").append(totalOrderPrice);
        return orderDetails.toString();
    }

    private double getSizePrice(String size) {
        for (PizzaSize pizzaSize : PizzaSize.values()) {
            if (pizzaSize.getPizzaSize().equals(size)) {
                return pizzaSize.getAddToPizzaPrice();
            }
        }
        return 0;
    }
    private double getSideDishPrice(String sideDish) {
        for (SideDish dish : SideDish.values()) {
            if (dish.getSideDishName().equals(sideDish)) {
                return dish.getAddToPizzaPrice();
            }
        }
        return 0;
    }
    private double getDrinkPrice(String drink) {
            for (Drinks drinkOption : Drinks.values()) {
                if (drinkOption.getDrinkName().equals(drink)) {
                    return drinkOption.getAddToPizzaPrice();
            }
        }
        return 0;
    }
}
