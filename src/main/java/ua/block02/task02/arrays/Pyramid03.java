package ua.block02.task02.arrays;

/**
 * Created on 10.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Pyramid03 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        pyramidPrint(arr);
    }

    public static void pyramidPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
