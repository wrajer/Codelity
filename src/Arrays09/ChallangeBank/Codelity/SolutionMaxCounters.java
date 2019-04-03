package Arrays09.ChallangeBank.Codelity;

public class SolutionMaxCounters {

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        int[] counters = new int[N];
        int max = 0;

        for (int i = 0; i < A.length; i++) {

            //if K bigger than N
            if (A[i] > N) {
                for (int j = 0; j < counters.length; j++) {
                    counters[j] = max;
                }

            }

            //if K smaller than N
            else {
                counters[A[i] - 1]++;
                max = (max > counters[A[i] - 1]) ? max : counters[A[i] - 1];
            }

        }

        return counters;

    }
}
