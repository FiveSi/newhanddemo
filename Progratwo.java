import java.util.Random;
import java.util.Scanner;

public class Progratwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guest Number 0 to 100?");
        Random guNu = new Random(); 
        int randomNumber = guNu.nextInt(101);
        int nAn = 100;
        int nBn =  0;
        while (true) {
            int uNu = scanner.nextInt();

            if (uNu == randomNumber ) {
                System.out.println("BINGO");
                break;
            };
            if (uNu > randomNumber) {
                    if (uNu < nAn) {
                        nAn = uNu;
                    }
                System.out.println("The number range is :" + nBn + " to " +  nAn );
            };
            if (uNu < randomNumber) {
                if (uNu > nBn) {
                    nBn = uNu;
                }
                System.out.println("The number range is :" + nBn + " to " +  nAn );
            };
          }
    }
}
