package ua.block06.trainigcod.exceptions.part_II;

/**
 * Created on 22.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Parent_03 {

    // предок пугает Exception
    public void f() throws Exception {}
}


// тут ошибка компиляции в Java, но, ДОПУСТИМ, ее нет
class Child_03 extends Parent_03 {
    // потомок расширил Exception до Throwable
    //public void f() throws Throwable {}
}


class Demo {
    public static void test(Parent_03 ref) {
        // тут все компилируется, Parent_03.f() пугает Exception и мы его ловим catch
        try {
            ref.f();
        } catch(Exception e) {}
    }
}
