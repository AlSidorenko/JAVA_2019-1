package ua.block04.trainingcod.applicationForm01.controller;

import ua.block04.trainingcod.applicationForm01.view.View;

import java.util.Scanner;

import static ua.block04.trainingcod.applicationForm01.controller.RegexContainer.REGEX_LOGIN;
import static ua.block04.trainingcod.applicationForm01.controller.RegexContainer.REGEX_NAME_LAT;
import static ua.block04.trainingcod.applicationForm01.controller.RegexContainer.REGEX_NAME_UKR;
import static ua.block04.trainingcod.applicationForm01.view.TextConstant.FIRST_NAME;
import static ua.block04.trainingcod.applicationForm01.view.TextConstant.LOGIN_DATA;

/**
 * Created by student on 26.09.2017.
 */
public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, str);
        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);
    }
}
