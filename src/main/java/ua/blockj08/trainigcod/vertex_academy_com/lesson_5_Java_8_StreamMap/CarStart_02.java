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
public class CarStart_02 {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

        /*
        for (Car car : cars) {
            if (car.getYear() > 2010) {
                String number = car.getNumber();
                if (number != null && !number.isEmpty())
                    System.out.println(number);
            }
        }
        */

        cars.stream()
                .filter(c -> c.getYear() > 2010) // выбираем только машины, выпущенные после 2010 года
                .map(Car::getNumber) // преобразовываем Машины в номера, теперь у нас Stream номеров машин
                .filter(s -> s != null && !s.isEmpty()) // выбираем только не пустые номера
                .forEach(System.out::println); // выводим результат
    }
}
