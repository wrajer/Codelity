package Arrays09.ChallangeBank.Codelity;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class SolutionLinkedListArrays {
    public int solution(int[] A, int[] B, int F) {

        long startTime = System.nanoTime();
        // write your code in Java SE 8
        int sum = 0;
        int indexOfMax;
  /*      int[] tabTemp = new int [A.length - F];
        LinkedList<Integer> listTemp = new LinkedList<>();*/

        List<Integer> potentialList = new LinkedList<>();

//creating potential list
        for (int i = 0; i < A.length; i++) {

            potentialList.add(A[i] - B[i]);
        }


//taking F positions from A list
        while (1 <= F) {

            indexOfMax = potentialList.indexOf(Collections.max(potentialList));

            sum += A[indexOfMax];
            F--;

            potentialList.set(indexOfMax, Integer.MIN_VALUE);

        }

        //taking rest from B list
        for (int i = 0; i < B.length; i++) {
            if (potentialList.get(i) != Integer.MIN_VALUE) {
                sum += B[i];
            }
        }

        System.out.println(System.nanoTime() - startTime);

        return sum;

    }
}
