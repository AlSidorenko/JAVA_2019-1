package ua.block02.trainingcod.BubleSortdel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] barray = {3, 5, 4, 6, 5, 3, 4, 5, 7, 3, 2};

        for (int i = 0 ; i <= barray.length - 1; i++){
            for (int j = 0 ; j < barray.length - 1 - i; j++){
                conditionalSwap(barray, j);
            }
        }

        System.out.println(Arrays.toString(barray));
    }

    private static void conditionalSwap(int[] barray, int i) {
        if (barray[i] > barray[i+1]){
            swap(barray, i);
        }
    }

    private static void swap(int[] barray, int i) {
        int tmp = barray[i];
        barray[i] = barray[i+1];
        barray[i+1] = tmp;
    }
}
