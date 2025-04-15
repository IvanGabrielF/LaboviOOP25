package pckg_lab1;// uvezite Scanner
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        // definirajte objekt tipa Scanner
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter car type: ");
        // osiguraje unos za tip automibla
        String carType = scanner.nextLine();

        System.out.println("Enter car odometer: ");
        // osigurajte unos kilometraže
        long odometer = scanner.nextLong();

        // kreirajte objekt klase Car s unesenim vrijednostima
        Car car1 = new Car(carType, odometer);

        // pokrenite metodu info
        car1.info();

        System.out.println("Enter car odometer update value: ");
        // osigurajte unos nove prevaljene kilometraže
        long updateValue = scanner.nextLong();

        // pozovite metodu updateOdom
        car1.updateOdom(updateValue);

        // pozovite opet metodu info
        car1.info();

        // zatvorite scanner
        scanner.close();


    }
}