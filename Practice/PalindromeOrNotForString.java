package Practice;

public class PalindromeOrNotForString {


    public static boolean checkPalindrome(String input){
        boolean result = true;

        char[] arr= input.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            int n =arr.length-i -1;
            if (arr[i]!=arr[n] ){
                   result=false;
                   break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("MALAyaLAM"));
        System.out.println(checkPalindrome("MALAYALAM"));

    }

}
