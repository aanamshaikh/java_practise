package Practice;

public class CheckVowelInString {

    public static boolean StringContainsVowel(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        System.out.println(StringContainsVowel("Hello")); // true
        System.out.println(StringContainsVowel("TV")); // false
    }
}
