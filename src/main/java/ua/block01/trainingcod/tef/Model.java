package ua.block01.trainingcod.tef;

/**
 * Created by User on 17.03.2016.
 */
public class Model {

    /**
     * int variable.
     */
    private int value;

    /**
     * The Program logic.
     *
     * @param valueInt - int.
     * @return sum - res.
     */
    public int addIntOurValue(int valueInt) {
        value += valueInt;
        return value;
    }

    /**
     * Get method.
     * @return - int.
     */
    public int getValue() {
        return value;
    }

    /**
     * Set method.
     * @param value - int.
     */
    public void setValue(int value) {
        this.value = value;
    }
}
