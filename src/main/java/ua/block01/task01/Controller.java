package ua.block01.task01;

import java.util.Scanner;

/**
 * Created on 07.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Controller {

    /**
     * The Constants.
     */
    public static final String[] SENTENCE = {"Hello", "world!"};

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
     * The work method.
     */
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setText(inputStrValueWithScanner(sc));
        view.printMessageResult(View.CORRECT_OPERATION, model.getText());

    }

    /**
     * The Utility methods.
     * @param sc - Scanner.
     * @return - str.
     */
    public String inputStrValueWithScanner(Scanner sc) {
        StringBuilder sb = new StringBuilder();

        view.printMessage(View.ENTER_FIRST_WORD);
        while (!sc.hasNext(SENTENCE[0])) {
            view.printMessage(View.WRONG_OPERATION);
            sc.next();
        }
        sb.append(sc.next());
        sb.append(" ");

        view.printMessage(View.ENTER_SECOND_WORD);
        while (!sc.hasNext(SENTENCE[1])) {
            view.printMessage(View.WRONG_OPERATION);
            sc.next();
        }
        sb.append(sc.next());

        return sb.toString();
    }
}
