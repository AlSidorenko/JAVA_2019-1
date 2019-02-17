package ua.block04.trainingcod.applicationForm02.view;

/**
 * Created on 13.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class View {

    public void printMessage(String... message) {
        for (String elem : message) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
