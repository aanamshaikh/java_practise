package Practice;

public class RemoveSpacesFromString {

    public static void main(String[] args) {

        String input = "My name is Aanam Shaikh";
        System.out.println(removeSpacesFromString(input));
    }

    public static String removeSpacesFromString(String inp){
        StringBuilder op = new StringBuilder();
        char[] ip = inp.toCharArray();
        for(int i =0 ; i<=ip.length-1;i++){
            if(!Character.isWhitespace(ip[i])){
                op.append(ip[i]);
            }
        }
        return op.toString();
    }
}
