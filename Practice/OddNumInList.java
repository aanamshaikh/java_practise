package Practice;

import java.util.ArrayList;
import java.util.List;

public class OddNumInList {

    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>(List.of(1,2,3,4,5,6,6));
        List<Integer> n1 = new ArrayList<>(List.of(1,3,5));

        boolean o= onlyOddNumbers(n1);
        System.out.println(o);
    }
}
