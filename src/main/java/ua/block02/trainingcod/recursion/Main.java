package ua.block02.trainingcod.recursion;

/**
 * Created on 10.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Main {

    public static void main(String[] args) {
        recur(99);
    }

    public static void recur(int a) {

        if (a <= 100) {
            System.out.print("a = " + a);
            recur(++a);
            System.out.print("a = " + a);
        }
    }
}
