package Arrays09.ChallangeBank;


import Arrays09.ChallangeBank.Codelity.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

/*
        Solution sol = new Solution();
        SolutionLinkedList sol2 = new SolutionLinkedList();
        SolutionLinkedListArrays sol23 = new SolutionLinkedListArrays();

        */
/*int [] tabA = {4,2,1};
        int [] tabB = {2,5,3};*//*


        int [] tabA = {7,1,4,4};
        int [] tabB = {5,3,4,3};

        System.out.println(sol.solution(tabA, tabB , 2));
        System.out.println(sol2.solution(tabA, tabB , 2));
        System.out.println(sol23.solution(tabA, tabB , 2));
*/


      /*  int [] tab1 = {3,8,9,7,6};
        int [] tab2 = {-1000,5};
        SolutionRotateArray sol4= new SolutionRotateArray();

        System.out.println(sol4.solution(tab1, 3));
        System.out.println(Arrays.asList(sol4.solution(tab2, 1)));*/

//        SolutionBinnaryGap solutionBinnaryGap = new SolutionBinnaryGap();
//        int [] tab1 = {9,3,9,3,9,7,9};
//
//        System.out.println(solutionBinnaryGap.solution(tab1));


//        SolutionString solutionString = new SolutionString();
//        SolutionStringLineList solutionStringLineList = new SolutionStringLineList();
//        SolutionStringArray solutionStringArray = new SolutionStringArray();
//
//
//
//        System.out.println(solutionString.solution("abaacbcab", 2));
//        System.out.println(solutionString.solution("aabcabc", 1));
//        System.out.println(solutionString.solution("zaaaazz", 1));
//        System.out.println(solutionString.solution("aaaa", 0));
//        System.out.println(solutionString.solution("aaaa", 2));
//        System.out.println(solutionString.solution("aaaa", 1));

   /*     System.out.println(solutionString.solution("abccasdfasdfadfadfadsfassgdfsgdfsgsfgsdfgdsfgdsfgdfadfasdfadfadsfsadfsadfasdfasdfasdfsadfadsfadsfadfadsfasdfadfadsfadsfafdfadsfadsfadsfadsfadfadf", 1));
        System.out.println("Wynik z linked List");
        System.out.println(solutionStringLineList.solution("abccasdfasdfadfadfadsfassgdfsgdfsgsfgsdfgdsfgdsfgdfadfasdfadfadsfsadfsadfasdfasdfasdfsadfadsfadsfadfadsfasdfadfadsfadsfafdfadsfadsfadsfadsfadfadf", 1));
*/ /*     System.out.println("Wynik z Array List");
        System.out.println(solutionStringArray.solution("abababeabbaegababab", 2));
        System.out.println(solutionStringArray.solution("aaaaa", 2));
        System.out.println(solutionStringArray.solution("aaaaa", 0));
        System.out.println(solutionStringArray.solution("aaaaa", 1));*/

       /* SolutionGenomicRangeQuery solutionGenomicRangeQuery = new SolutionGenomicRangeQuery();

        int[] P = {2,5,0};
        int[] Q = {4,5,6};

        solutionGenomicRangeQuery.solution("CAGCCTA", P, Q);*/

       SolutionSumToZero solution  = new SolutionSumToZero();

        for (int i = 1; i <=20; i++) {


       for (int x : solution.solution(i)) {
           System.out.print(x + " ");

       }
            System.out.println();
        }

        Set<Integer> set = new HashSet<Integer>();
        set.add(1);


    }


}
