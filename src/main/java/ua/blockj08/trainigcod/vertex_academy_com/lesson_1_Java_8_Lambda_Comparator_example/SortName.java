package ua.blockj08.trainigcod.vertex_academy_com.lesson_1_Java_8_Lambda_Comparator_example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created on 15.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SortName {

    public static void print(List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("John", 28),
                new User("Jane", 35),
                new User("Alex", 21));

        System.out.println("Before sort:");
        print(users);

        //users.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        Comparator<User> c = (o1, o2) -> o1.getName().compareTo(o2.getName());
        users.sort(c.reversed());

        System.out.println("\nAfter sort:");
        print(users);
    }
}
