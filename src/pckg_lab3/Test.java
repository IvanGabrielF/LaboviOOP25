package pckg_lab3;

import java.util.Scanner;

public class Test {
    // define only one Scanner -> final
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // StringManager test
        StringManager.readUserInput(scanner);

        // NumberManager test
        NumberManager.getUserNumber(scanner);

        // Do not change this
        System.out.println("Closing scanner!!!");
        scanner.close();
    }
}
