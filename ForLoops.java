import java.util.Arrays;

public class ForLoops {
    public static void main(String[] args) {
        //Print numbers from 1 to 10
        System.out.println("1,2,3,4,5,..."); //Hard-coding
        //Code that is functional in many perspectives

        //for (initialization, until where, how are you getting there) {
        //     code here
        // }

        int num = 5;
        System.out.println(num++); //post-fix
        System.out.println(++num); //pre-fix

        int sum_of_all_the_number_to_ten = 0;
        for (int start_at = 1; start_at <= 100000; start_at+=2) {
            sum_of_all_the_number_to_ten += start_at;
        }
        System.out.println(sum_of_all_the_number_to_ten);

        //1+2+3+4+5+6+7..........99998 + 99999 + 100000
    }
}
