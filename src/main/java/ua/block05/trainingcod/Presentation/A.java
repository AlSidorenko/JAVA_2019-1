package ua.block05.trainingcod.Presentation;

/**
 * Created on 20.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
class A {
    A() {
        System.out.println("Внутри конструктора А.");
    }
}

class B extends A {
    B() {
        System.out.println("Внутри конструктора В.");
    }
}

class C extends B {
    C() {
        System.out.println("Внутри конструктора С.");
    }
}

class CallingCons {

    public static void main(String args[]) {
        C c = new C();
    }
}
