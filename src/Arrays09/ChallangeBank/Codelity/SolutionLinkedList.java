package Arrays09.ChallangeBank.Codelity;

import java.util.*;
import java.util.stream.Collectors;

class SolutionLinkedList {
    public int solution(int[] A, int[] B, int F) {

        long startTime = System.nanoTime();
        // write your code in Java SE 8
        int sum = 0;
        int indexOfMax;


        List<Integer> Alist = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> potentialList = new LinkedList<>();

        List<Integer> Blist = Arrays.stream(B)
                .boxed()
                .collect(Collectors.toList());

//creating potential list
        for (int i = 0; i < Alist.size(); i++) {

            potentialList.add(Alist.get(i) - Blist.get(i));
        }


//taking F positions from A list
        while (1 <= F) {

            indexOfMax = potentialList.indexOf(Collections.max(potentialList));

            sum += Alist.get(indexOfMax);
            F--;

            //removing the elements
            Alist.remove(indexOfMax);
            Blist.remove(indexOfMax);
            potentialList.remove(indexOfMax);

        }

 //taking rest from B list
        for (Integer x : Blist) {
            sum += x;
        }

        System.out.println(System.nanoTime() - startTime);

        return sum;

    }
}
