import java.util.*;
import java.lang.Math;
import java.io.*;

public class Narcissistic {

    public static boolean isNarcissistic(int n) {
        int total = 0;
        String num = Integer.toString(n);
        for ( int i = 0; i < num.length(); i++ ) {
            total = total + (int)Math.pow(num.charAt(i) - '0', num.length());
        }
        int number = Integer.parseInt(num);
        if ( total == number ) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check if is narcissistic number: ");
        int n = input.nextInt();
        System.out.println(isNarcissistic(n) ? "Yes" : "No");

    }
}
