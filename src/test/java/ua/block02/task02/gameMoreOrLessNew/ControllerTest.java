package ua.block02.task02.gameMoreOrLessNew;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created on 18.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ControllerTest {

    @Test
    public void testFixedRand() {
        Model model = new Model();
        // [1-99]
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
        for (int i = 0; i < 100; i++) {
            model.setSecretValue();
            int randNumber = model.getSecretValue();
            assertTrue(randNumber > GlobalConstants.PRIMARY_MIN_BARRIER
                    && randNumber < GlobalConstants.PRIMARY_MAX_BARRIER);
        }
    }

    @Test
    public void testFlexibleRandForFiveAndFifteen() {
        Model model = new Model();
        int min = 5;
        int max = 15;
        model.setPrimaryBarrier(min, max);
        for (int i = 0; i < 100; i++) {
            model.setSecretValue();
            int randNumber = model.getSecretValue();
            assertTrue(randNumber > min && randNumber < max);
        }
    }

    @Test
    public void testFlexibleRandForTenAndSixty() {
        Model model = new Model();
        int min = 10;
        int max = 60;
        model.setPrimaryBarrier(min, max);
        for (int i = 0; i < 100; i++) {
            model.setSecretValue();
            int randNumber = model.getSecretValue();
            assertTrue(randNumber > min && randNumber < max);
        }
    }


    @Test
    public void testCheckEquality() {
        Model model = new Model();
        int number = 10;
        boolean result = model.checkValue(number);
        assertTrue(result);
    }
}
