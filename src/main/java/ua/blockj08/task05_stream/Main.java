package ua.blockj08.task05_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created on 27.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Main {

    public int averageValueOfArrayElements(int[] arr) {
        IntStream streamInt = Arrays.stream(arr);
        return streamInt.sum() / arr.length;
    }

    public int minValueOfArrayElements(int[] arr) {
        IntStream streamInt = Arrays.stream(arr);
        return streamInt.min().getAsInt();
    }

    public int indexOfMinValueArray(int[] arr) {
        int index = 0;
        int min = minValueOfArrayElements(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                index = i;
            }
        }
        return index;
    }

    public int countElementsEqualZero(int[] arr) {
        IntStream streamInt = Arrays.stream(arr);
        return (int) streamInt.filter(n -> n == 0).count();

    }

    public int countOfElementsIsGreaterThanZero(int[] arr) {
        IntStream streamInt = Arrays.stream(arr);
        return (int) streamInt.filter(n -> n > 0).count();
    }

    public void multiplyingTheArrayElementsByTheNumber(int[] arr, int numb) {
        IntStream streamInt = Arrays.stream(arr);
        streamInt.map(n -> n * numb).forEach(System.out::println);
    }
}
