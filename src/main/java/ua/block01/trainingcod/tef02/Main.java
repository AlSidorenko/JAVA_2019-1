package ua.block01.trainingcod.tef02;

/**
 * Created by User on 17.03.2016.
 */
public class Main {

    /**
     * Start method.
     * @param args - str array.
     */
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
