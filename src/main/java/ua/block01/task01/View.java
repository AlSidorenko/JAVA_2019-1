package ua.block01.task01;

/**
 * Created on 07.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class View {

    /**
     * String variable.
     */
    public static final String CORRECT_OPERATION = "Good job! Sentence: ";

    /**
     * String variable.
     */
    public static final String WRONG_OPERATION = "Wrong word! Repeat please! ";

    /**
     * String variable.
     */
    public static final String ENTER_FIRST_WORD = "Please, enter first word: ";

    /**
     * String variable.
     */
    public static final String ENTER_SECOND_WORD = "Please, enter second word: ";

    /**
     * Method print message.
     * @param message - str variable.
     */
    public void printMessage(String message) {
        System.out.print(message);
    }

    /**
     * Method print result.
     * @param message - str variable.
     * @param txt - str variable.
     */
    public void printMessageResult(String message, String txt) {
        System.out.println(message + " " + txt);
    }
}
