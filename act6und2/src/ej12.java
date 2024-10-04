import java.util.Scanner;

public class ej12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String guess;



        for (guess=""; !"lucia".equalsIgnoreCase(guess) ;  ){
            System.out.println("Guess my name: ");
            guess = scanner.nextLine();
        }

            System.out.println("Congratulations, you guessed my name correctly!");

    }

    /*Scanner scanner = new Scanner(System.in);
        String guess;
        do {
            System.out.print("Guess my name: ");
            guess = scanner.nextLine();
        }
        while (!"Daffy Duck".equals(guess));
        System.out.println("Congratulations, you guessed my name correctly!");*/
}
