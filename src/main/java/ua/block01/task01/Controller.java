package ua.block01.task01;

import java.util.Scanner;

/**
 * Created on 07.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Controller implements TextConstants {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setText(inputStrValueWithScanner(sc));
        view.printMessageResult(CORRECT_OPERATION, model.getText());

    }

    public String inputStrValueWithScanner(Scanner sc) {
        StringBuilder sb = new StringBuilder();

        view.printMessage(ENTER_FIRST_WORD);
        while (!sc.hasNext(HELLO)) {
            view.printMessage(WRONG_OPERATION);
            sc.next();
        }
        sb.append(sc.next());
        sb.append(" ");

        view.printMessage(ENTER_SECOND_WORD);
        while (!sc.hasNext(WORLD)) {
            view.printMessage(WRONG_OPERATION);
            sc.next();
        }
        sb.append(sc.next());

        return sb.toString();
    }
}
