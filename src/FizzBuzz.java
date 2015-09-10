import java.util.Scanner;

/**
 * Created by bpereira on 9/10/15.
 */
public class FizzBuzz {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(s.nextLine());

        for(int i = 1; i <= number; i++){
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
