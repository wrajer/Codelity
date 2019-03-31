package Arrays09.ChallangeBank.Codelity;

public class SolutionTapeEquilibrium {
    public int solution(int[] A) {

        int sumStart = A[0];
        int sumEnd = 0;

        for (int i = 1; i < A.length; i++) {
            sumEnd += A[i];
        }
        System.out.println(sumEnd);

        int difference = Math.abs(sumStart - sumEnd);

        for (int i = 1; i < A.length; i++) {

            if (difference > Math.abs(sumStart - sumEnd)) {
                difference = Math.abs(sumStart - sumEnd);
            }
            sumStart += A[i];
            sumEnd -= A[i];

        }

        return difference;
    }
}
