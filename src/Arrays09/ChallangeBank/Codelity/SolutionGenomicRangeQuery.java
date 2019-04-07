package Arrays09.ChallangeBank.Codelity;

public class SolutionGenomicRangeQuery {


    public int[] solution(String S, int[] P, int[] Q) {

        int[] answer = new int[P.length];

        for (int i = 0; i < answer.length; i++) {


            for (int j = P[i]; j <= Q[i]; j++) {


                switch (S.charAt(j)) {
                    case 'A':
                        if (answer[i] > 1 || answer[i] == 0) {
                            answer[i] = 1;
                        }
                        break;
                    case 'C':
                        if (answer[i] > 2 || answer[i] == 0) {
                            answer[i] = 2;
                        }
                        break;
                    case 'G':
                        if (answer[i] > 3 || answer[i] == 0) {
                            answer[i] = 3;
                        }
                        break;
                    case 'T':
                        if (answer[i] > 4 || answer[i] == 0) {
                            answer[i] = 4;
                        }
                        break;
                }
            }

        }

    /*    for (int x : answer) {
            System.out.print(x + " ");
        }*/
//pobrawic kod aby byl efektywniejszy
        return answer;

    }


}
