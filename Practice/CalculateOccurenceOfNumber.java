package Practice;

import java.util.Scanner;

public class CalculateOccurenceOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.print("Enter the Digit to find: ");
        int i = sc.nextInt();

       int c= count(n, i);
        System.out.println("Number "+i+" Appeared "+c+" Times in Digit "+n);
    }

    public static int count(int n, int i) {
        if (n == 0 && i == 0) {
            return 1;
        }
        int c =0;
        while (n > 0) {
            int lastDigit = n % 10;
            if(i==lastDigit){
                c++;
            }
            n=n/10;
 }
        return c;
    }
}
