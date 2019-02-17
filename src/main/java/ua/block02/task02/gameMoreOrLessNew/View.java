package ua.block02.task02.gameMoreOrLessNew;

/**
 * Created by Student on 22.02.2017.
 */
public class View {

    // Utilities methods
    public void printMessage (String message){
        System.out.print(message);
    }

    public String concatenationString (String... message){
        StringBuilder concatString = new StringBuilder();
        for (String v : message){
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}
