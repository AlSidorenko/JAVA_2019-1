package ua.block01.trainingcod.tef03;

import java.util.Scanner;

/**
 * Created on 21.08.2019.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Controller {

    Scanner sc = new Scanner(System.in);

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public String word() {
        System.out.print(View.INPUT_NUMB);
        return sc.next();
    }

    public void processUser() {

        model.setValue(inputIntValueWithScanner(sc));
        model.addStringOurValue(word());

        view.printMessageAddText(View.OUR_INT, model.getValue());
    }

    public String inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.next();
    }
}
