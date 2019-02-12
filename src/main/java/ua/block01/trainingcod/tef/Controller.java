package ua.block01.trainingcod.tef;

import java.util.Scanner;

/**
 * Created by User on 17.03.2016.
 */
public class Controller {

    /**
     * The Constants.
     */
    public static final int FOUR = 4;

    /**
     * Reference to the class Model.
     */
    private Model model;

    /**
     * Reference to the class View.
     */
    private View view;

    /**
     * Constructor.
     * @param model - reference Model.
     * @param view - reference View.
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * The Work method.
     */
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setValue(inputIntValueWithScanner(sc));
        model.addIntOurValue(FOUR);

        view.printMessageAndInt(View.OUR_INT, model.getValue());
    }

    /**
     * The Utility methods.
     * @param sc - Scanner.
     * @return - int.
     */
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
