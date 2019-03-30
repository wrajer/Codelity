package Arrays09.ChallangeBank.Codelity;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class SolutionKris {
    public int solution(int[] A, int[] B, int F) {
        // write your code in Java SE 8
        int sum = 0;
        int maxA;
        int indexOfMax;
        int maxB;


        LinkedList<Integer> Alist = new LinkedList();

        Alist.addAll(Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList()));

        LinkedList<Integer> Blist = new LinkedList();

        Blist.addAll(Arrays.stream(B)
                .boxed()
                .collect(Collectors.toList()));

        //calculeting the potentials

        Integer potentialA = 0;
        Integer potentialB = 0;

        for (Integer x : Alist) {
            potentialA += x;
        }

        for (Integer y : Blist) {
            potentialB += y;
        }


        //taking the max

        while (F >= 1 && F < Alist.size()) {

            maxA = Collections.max(Alist);
            indexOfMax = Alist.indexOf(maxA);
            maxB = Blist.get(indexOfMax);

            if (maxA > Blist.get(indexOfMax) || (maxA == Blist.get(indexOfMax) && potentialA >= potentialB)) {
                sum += maxA;
                F--;

            }
          /*  else if (maxA == Blist.get(indexOfMax) && potentialA <= potentialB ) {
                sum += maxA;
                F--;
            }*/

            else {
                sum += Blist.get(indexOfMax);
            }

            //removing from list and potential
            potentialA -= maxA;
            potentialB -= Blist.get(indexOfMax);

            Alist.remove(indexOfMax);
            Blist.remove(indexOfMax);

        }

        if (F == 0) {
            for (Integer x : Blist) {
                sum += x;
            }
        } else {
            for (Integer x : Alist) {
                sum += x;
            }
        }

        return sum;

    }
}
