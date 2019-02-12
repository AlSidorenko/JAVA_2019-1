package ua.block02.task02.game;

public class View {

    public static final String INPUT_INT_MIN_VALUE = "Please, enter MIN value of range: ";
    public static final String INPUT_INT_MAX_VALUE = "Please, enter MAX value of range: ";
    public static final String CONCEIVED_NUMBER = "Conceived number out of range";
    public static final String TRY_TO_GUESS = "Try to guess it: ";
    public static final String YOU_WON = "*** You are right! ***";
    public static final String DESIRED_NUMB = "Sorry, the desired number is";
    public static final String CLOSER = "closer to ";
    public static final String TRY_AGAIN = "Try again!";

    public void printMessage(String message){
        System.out.print(message);
    }

    public void printMessage(String message, int value){
        System.out.printf("%s %s.\n ", message, value);
    }

    public void printMessage(String message, int min, int max){
        System.out.printf("%s %s - %s.\n ", message, min, max);
    }
}
