package ua.blockj08.trainigcod.vertex_academy_com.lesson_3_Java_8_ReferencesToMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created on 16.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class UserStart {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Nick", "Boll"));
        users.add(new User("Jan", "Nicky"));
        users.add(new User("Bot", "Smart"));

        users.sort(Comparator.comparing(User::getName));
        users.forEach(System.out::println);
    }
}
