package ua.block02.trainingcod.test;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

/**
 * Created on 12.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class TestArithmetics {

    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void runT() {
        a = new Arithmetics();
    }

    /*@Before
    public void runT() {
        a = new Arithmetics();
    }*/

    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        //if (res != 10.0) Assert.fail();
        //assertEquals(10.0, res, 0.0);
        //assertTrue("Result: ", res == 10);
        assertFalse(res == 8.0);
        //assertNull(a);
        //assertNotNull(a);
    }

    @Ignore
    @Test
    public void testDeduct() {
        double res = a.deduct(3, 7);
        if (res != -4.0) Assert.fail();
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        if (res != 21.0) Assert.fail();
    }

    @Test
    public void testDiv() {
        double res = a.div(10, 5);
        if (res != 2.0) Assert.fail();

        try {
            a.div(10, 0.0);
            fail();
        } catch (ArithmeticException e) { }
    }

    //@Test (expected = Exception.class)
    @Test
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    @Test //(timeout = 1000)
    public void testN() {
        a.div(10, 10);
        //while (true) { }
    }
}
