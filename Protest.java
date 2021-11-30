import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Protest {
     public static void main(String[] args) {
        // You can test the method here
        System.out.println("HANGMAN vsison 1.1");
        System.out.println("");
        System.out.println("          --------- ");
        System.out.println("         |         | ");
        System.out.println("         |        (_)");
        System.out.println("         |        /|\\ ");
        System.out.println("         |        / \\ ");
        System.out.println("         |  ");
        System.out.println("       -----  ");
        System.out.println("DO YOU WANT PLAY(Y/N)");
        Scanner scanner = new Scanner(System.in);
         while (true) {
            String pLay = scanner.nextLine();
            if (pLay.toLowerCase().equals("y")) {
               // System.out.println("hello");
                Random ramStr = new Random(); 
                int ramStrs = ramStr.nextInt(26); // ramdom char
               // System.out.println(ramStrs);
                String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                System.out.println("this is answer: " + array[ramStrs]);
                System.out.println("guess a char a-z");
                int count = 6; // count numer
                ArrayList<String> list = new ArrayList<>();

                for (int i = 0; i < count; i++) {
                String guessNumber = scanner.nextLine(); // guess char 
                // System.out.println("YOU guess word is : " + guessNumber); // print to me see guess char
                    if (guessNumber.equals(array[ramStrs])) {
                        System.out.println("u win");
                        break;
                    } else if (i == 0) {
                        list.add(guessNumber);
                        System.out.println("You wrong , life 5 " + list.get(0) + " is not ");
                        System.out.println("");
                        System.out.println("          --------- ");
                        System.out.println("         |         | ");
                        System.out.println("         |        (_)  " );
                        System.out.println("         |              ");
                        System.out.println("         |             ");
                        System.out.println("         |  ");
                        System.out.println("       -----  ");
                    } 
                    else if (i == 1) {
                        list.add(guessNumber);
                        System.out.println("u wrong life 4 " + list.get(0) + ", " + list.get(1) + ", " + " is not ");
                        System.out.println("");
                        System.out.println("          --------- ");
                        System.out.println("         |         | ");
                        System.out.println("         |        (_) " );
                        System.out.println("         |         |   ");
                        System.out.println("         |             ");
                        System.out.println("         |  ");
                        System.out.println("       -----  ");

                    } 
                    else if (i == 2) {
                        list.add(guessNumber);
                        System.out.println("u wrong life 3 " + list.get(0)  + ", "+ list.get(1)  + ", "+ list.get(2)  + ", "+" is not ");
                        System.out.println("");
                        System.out.println("          --------- ");
                        System.out.println("         |         | ");
                        System.out.println("         |        (_)  " );
                        System.out.println("         |        /|    ");
                        System.out.println("         |             ");
                        System.out.println("         |  ");
                        System.out.println("       -----  ");
                    } 
                    else if (i == 3) {
                        list.add(guessNumber);
                        System.out.println("u wrong life 2 " + list.get(0)  + ", "+ list.get(1)  + ", "+ list.get(2)  + ", "+ list.get(3)  + ", "+" is not ");
                        System.out.println("");
                        System.out.println("          --------- ");
                        System.out.println("         |         | ");
                        System.out.println("         |        (_)  " );
                        System.out.println("         |        /|\\    ");
                        System.out.println("         |             ");
                        System.out.println("         |  ");
                        System.out.println("       -----  ");
                    } 
                    else if (i == 4) {
                        list.add(guessNumber);
                        System.out.println("u wrong life 1 " + list.get(0)  + ", "+ list.get(1)  + ", "+ list.get(2)  + ", "+ list.get(3)  + ", "+ list.get(4)  + ", "+" is not ");
                        System.out.println("");
                        System.out.println("          --------- ");
                        System.out.println("         |         | ");
                        System.out.println("         |        (_)  " );
                        System.out.println("         |        /|\\    ");
                        System.out.println("         |        /    ");
                        System.out.println("         |  ");
                        System.out.println("       -----  ");
                    } 
                    else if (i == 5) {
                        list.add(guessNumber);
                        System.out.println("YOU LOSE 886 "  + list.get(0)  + ", "+ list.get(1)  + ", "+ list.get(2)  + ", "+ list.get(3)  + ", "+ list.get(4) + ", "+ list.get(5)  + ", "+" is not ");
                        System.out.println("");
                        System.out.println("          --------- ");
                        System.out.println("         |         | ");
                        System.out.println("         |        (_)  " );
                        System.out.println("         |        /|\\    ");
                        System.out.println("         |        / \\    ");
                        System.out.println("         |  ");
                        System.out.println("       -----  ");
                        
                    } 
                    
                }
                          
            }else if (pLay.toLowerCase().equals("n")) {
                break;
            }else {
                System.out.println("DO YOU WANT PLAY(Y/N)");
            }
        }

    }
    public static void greet() {
        System.out.println("\n\n          --------- \n         |         | \n         |        (_)\n         |        /|\\ \n         |        / \\ \n         |  \n       -----  \n");
    }
    
}


