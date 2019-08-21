package ua.block01.trainingcod.tef03;

/**
 * Created on 21.08.2019.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class View {

    protected static final String INPUT_NUMB = "Please, enter number: ";
    protected static final String INPUT_INT_DATA = "Input INT value = ";
    protected static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    protected static final String OUR_INT = "INT value = ";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printMessageAddText(String message, String text) {
        System.out.printf("%s %s\n", message, text);
    }
}
