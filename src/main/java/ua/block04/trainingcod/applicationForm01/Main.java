package ua.block04.trainingcod.applicationForm01;

import ua.block04.trainingcod.applicationForm01.controller.Controller;
import ua.block04.trainingcod.applicationForm01.view.View;
import ua.block04.trainingcod.applicationForm01.model.Model;

public class Main {

    public static void main( String[] args ) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(view, model);

        controller.processUser();

    }
}