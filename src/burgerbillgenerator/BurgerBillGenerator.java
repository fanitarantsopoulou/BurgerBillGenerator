package burgerbillgenerator;

import java.util.Scanner;

public class BurgerBillGenerator {

    public static void main(String[] args) {
        //All prices are counted in euros €.
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Burgeria!");
        System.out.println("Your option is: 1. Simple Burger 4€ (beef patty, cheese, ketchup, pickles)");
        System.out.println("Your other option is: 2. Double Burger 6€ (double beef patty, cheese, ketchup, pickles)");
        System.out.println("Your other option is: 3. Deluxe Burger 7€ (double beef patty, cheese, ketchup, bacon, egg, iceberg");
        System.out.println("Would you like a simple burger for 4€? (yes/no)");
        String answer = in.next();
        Burger ingredientsBurger = null;
        DoubleBurger ingredientsDoubleBurger = null;
        if (answer.equals("no") || answer.equals("No") || answer.equals("NO")) {
            System.out.println("Would you like a double burger for 6€ (yes/no)");
            String answer2 = in.next();
            if(answer2.equals("yes")|| answer2.equals("Yes")||answer2.equals("YES")) {
                System.out.println("You have chose a double burger. Please select your preffered ingredients.");
                ingredientsDoubleBurger = new DoubleBurger(true);
                
                System.out.println("Would you like extra bacon? (yes/no) ");
                String extraBacon = in.next();
                if (extraBacon.equals("yes") || extraBacon.equals("Yes") || extraBacon.equals("YES")) {
                    System.out.println("Extra bacon added +0.40€");
                    ingredientsDoubleBurger.addExtraBacon();
                }

                System.out.println("Would you like extra cheese? (yes/no) ");
                String extraCheese = in.next();
                if (extraCheese.equals("yes") || extraCheese.equals("Yes") || extraCheese.equals("YES")) {
                    System.out.println("Extra cheese added +0.20€");
                    ingredientsDoubleBurger.addExtraCheese();
                }

                System.out.println("Would you like extra pickles?( yes/no) ");
                String extraPickles = in.next();
                if (extraPickles.equals("yes") || extraPickles.equals("Yes") || extraPickles.equals("YES")) {
                    System.out.println("Extra pickles added +0.30€");
                    ingredientsDoubleBurger.addExtraPickles();
                }
                
                System.out.println("Would you like extra fries?( yes/no) ");
                String extraFries=in.next();
                if (extraFries.equals("yes") || extraFries.equals("Yes") || extraFries.equals("YES")) {
                    System.out.println("Extra fries added +1.50€");
                    ingredientsDoubleBurger.addExtraFries();
                }
                
                System.out.println("Would you prefer your order to be delivered? (yes/no) ");
                String delivery = in.next();
                if (delivery.equals("yes") || delivery.equals("Yes") || delivery.equals("YES")) {
                    System.out.println("Delivery price is +0.50€.");
                    ingredientsDoubleBurger.addDeliveryPrice();
                }
                System.out.println("Would you like to remove one of the preselected ingredients? (cheese, ketchup, pickles)");
                String choice=in.next();
                if (choice.equals("yes")|| choice.equals("Yes")|| choice.equals("YES")){
                    System.out.println("What ingredient would you like to remove? (1,2,3)");
                    System.out.println("1. Ketcup.");
                    System.out.println("2. Cheese.");
                    System.out.println("3. Pickles.");
                    String removechoice=in.next();
                    if (removechoice.equals("1")){
                        System.out.println("Ketchup removed.");
                    }
                    else if(removechoice.equals("2")){
                        System.out.println("Cheese removed.");
                    }
                    else{
                        System.out.println("Pickles removed.");
                    }
                 
                }
            }
            if (ingredientsDoubleBurger!=null){
            ingredientsDoubleBurger.getDoubleBurgerBill();
            }
        }

        if (answer.equals("yes") || answer.equals("Yes") || answer.equals("YES")) {
            System.out.println("You chose a simple burger. Please select yout preffered ingredients.");
            ingredientsBurger = new Burger(true);

            System.out.println("Would you like extra bacon? (yes/no) ");
            String extraBacon = in.next();
            if (extraBacon.equals("yes") || extraBacon.equals("Yes") || extraBacon.equals("YES")) {
                System.out.println("Extra bacon added +0.40€");
                ingredientsBurger.addExtraBacon();
            }

            System.out.println("Would you like extra cheese? (yes/no) ");
            String extraCheese = in.next();
            if (extraCheese.equals("yes") || extraCheese.equals("Yes") || extraCheese.equals("YES")) {
                System.out.println("Extra cheese added +0.20€");
                ingredientsBurger.addExtraCheese();
            }

            System.out.println("Would you like extra pickles? (yes/no) ");
            String extraPickles = in.next();
            if (extraPickles.equals("yes") || extraPickles.equals("Yes") || extraPickles.equals("YES")) {
                System.out.println("Extra pickles added +0.30€");
                ingredientsBurger.addExtraPickles();
            }
            
             System.out.println("Would you like extra fries?( yes/no) ");
                String extraFries=in.next();
                if (extraFries.equals("yes") || extraFries.equals("Yes") || extraFries.equals("YES")) {
                    System.out.println("Extra fries added +1.50€");
                    ingredientsBurger.addExtraFries();
                }
                
            System.out.println("Would you prefer your order to be delivered? (yes/no) ");
            String delivery = in.next();
            if (delivery.equals("yes") || delivery.equals("Yes") || delivery.equals("YES")) {
                System.out.println("Delivery price is +0.50€.");
                ingredientsBurger.addDeliveryPrice();
            }
            
            System.out.println("Would you like to remove one of the preselected ingredients? (cheese, ketchup, pickles)");
                String choice=in.next();
                if (choice.equals("yes")|| choice.equals("Yes")|| choice.equals("YES")){
                    System.out.println("What ingredient would you like to remove? (1,2,3)");
                    System.out.println("1. Ketcup.");
                    System.out.println("2. Cheese.");
                    System.out.println("3. Pickles.");
                    String removechoice=in.next();
                    if (removechoice.equals("1")){
                        System.out.println("Ketchup removed.");
                    }
                    else if(removechoice.equals("2")){
                        System.out.println("Cheese removed.");
                    }
                    else{
                        System.out.println("Pickles removed.");
                    }
                }
            ingredientsBurger.getBill();
       
        }
        if (answer.equals("no") || answer.equals("No") || answer.equals("NO")){
            System.out.println("Would you like a deluxe Burger?");
            String answerdeluxe=in.next();
            if (answerdeluxe.equals("yes") || answer.equals("Yes") || answer.equals("YES")){
                System.out.println("You chose a deluxe burger.");
            }
            
        }

    }
}
