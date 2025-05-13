package pckg_lab2;

// osigurati uvoz za Scanner
import java.util.Scanner;

public class MiscClass {


    public static void dayHrMins(){

        // Scanner
        Scanner scanner = new Scanner(System.in);


        // Poruka za unos minuta
        System.out.println("Please enter minutes: ");



        // Varijabla koja prima unios -> min
        int totalMin = scanner.nextInt();

        int days = totalMin / (24*60);
        int hours = (totalMin % (24*60)) /60;
        int minutes = totalMin % 60;



        // Ispis
        System.out.println("\nUneseno minuta: " + totalMin);
        System.out.println(days + " d: " + hours + " h : " + minutes + " m");





    }
}
