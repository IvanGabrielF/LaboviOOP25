package pckg_lab3;
// look at StringManager method

import java.util.Scanner;

public class NumberManager {

    public static void getUserNumber(Scanner scanner) {

        while (true) {
            System.out.println("Your keyboard input please - we are looking for at least one number: \t");
            String userInput = scanner.nextLine();
            System.out.println("You have entered: " + userInput);

            boolean hasNumber = checkForNumber(userInput, new Scanner(userInput));


            if (hasNumber) {
                System.out.println("There is a number in the user input!");

            } else {
                System.out.println("No number is in input!");
            }

            System.out.println("--------------------------------------------");
            System.out.println("Next input = y or exit = any other key?");
            String choice = scanner.nextLine().strip().toLowerCase();

            if (!choice.equals("y")) {
                System.out.println("Exit input testing!");
                break;
            } else {
                System.out.println("New input round!");
            }

        }
        System.out.println("Finfished using getuserNumber!");

    }

    private static boolean checkForNumber(String keyboardInput, Scanner stringScanner) {
        boolean hasNumber = false;

        while (stringScanner.hasNext()) {
            if (stringScanner.hasNextFloat()) {
                float num = stringScanner.nextFloat();
                hasNumber = true;

                if (num % 1 == 0.0) {
                    int number = (int) num;
                    System.out.println("Integer in the input: " + number);
                } else {
                    System.out.println("Floait in the input: " + num);
                }
                break;
            } else {
                System.out.println("Scanning next token in the input...");
                stringScanner.next();

            }
        }
        return hasNumber;


    }

}



















