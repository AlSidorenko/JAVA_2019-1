package ua.block01.task01;

/**
 * Created on 07.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class View {

    public static final String CORRECT_OPERATION = "Good job! Sentence: ";
    public static final String WRONG_OPERATION = "Wrong word! Repeat please! ";
    public static final String ENTER_FIRST_WORD = "Please, enter first word: ";
    public static final String ENTER_SECOND_WORD = "Please, enter second word: ";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printMessageResult(String message, String txt) {
        System.out.println(message + " " + txt);
    }
}
