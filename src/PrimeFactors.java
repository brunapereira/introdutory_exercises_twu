import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bpereira on 9/10/15.
 */
public class PrimeFactors {

    boolean isPrime(int n) {
        for(int i = 2; 2 * i < n; i++)
            if(n % i == 0) return false;

        return true;
    }

    public ArrayList generate(int limit){
        ArrayList<Integer> allFactors = new ArrayList<Integer>();

        for (int i = 2; i <= limit; i++)
            if (limit % i == 0 && isPrime(i)) allFactors.add(i);

        return allFactors;
    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(s.nextLine());

        PrimeFactors primeFactors = new PrimeFactors();
        System.out.println(primeFactors.generate(30));

    }
}
