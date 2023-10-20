package burgerbillgenerator;

import java.util.Scanner;

public class BurgerBillGenerator {

    public static void main(String[] args) {
        //All prices are counted in euros €.
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Burgeria! Please enter your order.\n");
        System.out.println("Your option is: 1. Simple Burger 4€ (beef patty, cheese, ketchup, pickles)\n");
        System.out.println("Your other option is: 2. Double Burger 6€ (double beef patty, cheese, ketchup, pickles)\n");
        System.out.println("Your other option is: 3. Deluxe Burger 7€ (double beef patty, cheese, ketchup, bacon, egg, iceberg)\n");
        System.out.println("Would you like a simple burger for 4€? (yes/no)\n");
        String answer = in.next();
        DoubleBurger ingredientsDoubleBurger = null;
        DeluxeBurger ingredientsDeluxeBurger = null;
        if (answer.equals("no") || answer.equals("No") || answer.equals("NO")) {
            System.out.println("Would you like a double burger for 6€ (yes/no)");
            String answer2 = in.next();
            if (answer2.equals("yes") || answer2.equals("Yes") || answer2.equals("YES")) {
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
                String extraFries = in.next();
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
                String choice = in.next();
                if (choice.equals("yes") || choice.equals("Yes") || choice.equals("YES")) {
                    System.out.println("What ingredient would you like to remove? (1,2,3)");
                    System.out.println("1. Ketcup.");
                    System.out.println("2. Cheese.");
                    System.out.println("3. Pickles.");
                    String removechoice = in.next();
                    if (removechoice.equals("1")) {
                        System.out.println("Ketchup removed.");
                    } else if (removechoice.equals("2")) {
                        System.out.println("Cheese removed.");
                    } else {
                        System.out.println("Pickles removed.");
                    }

                }
            }
            if (ingredientsDoubleBurger != null) {
                ingredientsDoubleBurger.getDoubleBurgerBill();
            }
        }

        Burger ingredientsBurger = null;

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
            String extraFries = in.next();
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
            String choice = in.next();
            if (choice.equals("yes") || choice.equals("Yes") || choice.equals("YES")) {
                System.out.println("What ingredient would you like to remove? (1,2,3)");
                System.out.println("1. Ketcup.");
                System.out.println("2. Cheese.");
                System.out.println("3. Pickles.");
                String removechoice = in.next();
                if (removechoice.equals("1")) {
                    System.out.println("Ketchup removed.");
                } else if (removechoice.equals("2")) {
                    System.out.println("Cheese removed.");
                } else {
                    System.out.println("Pickles removed.");
                }
            }
            if (ingredientsBurger != null) {
                ingredientsBurger.getBill();
            }
        } else {
            System.out.println("Would you like a deluxe burger for 7.50 € (yes/no)?");
            String answerdeluxe = in.next();
            if (answerdeluxe.equals("yes") || answer.equals("Yes") || answer.equals("YES")) {
                System.out.println("You chose a deluxe burger.");
                ingredientsDeluxeBurger = new DeluxeBurger(true);

                System.out.println("Would you like extra bacon? (yes/no) ");
                String extraBacon = in.next();
                if (extraBacon.equals("yes") || extraBacon.equals("Yes") || extraBacon.equals("YES")) {
                    System.out.println("Extra bacon added +0.40€");
                    ingredientsDeluxeBurger.addExtraBacon();
                }

                System.out.println("Would you like extra cheese? (yes/no) ");
                String extraCheese = in.next();
                if (extraCheese.equals("yes") || extraCheese.equals("Yes") || extraCheese.equals("YES")) {
                    System.out.println("Extra cheese added +0.20€");
                    ingredientsDeluxeBurger.addExtraCheese();
                }

                System.out.println("Would you like extra egg? (yes/no) ");
                String extraEgg = in.next();
                if (extraEgg.equals("yes") || extraEgg.equals("Yes") || extraEgg.equals("YES")) {
                    System.out.println("Extra egg added +0.50€");
                    ingredientsDeluxeBurger.addExtraEgg();
                }
                System.out.println("Would you like extra iceberg? (yes/no) ");
                String extraIceberg = in.next();
                if (extraIceberg.equals("yes") || extraIceberg.equals("Yes") || extraIceberg.equals("YES")) {
                    System.out.println("Extra iceberg added +0.20€");
                    ingredientsDeluxeBurger.addExtraIceberg();
                }
                System.out.println("Would you like extra fries?( yes/no) ");
                String extraFries = in.next();
                if (extraFries.equals("yes") || extraFries.equals("Yes") || extraFries.equals("YES")) {
                    System.out.println("Extra fries added +1.50€");
                    ingredientsDeluxeBurger.addExtraFries();
                }

                System.out.println("Would you prefer your order to be delivered? (yes/no) ");
                String delivery = in.next();
                if (delivery.equals("yes") || delivery.equals("Yes") || delivery.equals("YES")) {
                    System.out.println("Delivery price is +0.50€.");
                    ingredientsDeluxeBurger.addDeliveryPrice();
                }
                if (ingredientsDeluxeBurger != null) {
                    ingredientsDeluxeBurger.getDeluxeBurgerBill();
                }

                System.out.println("Would you like to remove one of the preselected ingredients? (cheese, ketchup, bacon, egg, iceberg)");
                String choicedeluxe = in.next();
                if (choicedeluxe.equals("yes") || choicedeluxe.equals("Yes") || choicedeluxe.equals("YES")) {
                    System.out.println("What ingredient would you like to remove? (1,2,3)");
                    System.out.println("1. Ketcup.");
                    System.out.println("2. Cheese.");
                    System.out.println("3. Iceberg.");
                    System.out.println("4. Bacon");
                    System.out.println("5. Egg");
                    String removechoicede = in.next();
                    if (removechoicede.equals("1")) {
                        System.out.println("Ketchup removed.");
                    } else if (removechoicede.equals("2")) {
                        System.out.println("Cheese removed.");
                    } else if (removechoicede.equals("3")) {
                        System.out.println("Iceberg removed.");
                    } else if (removechoicede.equals("4")) {
                        System.out.println("Bacon removed.");
                    } else {
                        System.out.println("Egg removed.");
                    }

                }

            }

        }
    }
}
