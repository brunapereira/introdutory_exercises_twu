import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Created by bpereira on 9/10/15.
 */
public class IsocelesTriangle {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(s.nextLine());
        int repeat = 1;
        for (int i = number; i > 0; i--){
            System.out.print(StringUtils.repeat(" ", i - 1));
            System.out.println(StringUtils.repeat("*", repeat));
            repeat += 2;
        }
    }
}
