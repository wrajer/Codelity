package Arrays09.ChallangeBank.Codelity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SolutionDistinct {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        return set.size();
    }

}
