package ua.block04.trainingcod.applicationForm02.controller;

import ua.block04.trainingcod.applicationForm02.model.Model;
import ua.block04.trainingcod.applicationForm02.view.View;

import java.util.Scanner;

/**
 * Created on 13.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {

        Scanner scanner = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(view, model, new UtilityController(view, scanner));
        inputNoteBook.saveDateToModel();

    }
}
