package ua.class1402;

/**
 * Created on 19.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */

class A {
    public int x = 3;
}

public class Main {

    public static void main(String[] args) {
        A a = new A();
        m(a);
        System.out.println(m(a).x);

    }

    private static A m(final  A a) {
        a.x = 10;
        return a;
    }
}
