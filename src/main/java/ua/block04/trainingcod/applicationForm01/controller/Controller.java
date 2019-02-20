package ua.block04.trainingcod.applicationForm01.controller;

import ua.block04.trainingcod.applicationForm01.view.View;
import ua.block04.trainingcod.applicationForm01.model.Model;

import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        TempNotebook tempNotebook = new TempNotebook(model, view, new UtilityController(view, scanner));

        tempNotebook.saveDataToModel();
    }
}