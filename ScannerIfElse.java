import java.util.Scanner;

public class ScannerIfElse {
    public static void main(String[] args) {
        //Pratice with if else and Scanner
        //User Interactivity
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = userInput.nextInt();

        if (age > 10) {
            System.out.println("You can play");
        }
        else if (age == 17) {
            System.out.println("You need to upgrade the game!");
        }
        else {
            System.out.println("You can't play!");
        }

        //Example #2
        //Name, Age, Credit
        System.out.println("What is your name?");
        String name = userInput.nextLine();
        System.out.println("What is your age?");
        int age_of_customer = userInput.nextInt();
        System.out.println("What is your Credit Card Balance?");
        int creditCardBalance = userInput.nextInt();

        //Make sure they are older than 15 AND credit card number is > 1000 AND their name is something
        if (age_of_customer > 15 && creditCardBalance > 0 && name != null) {
            System.out.println("You are good to go! Buy your goods!");
        }
        else if (creditCardBalance <= 0) {
            System.out.println("You don't have enough money!");
        }
        else if (age_of_customer < 15) {
            System.out.println("You aren't old enough!");
        }
        else {
            System.out.println("You haven't entered your name!");
        }

    }
}
