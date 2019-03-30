package Arrays09.ChallangeBank.Codelity;

public class SolutionRotateArray {

    public int[] solution(int[] A, int K) {


        int[] result = new int[A.length];
        int j = 0;
        if (A.length != 0) {
            K = K % A.length;

            for (int i = 0; i < A.length; i++) {

                if (i + K < A.length) {
                    result[i + K] = A[i];

                } else {
                    result[j] = A[i];
                    j++;
                }

            }
        }

        for (int x : result
        ) {
            System.out.print(x + " ");

        }

        return result;


    }
}

