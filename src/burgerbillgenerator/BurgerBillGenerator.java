package burgerbillgenerator;

import java.util.Scanner;

public class BurgerBillGenerator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like a simple burger?(yes/no)");
        String answer = in.next();
        Burger ingredientsBurger = null;
        DoubleBurger ingredientsDoubleBurger = null;
        if (answer.equals("no")) {
            System.out.println("Would you like a double burger(yes/no)");
            String answer2 = in.next();
            if (answer2.equals("no")) {
                System.out.println("Invalid Answer.");
            } else {
                ingredientsDoubleBurger = new DoubleBurger(true);
                System.out.println("Would you like extra bacon?(yes/no)");
                String extraBacon = in.next();
                if (extraBacon.equals("yes") && ingredientsDoubleBurger != null) {
                    ingredientsDoubleBurger.addExtraBacon();
                }

                System.out.println("Would you like extra cheese?(yes/no)");
                String extraCheese = in.next();
                if (extraCheese.equals("yes") && ingredientsDoubleBurger != null) {
                    ingredientsDoubleBurger.addExtraCheese();
                }

                System.out.println("Would you like extra pickles?(yes/no");
                String extraPickles = in.next();
                if (extraPickles.equals("yes") && ingredientsDoubleBurger != null) {
                    ingredientsDoubleBurger.addExtraPickles();
                }
                System.out.println("Would you prefer your order to be delivered?");
                String takeAway = in.next();
                if (takeAway.equals("yes") && ingredientsBurger != null) {
                    ingredientsDoubleBurger.takeAway();
                }
                
            }
            ingredientsDoubleBurger.getDoubleBurgerBill();
        }

        if (answer.equals("yes")) {
            ingredientsBurger = new Burger(true);

            System.out.println("Would you like extra bacon?(yes/no)");
            String extraBacon = in.next();
            if (extraBacon.equals("yes") && ingredientsBurger != null) {
                ingredientsBurger.addExtraBacon();
            }

            System.out.println("Would you like extra cheese?(yes/no)");
            String extraCheese = in.next();
            if (extraCheese.equals("yes") && ingredientsBurger != null) {
                ingredientsBurger.addExtraCheese();
            }

            System.out.println("Would you like extra pickles?(yes/no");
            String extraPickles = in.next();
            if (extraPickles.equals("yes") && ingredientsBurger != null) {
                ingredientsBurger.addExtraPickles();
            }
            System.out.println("Would you prefer your order to be delivered?");
            String takeAway = in.next();
            if (takeAway.equals("yes") && ingredientsBurger != null) {
                ingredientsBurger.takeAway();
            }
            ingredientsBurger.getBill();
        }

    }
}
