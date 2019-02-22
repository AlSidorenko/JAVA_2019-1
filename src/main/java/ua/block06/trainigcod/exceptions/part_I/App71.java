package ua.block06.trainigcod.exceptions.part_I;

/**
 * Created on 22.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class App71 {

    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Exception();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // не заходим - выполнение НЕ в норме
        } catch (Exception e) {
            System.err.print(" 6");     // ЗАХОДИМ - есть подходящее исключение
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
    }
}
