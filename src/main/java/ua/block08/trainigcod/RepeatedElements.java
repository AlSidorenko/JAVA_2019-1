package ua.block08.trainigcod;

import java.util.HashMap;

/**
 * Created on 19.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class RepeatedElements {

    public static <T> HashMap<T, Integer> findSameEl(T[] array) {
        Integer counter;
        HashMap<T, Integer> list = new HashMap<T, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (!list.containsKey(array[i])) {
                counter = 1;
                for (int j = 0; j < array.length; j++)
                    if (array[i].equals(array[j]) && i != j)
                        counter++;
                list.put(array[i], counter);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println(findSameEl(i));
    }
}
