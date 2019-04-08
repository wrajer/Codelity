package Arrays09.ChallangeBank.Codelity;

public class SolutionMinAvgTwoSlice {

    public int solution(int[] A) {
        // write your code in Java SE 8 1 2 1 1 2 1 1 czyi spradzac 2 i 3 1 2 1 2 1 1,5
        float avg = (A[0] + A[1]) / 2f;
        int minIndex = 0;

        if (A.length >= 3) {
            for (int i = 0; i < A.length - 1; i++) {


                if (((A[i] + A[i + 1]) / 2f) < avg) {
                    avg = (A[i] + A[i + 1]) / 2f;
                    minIndex = i;
                }

                if ((i + 2) < A.length && ((A[i] + A[i + 1] + A[i + 2]) / 3f) < avg) {

                    avg = (A[i] + A[i + 1] + A[i + 2]) / 3f;
                    minIndex = i;
                }

            }

        }

        return minIndex;
    }
}
