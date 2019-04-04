package Arrays09.ChallangeBank.Codelity;

public class SolutionPassingCars {

    public int solution(int[] A) {
        // write your code in Java SE 8

        int sumWest = 0;
        int sumEast = 0;
        int pairsPassing = 0;


        for (int x : A) {
            sumWest += x;
        }

        sumEast = A.length - sumWest;

        for (int i = 0; i < A.length; i++) {

            if (A[i] == 0) {
                pairsPassing += sumWest;

            } else {
                sumWest--;
            }

            if (pairsPassing > 1000000000) {
                return -1;
            }
        }

        return pairsPassing;
    }
}
