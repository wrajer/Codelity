package Arrays09.ChallangeBank.Codelity;

public class SolutionSumToZero {

    public int[] solution(int N) {

        int[] result = new int[N];
        int j = 1; //zmienna pomocniczna to obliczen

        if (N > 1) {
            //gdy N przysta wtedy daje rpzeciwne liczby czyli -1 1 -2 2 etc
            for (int i = 0; i < N - 1; i += 2) {
                result[i] = j;
                result[i + 1] = -j;
                j++;
            }

        }
        //gdy nie parzysta wtedy zawsze ostatni element to 0
        if (N % 2 != 0) {
            result[result.length - 1] = 0;
        }


        return result;
    }

}
