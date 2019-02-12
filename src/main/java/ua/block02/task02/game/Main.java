package ua.block02.task02.game;

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
