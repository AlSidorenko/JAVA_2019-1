package ua.blockj08.trainigcod.vertex_academy_com.lesson_1_Java_8_Lambda_Comparator_example;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 15.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SortingWithMultipleConditions {

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

        // sort by comparator
        /*Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getAge() == o2.getAge())
                    return o1.getName().compareTo(o2.getName());
                else return o1.getAge() - o2.getAge();
            }
        });*/

        users.sort((o1, o2) -> {
            if (o1.getAge() == o2.getAge())
                return o1.getName().compareTo(o2.getName());
            else return o1.getAge() - o2.getAge();
        });

        System.out.println("\nAfter sort:");
        print(users);
    }
}
