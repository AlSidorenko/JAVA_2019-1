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
public class Controller implements Const {

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

    public void processUser() {
        int answer = rand(MIN_VALUE, MAX_VALUE);
        System.out.println(answer);
        int numb, min = 0, max = 100;

        view.printMessage(View.CONCEIVED_NUMBER, MIN_VALUE, MAX_VALUE);

        do {
            view.printMessage(View.TRY_TO_GUESS);
            numb = sc.nextInt();
            model.setElemOfRange(numb);

            if (numb == answer) {
                view.printMessage(View.YOU_WON);
            } else if (numb < answer) {
                min = numb;
                view.printMessage(View.NUMB_IN_RANGE, min, max);
            } else if (numb > answer) {
                max = numb;
                view.printMessage(View.NUMB_IN_RANGE, min, max);
            } else {
                view.printMessage(View.ERROR);
                view.printMessage(View.NUMB_IN_RANGE, min, max);
            }
        } while (answer != numb);
    }
}
