package ua.block04.trainingcod.applicationForm01;


import ua.block04.trainingcod.applicationForm01.controller.Controller;
import ua.block04.trainingcod.applicationForm01.model.Model;
import ua.block04.trainingcod.applicationForm01.view.View;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller controller =
                new Controller(new Model(), new View());
        // Run
        controller.processUser();
    }
}
