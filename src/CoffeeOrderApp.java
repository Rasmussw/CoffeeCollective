import products.*;
import ui.*;

public class CoffeeOrderApp {
    public static void main(String[] args) {
        //Currently everything is in main... Hmm maybe someone should fix this? Maybe if one had a pattern to follow
        //Could be a pattern to "control" the flow of execution
        OrderTakingMenu orderMenu = new OrderTakingMenu();
        StatisticsMenu statisticsMenu = new StatisticsMenu();

        orderMenu.welcomeUser();
        int userInput;
        CustomerBasket currentCustomer = new CustomerBasket();
        do{
            orderMenu.printOptions();
            userInput = orderMenu.receiveUserInput();
            switch(userInput){
                case 1:
                    currentCustomer.addToAmericano(new Americano());
                    System.out.println("added a americano");
                    break;
                case 2:
                    currentCustomer.addToEspresso(new Espresso());
                    System.out.println("added a espresso");
                    break;
                case 3:
                    currentCustomer.addToTea(new Tea());
                    System.out.println("added a Tea");
                    break;
                case 4:
                    currentCustomer.addToCroissant(new Croissant());
                    System.out.println("added a croissant");
                    break;
                case 5:
                    currentCustomer.addToBaguette(new Baguette());
                    System.out.println("added a baguette");
                    break;
                case 6:
                    statisticsMenu.printStatisticsChoice();
                    statisticsMenu.receiveUserInput();
                    break;
            }
        }while(userInput != 9);
    }
}
