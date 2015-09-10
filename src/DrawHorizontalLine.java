/**
 * Created by bpereira on 9/10/15.
 */

import java.util.Scanner;
public class DrawHorizontalLine {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(s.nextLine());

        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
}
