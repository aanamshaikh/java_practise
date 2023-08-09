package Practice;

import java.util.HashSet;

public class UniqueCharacters {
    public static void main(String[] args) {
        String inputString = "hello world";

        HashSet<Character> uniqueChars = findUniqueCharacters(inputString);

        System.out.println("Unique characters in the string: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
    }

    public static HashSet<Character> findUniqueCharacters(String str) {
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char ch : str.toCharArray()) {
            // Ignore spaces and consider only non-space characters
            if (ch != ' ') {
                uniqueChars.add(ch);
            }
        }
        return uniqueChars;
    }
}
