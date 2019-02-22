package ua.block06.trainigcod.exceptions.part_II;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created on 22.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Parent_01 {

    // предок пугает IOException и InterruptedException
    public void f() throws IOException, InterruptedException {}
}

class Child_01 extends Parent_01 {
    // а потомок пугает только потомком IOException
    @Override
    public void f() throws FileNotFoundException {}
}
