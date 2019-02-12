package ua.block02.trainingcod.recursion;

/**
 * Created on 10.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Recursion01 {

    public static void main(String[] args) {
        f(1);
        System.out.println("END");
    }

    private static void f(int k) {
        System.out.println(k);
        if (k < 7) {
            f(2 * k);
        }
    }
}
