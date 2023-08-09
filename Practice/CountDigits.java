package Practice;

public class CountDigits {

    public static void main(String[] args) {
        int n = -123455;
        int c = countDigits(n);
        System.out.println(c);
    }

    public static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }

        if(n<0){
            n=-n;
        }
        int c = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        return c;
    }
}
