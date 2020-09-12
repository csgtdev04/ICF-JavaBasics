import java.util.Scanner;

public class ScannerIfElse {
    public static void main(String[] args) {
        //Pratice with if else and Scanner
        //User Interactivity
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = keyboard.nextInt();

        if (age > 10) {
            System.out.println("You can play");
        }
        else if (age == 17) {
            System.out.println("You need to upgrade the game!");
        }
        else {
            System.out.println("You can't play!");
        }

    }
}
