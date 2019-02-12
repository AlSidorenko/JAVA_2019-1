package ua.block02.task02.game;

import java.util.Random;
import java.util.Scanner;

/**
 * Created on 11.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Controller {

    Scanner sc = new Scanner(System.in);

    View view;
    Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public int rand(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public void min() {
        view.printMessage(View.INPUT_INT_MIN_VALUE);
        model.setMinValue(sc.nextInt());
    }

    public void max() {
        view.printMessage(View.INPUT_INT_MAX_VALUE);
        model.setMaxValue(sc.nextInt());
    }

    public void processUser() {
        min();
        max();
        int answer = rand(model.getMinValue(), model.getMaxValue());
        int numb;

        view.printMessage(View.CONCEIVED_NUMBER, model.getMinValue(), model.getMaxValue());

        do {
            view.printMessage(View.TRY_TO_GUESS);
            numb = sc.nextInt();

            if (numb == answer) {
                view.printMessage(View.YOU_WON);
            } else {
                view.printMessage(View.DESIRED_NUMB);
                if (numb < answer) {
                    view.printMessage(View.CLOSER, model.getMaxValue());
                } else {
                    view.printMessage(View.CLOSER, model.getMinValue());
                }
                view.printMessage(View.TRY_AGAIN);
            }
        } while (answer != numb);
    }
}
