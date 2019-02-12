package ua.block01.trainingcod.tef;

/**
 * Created by User on 17.03.2016.
 */
public class View {

    /**
     * Text's constant.
     */
    public static final String INPUT_INT_DATA = "Input INT value = ";

    /**
     * Text's constant.
     */
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";

    /**
     * Text's constant.
     */
    public static final String OUR_INT = "INT value = ";

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
     * @param value - int.
     */
    public void printMessageAndInt(String message, int value) {
        System.out.println(message + value);
    }
}
