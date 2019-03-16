package ua.blockj08.trainigcod.vertex_academy_com.lesson_3_Java_8_ReferencesToMethods;

import java.util.function.Function;

/**
 * Created on 16.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
class User {

    String name, surname;

    User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

interface UserFactory {
    User create(String name, String surname);
}

class Main {

    /*public static void main(String[] args) {
        UserFactory userFactory = User::new;
        User user = userFactory.create("John", "Snow");
    }*/

    public static void main(String[] args) {

        Function<String, String> trim = String::trim;
        String str = trim
                .andThen(String::toLowerCase)
                .andThen(StringBuilder::new)
                .andThen(StringBuilder::reverse)
                .andThen(StringBuilder::toString)
                .apply(" ABCDEFG ");
    }
}