package ua.block05.trainingcod.Presentation;

/**
 * Created on 20.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Child_01 extends Base_01 {

    Child_01() {
        System.out.println("Child_01 constr");
        show();
    }

    void show() {
        System.out.println("Child_01 Show " + x + "  ");
    }

    public static void main(String[] args) {
        new Child_01();
    }
}

class Base_01 {

    int x = 10;

    Base_01() {
        System.out.println("Base_01 constr");
        show();
    }

    void show() {
        System.out.println("Base_01 Show " + x + "  ");
    }
}
