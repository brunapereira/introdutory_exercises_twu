import java.util.Scanner;

/**
 * Created by bpereira on 9/10/15.
 */
public class DrawRightTriangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
