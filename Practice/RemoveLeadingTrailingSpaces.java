package Practice;

public class RemoveLeadingTrailingSpaces {
    public static void main(String[] args) {
        String s = "  abc  def\t";

        System.out.println(s);
        s = s.strip();

        System.out.println(s);
    }
}
