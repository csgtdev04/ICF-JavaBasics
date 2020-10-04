import java.util.*;
import java.util.Scanner;

public class FinalLab
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Put in the amount of people that require information >>> ");
        int length = console.nextInt();
        console.nextLine();
        String[] arrayString = new String[length];

        for(int i = 0; i < length; i++)
        {
            System.out.println();
            System.out.println("Person number " + (i + 1) + ":");
            System.out.println("-------------------");
            System.out.println("Please enter the state you live in >>> ");
            String state = console.nextLine();
            System.out.println("Please input your name >>> ");
            String name = console.nextLine();
            System.out.println("Enter your age >>> ");
            int age = console.nextInt();
            System.out.println("Enter your grade >>> ");
            int grade = console.nextInt();
            String school = "not in School";
            boolean college = false;
            String drive;
            if(grade <= 5)
            {
                school = "in Elementary school";
            } else if(grade >= 6 && grade <= 8)
            {
                school = "in Middle School";
            } else if(grade >= 9 && grade <= 12)
            {
                school = "in High School";
            } else if(grade > 12)
            {
                System.out.println("Do you want to go to college? true or false");
                college = console.nextBoolean();
                if(college == true)
                {
                    school = "going to College";
                }
            }
            if(age == 15)
            {
                drive = "old enough to get your permit.";
            } else if(age >= 16)
            {
                drive = "old enough to get a license.";
            } else {
                drive = "too young to drive.";
            }
            console.nextLine();
            arrayString[i] = name + " lives in " + state + " and is " + school + " at the age of " + age + " which means they are " + drive;
        }
        System.out.println("\nInformation Gathered:");
        System.out.println("-------------------------");

        for(int i = 0; i < length; i++) //i is the position of the array if used with an array
        {
            System.out.println( (i + 1) + ". " + arrayString[i]);
        }

    }



}




























        /*
        Scanner kb = new Scanner(System.in);

        String name = "Yusuf";
        int age = 16;
        double gpa = 3.8;
        boolean boy = true;
        int grade = 11;
        int num = 1;

        System.out.println("hello! my name is " + name + " I am " + age + " years old");
        System.out.println("What's your name?");
        String name2 = kb.nextLine();
        System.out.println(name2);


        for(int i = 0; i < 5; i++)
        {
            if(num > 3)
            {
                System.out.println(num);
            }

            num++;
        }

    }
    */
