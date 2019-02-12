package ua.block02.trainingcod.arrays;

/**
 * Created on 10.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class App02 {

    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
