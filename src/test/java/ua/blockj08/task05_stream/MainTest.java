package ua.blockj08.task05_stream;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created on 27.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MainTest {

    private Main mainStream = new Main();
    private int[] arr = {-18, 25, -124, 0, 0, 18, 78, 89, 1024, 896, 7854};


    @Test
    public void whenCheckAverageItemOfArray() {
        int result = mainStream.averageValueOfArrayElements(arr);
        int expected = 894;
        assertEquals(result, expected);
    }

    @Test
    public void whenCheckMinItemOfArray() {
        int result = mainStream.minValueOfArrayElements(arr);
        int expected = -124;
        assertEquals(result, expected);
    }

    @Test
    public void whenCheckIndexOfMinItem() {
        int result = mainStream.indexOfMinValueArray(arr);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenCountElementsEquals_0() {
        int result = mainStream.countElementsEqualZero(arr);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenCountOfElementsIsGreaterThanZero() {
        int result = mainStream.countOfElementsIsGreaterThanZero(arr);
        int expected = 7;
        assertEquals(result, expected);
    }

    @Test
    public void whenMultiplyingTheArrayElementsByTheNumber() {
        int numb = 7;
        int[] result = mainStream.multiplyingTheArrayElementsByTheNumber(arr, numb);
        int[] expected = {-126, 175, -868, 0, 0, 126, 546, 623, 7168, 6272, 54978};
        assertThat(result, is(expected));
    }
}
