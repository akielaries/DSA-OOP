// https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
                posCount++;
            else if (arr[i] < 0)
                negCount++;
            else
                zeroCount++;
        }

        double posFrac = ((double) posCount) / ((double) arr.length);
        double negFrac = ((double) negCount) / ((double) arr.length);
        double zeroFrac = ((double) zeroCount) / ((double) arr.length);

        System.out.println(posFrac);
        System.out.println(negFrac);
        System.out.println(zeroFrac);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
