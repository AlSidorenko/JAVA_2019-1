package ua.block05.trainingcod.Presentation;

/**
 * Created on 20.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Child_02 extends Base_02 {

    int x = 20;

    Child_02() {
        System.out.println("Child_02 constr");
        show();
    }

    void show() {
        System.out.println("Child_02 Show " + x + "  ");
    }

    public static void main(String[] args) {
        new Child_02();
    }
}

class Base_02 {

    int x = 10;

    Base_02() {
        System.out.println("Base_02 constr");
        show();
    }

    void show() {
        System.out.println("Base_02 Show " + x + "  ");
    }
}
