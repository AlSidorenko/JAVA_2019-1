package ua.block03.trainingcod.moreOrLess;

/**
 * Created by Student on 22.02.2017.
 */
public class View {

    // Utilities methods
    public void printMessage (String message){
        System.out.println(message);
    }

    public String concatenationString (String... message){
        StringBuilder concatString = new StringBuilder();
        for (String v : message){
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}
