package Arrays09.ChallangeBank.Codelity;

import java.util.HashSet;
import java.util.Set;

public class SolutionFromRiverOne {

    public int solution(int X, int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (set.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
