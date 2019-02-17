package ua.block04.trainingcod.applicationForm02.controller;

import ua.block04.trainingcod.applicationForm02.view.TextConstants;
import ua.block04.trainingcod.applicationForm02.view.View;

import java.util.Scanner;

/**
 * Created on 13.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class UtilityController {

    private View view;
    private Scanner scanner;

    public UtilityController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public String inputValueStringWithRegex(String regex) {
        String value = scanner.next();
        while (!(value.matches(regex))) {
            view.printMessage(TextConstants.WRONG_INPUT_DATA);
            value = scanner.next();
        }
        return value;
    }
}
