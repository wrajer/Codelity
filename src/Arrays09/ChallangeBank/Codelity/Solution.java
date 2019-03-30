package Arrays09.ChallangeBank.Codelity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A, int[] B, int F) {

        long startTime = System.nanoTime();
        // write your code in Java SE 8
        int sum = 0;
        int indexOfMax;


        List<Integer> Alist = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> potentialList = new ArrayList<>();

        List<Integer> Blist = Arrays.stream(B)
                .boxed()
                .collect(Collectors.toList());

        //calculeting the potentials


        for (int i = 0; i < Alist.size(); i++) {

            potentialList.add(Alist.get(i) - Blist.get(i));
        }


        //taking the max

        while (1 <= F) {

            indexOfMax = potentialList.indexOf(Collections.max(potentialList));

            sum += Alist.get(indexOfMax);
            F--;

            //removing the elements
            Alist.remove(indexOfMax);
            Blist.remove(indexOfMax);
            potentialList.remove(indexOfMax);

        }


        for (Integer x : Blist) {
            sum += x;
        }

        System.out.println(System.nanoTime()-startTime);

        return sum;

    }
}
