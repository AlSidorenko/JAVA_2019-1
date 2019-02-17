package ua.block01.trainingcod.tef02;

import java.util.Scanner;

/**
 * Created by User on 17.03.2016.
 */
public class Controller implements TextConstants {

    public static final int FOUR = 4;

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setValue(inputIntValueWithScanner(sc));
        model.addIntOurValue(FOUR);

        view.printMessageAndInt(OUR_INT, model.getValue());
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(WRONG_INPUT_INT_DATA + INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
