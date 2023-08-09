package Practice;

public class ReverseAString {

    public static String reverse(String inp){

        if (inp == null){
            throw new IllegalArgumentException("Null is not a valid input");
        }

        StringBuilder output = new StringBuilder();
        char[] arrayOfInput = inp.toCharArray();
        for(int i =arrayOfInput.length-1 ; i>=0;i--){
            output.append(arrayOfInput[i]);
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String inp = "Hello";
        System.out.println(reverse(inp));
    }
}
