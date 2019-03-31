package Arrays09.ChallangeBank.Codelity;

import java.util.Arrays;

public class SolutionArray2 {
    public int solution(int[] A) {

        if (A.length >= 1) {
            Arrays.sort(A);
            int result;
            for (int i = 0; i < A.length; i++) {

                if (A[i] != i + 1) {
                    return A[i] - 1;
                }

            }
            return A[A.length - 1] + 1;
        }


        return 1;
    }
}
