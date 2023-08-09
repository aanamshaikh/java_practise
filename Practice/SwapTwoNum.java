package Practice;

public class SwapTwoNum {

    //Swap two number without using a third variable

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Number a is "+a+" and b is "+b+" Before Swapping");

        b=b+a;
        a=b-a;
        b=b-a;

        System.out.println("Number a is "+a+" and b is "+b+" After Swapping");

    }
}
