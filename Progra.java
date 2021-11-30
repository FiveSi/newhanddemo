import java.util.Random;
import java.util.Scanner;

public class Progra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guest?");
        Random guNu = new Random(); 
        int randomNumber = guNu.nextInt(101);

        while (true) {
            System.out.println(randomNumber);
            int uNu = scanner.nextInt();

            if (uNu == randomNumber ) {
                break;
            };
            if (uNu > randomNumber) {
                System.out.println("YOU GUEST IS BIGEST TRY SMALL NUMBER");
                
            };
            if (uNu < randomNumber) {
                System.out.println("YOU GUEST IS SMALLEST  TRY BIG NUMBER");
            };
            
        }
    }
}
