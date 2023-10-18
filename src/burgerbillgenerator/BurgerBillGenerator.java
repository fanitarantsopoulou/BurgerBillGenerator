package burgerbillgenerator;

import java.util.Scanner;

public class BurgerBillGenerator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like a simple burger for 4€? (yes/no)");
        String answer = in.next();
        Burger ingredientsBurger = null;
        DoubleBurger ingredientsDoubleBurger = null;
        if (answer.equals("no") || answer.equals("No") || answer.equals("NO")) {
            System.out.println("Would you like a double burger for 6€ (yes/no)");
            String answer2 = in.next();
            System.out.println("You have chose a double burger. Please select your preffered ingredients.");
            if (answer2.equals("no")) {
                System.out.println("You have to choose either a simple or  a double burger.");
            } else {
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
                
                System.out.println("Would you prefer your order to be delivered? (yes/no) ");
                String delivery = in.next();
                if (delivery.equals("yes") || delivery.equals("Yes") || delivery.equals("YES")) {
                    System.out.println("Delivery price is +0.50€.");
                    ingredientsDoubleBurger.addDeliveryPrice();
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
            System.out.println("Would you prefer your order to be delivered? (yes/no) ");
            String delivery = in.next();
            if (delivery.equals("yes") || delivery.equals("Yes") || delivery.equals("YES")) {
                System.out.println("Delivery price is +0.50€.");
                ingredientsBurger.addDeliveryPrice();
            }
            
            ingredientsBurger.getBill();
       
        }

    }
}
