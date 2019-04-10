package Arrays09.ChallangeBank.Codelity;

public class SolutionCountDiv {

    public int solution(int A, int B, int K) {

        int counter = 0;

        int firstDivider = A;
        if (K <= B && A!=B) {

            while (counter == 0) {

                if (firstDivider % K == 0) {
                    counter++;
                } else {
                    firstDivider++;
                }
            }

            for (int i = firstDivider + K; i <= B; i += K) {

                counter++;

            }

        }

        return counter;
    }


}
