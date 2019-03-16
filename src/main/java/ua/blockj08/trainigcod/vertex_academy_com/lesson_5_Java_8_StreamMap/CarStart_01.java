package ua.blockj08.trainigcod.vertex_academy_com.lesson_5_Java_8_StreamMap;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 16.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CarStart_01 {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AM1111BE", 2009),
                new Car("AK5555IT", 2010),
                new Car("AI5601CC", 2015),
                new Car("AI3838PP", 2017));

        /*
        for (Car car : cars) {
            System.out.println(car.getNumber());
        }
        */

        cars.stream()
                .map(Car::getNumber) // преобразовываем Stream машин в Stream номеров
                .forEach(System.out::println);
    }
}
