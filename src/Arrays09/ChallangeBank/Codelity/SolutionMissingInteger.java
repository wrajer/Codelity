package Arrays09.ChallangeBank.Codelity;

import java.util.Arrays;

public class SolutionMissingInteger {


    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        if (A[A.length - 1] <  1 || A[0]>1) {
            return 1;
        }

        for (int i = 0; i < A.length-1; i++) {
            if (A[i] > 1 && (A[i] + 1) != A[i + 1]&& A[i]!=A[i+1]) {
                return A[i] + 1;
            }

        }

        return A[A.length - 1] + 1;

    }
}
