package ua.block02.trainingcod.arrays;

/**
 * Created on 10.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Array02 {

    public static void main(String[] args) {

        int[] ar1 = new int[10];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = (int) Math.floor(Math.random() * 10);
        }

        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i] + " ");
        }
    }
}
