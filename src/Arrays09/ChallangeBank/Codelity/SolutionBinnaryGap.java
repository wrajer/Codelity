package Arrays09.ChallangeBank.Codelity;

import java.util.Arrays;

public class SolutionBinnaryGap {

    public int solution(int[] A) {
        // write your code in Java SE 8

        if (A.length > 1) {
            Arrays.sort(A);
            int odd = A[0];

            for (int i = 1; i < A.length; i += 2) {

                if (A[i - 1] != A[i]) {
                    return A[i - 1];
                }
            }
        }

        return A[A.length - 1];



}

}
