package ua.block01.trainingcod.tef03;

/**
 * Created on 21.08.2019.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Model {

    private String value;

    protected String addStringOurValue (String text) {
        return value += text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
