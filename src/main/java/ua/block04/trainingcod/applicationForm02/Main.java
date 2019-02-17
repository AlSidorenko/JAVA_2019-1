package ua.block04.trainingcod.applicationForm02;

import ua.block04.trainingcod.applicationForm02.controller.Controller;
import ua.block04.trainingcod.applicationForm02.model.Model;
import ua.block04.trainingcod.applicationForm02.view.View;

/**
 * Created on 13.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Main {

    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);
        // Run
        controller.processUser();
    }
}
