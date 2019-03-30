package Arrays09.ChallangeBank.Codelity;

import java.util.HashSet;
import java.util.Set;

public class SolutionString {

    public int solution(String S, int K) {
        if (K != 0) {
            long startTime=System.nanoTime();


            StringBuilder sb = new StringBuilder(S);
            Set<Character> setStart = new HashSet<>();
            Set<Character> setEnd = new HashSet<>();
            int counterStart = 0;
            int counterStart2 = 0;

            int counterEnd = 0;
            int counterEnd2 = 0;

            for (int i = 0; i < sb.length(); i++) {

                if (setStart.size() < K || setStart.contains(sb.charAt(i))) {
                    setStart.add(sb.charAt(i));
                    counterStart2++;
                } else {

                    if (counterStart == 0) {
                        counterStart2 = 0;
                    }
                    counterStart = counterStart + 1 + counterStart2;
                    counterStart2 = 0;
                }
            }


            //fromthe end
            sb.reverse();
            for (int i = 0; i < sb.length(); i++) {

                if (setEnd.size() < K || setEnd.contains(sb.charAt(i))) {
                    setEnd.add(sb.charAt(i));
                    counterEnd2++;
                } else {

                    if (counterEnd == 0) {
                        counterEnd2 = 0;
                    }
                    counterEnd = counterEnd + 1 + counterEnd2;
                    counterEnd2 = 0;
                }
            }

            System.out.println(System.nanoTime()-startTime);

//taking the smallest one
            if (counterStart != 0 || counterEnd != 0) {
                return counterStart < counterEnd ? counterStart : counterEnd;

            }

            // from the end
        }

        return -1;
    }

}
