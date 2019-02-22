package ua.block06.trainigcod.exceptions.part_II;

/**
 * Created on 22.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class App26 {

    public static void main(String[] args) {
        // тут все компилируется, Demo.test хотел Parent_03 и мы дали ему подтип - Child_03
        Demo.test(new Child_03());
    }
}
