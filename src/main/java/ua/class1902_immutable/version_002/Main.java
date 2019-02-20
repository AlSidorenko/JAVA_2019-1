package ua.class1902_immutable.version_002;

/**
 * Created on 20.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Main {

    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1992);

        ImmutableStudent student = new ImmutableStudent(1, "Alex", age);

        System.out.println("Alex age year before modification = " + student.getAge().getYear());
        age.setYear(1993);
        System.out.println("Alex age year after modification = " + student.getAge().getYear());
    }
}
