package Practice;

public class FibonacciSeriesUsingRec {
    public static void main(String[] args) {
        printFibonacciSequence(10);
    }

    public static void printFibonacciSequence(int count){
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 0;i<=count;i++){
            System.out.println(a+", "); // 0 , 1, 2

            a=b;  //1 , 1 ,
            b=c; // 1, 2,
            c=a+b; // 2 , 3

        }

    }
}
