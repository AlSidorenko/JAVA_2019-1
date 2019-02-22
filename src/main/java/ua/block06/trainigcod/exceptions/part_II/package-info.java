/**
 * Created on 22.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ua.block06.trainigcod.exceptions.part_II;

/*
    Это вторая часть статьи (первая часть — try-catch-finally), посвященной такому языковому механизму Java
как исключения. Она имеет вводный характер и рассчитана на начинающих разработчиков или тех,
кто только приступает к изучению языка.

Также я веду курс «Scala for Java Developers» на платформе для онлайн-образования udemy.com (аналог Coursera/EdX).

1. Магия checked/unchecked
2. Пессимистичный механизм
3. throws с непроверяемым (unckecked) исключением
4. Множественные исключения
5. Или catch, или throws
6. Поведение компилятора/JVM
7. Overriding и throws
8. Передача свойства по наследству


1. «Магия» checked/unchecked


    Механизм исключительных ситуация в Java связан с двумя элементами «магии», т.е. поведения,
которое никак не отражено в исходном коде:
1. «Магию» java.lang.Throwable — в throw, catch и throws могут стоять исключительно Throwable или его наследники
   (мы уже разбирали в предыдущей лекции). Это «право» находиться в throw, catch и throws никак не отражено
   в исходном коде.
2. Все исключительные ситуации делятся на «проверяемые» (checked) и «непроверяемые» (unchecked).
   Это свойство присуще «корневищу» (Throwable, Error, Exception, RuntimeException) и передается по наследству.
   Никак не видимо в исходном коде класса исключения.

В дальнейших примера просто учтите, что
— Throwable и Exception и все их наследники (за исключением наследников Error-а и RuntimeException-а) — checked
— Error и RuntimeException и все их наследники — unchecked

checked exception = проверяемое исключение, проверяемое компилятором.
Что именно проверяет компилятор мы разберем на этой лекции.

Напомним иерархию исключений
                    Object
                      |
                  Throwable
                  /      \
              Error     Exception
                            |
                    RuntimeException


Расставим значение свойства checked/unchecked
                    Object
                      |
               Throwable(CHECKED)
               /            \
     Error(UNCHECKED)    Exception(CHECKED)
                            |
                  RuntimeException(UNCHECKED)



2. Пессимистичный механизм


Я называю связь между проверяемыми исключениями и throws — «пессимистичной», польку мы можем «напугать» о большем,
чем может произойти на самом деле, но не наоборот
*/

    /*
Мы не можем бросать, но не предупредить
public class App01 {
    public static void main(String[] args) {
        throw new Exception(); // тут ошибка компиляции
    }
}

>> COMPILATION ERROR: unhandled exception: java.lang.Exception
*/

    /*

Мы не можем бросать, но предупредить о «меньшем»
import java.io.IOException;

public class App01 {
    public static void main(String[] args) throws IOException {
        throw new Exception(); // тут ошибка компиляции
    }
}

>> COMPILATION ERROR: unhandled exception: java.lang.Exception
*/

    /*
Мы можем предупредить точно о том, что бросаем
public class App01 {
    public static void main(String[] args) throws Exception { // предупреждаем о Exception
        throw new Exception(); // и кидаем Exception
    }
}
*/

    /*
Мы можем предупредить о большем, чем мы бросаем
public class App01 {
    public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
        throw new Exception(); // а кидаем только Exception
    }
}
*/

/*
Можем даже предупредить о том, чего вообще нет
public class App01 {
    public static void main(String[] args) throws Exception { // пугаем
        // но ничего не бросаем
    }
}
*/


/*
Даже если предупреждаем о том, чего нет — все обязаны бояться
public class App01 {
    public static void main(String[] args) {
        f(); // тут ошибка компиляции
    }

    public static void f() throws Exception {
    }
}

>> COMPILATION ERROR: unhandled exception: java.lang.Exception
*/

/*
Хотя они (испугавшиеся) могут перепугать остальных еще больше
public class App01 {
    // они пугают целым Throwable
    public static void main(String[] args) throws Throwable {
        f();
    }
    // хотя мы пугали всего-лишь Exception
    public static void f() throws Exception {
    }
}
*/

/*
В чем цель «пессимистичности»? Все достаточно просто.
Вы в режиме протипирования «набросали», скажем, класс-утилиту для скачивания из интернета
public class InternetDownloader {
    public static byte[] (String url) throws IOException {
        return "<html><body>Nothing! It's stub!</body></html>".getBytes();
    }
}

и хотели бы «принудить» пользователей вашего класса УЖЕ ОБРАБАТЫВАТЬ возможное исключение IOException,
хотя из реализации-пустышки вы ПОКА НЕ ГЕНЕРИРУЕТЕ такое исключение. Но в будущем — собираетесь.
*/

/*
3. throws с непроверяемым (unckecked) исключением

Вызов метода, который «пугает» unchecked исключением не накладывает на нас никаких обязанностей.
public class App01 {
    public static void main(String[] args) {
        f();
    }
    public static void f() throws RuntimeException {
    }
}

Эта конструкция служит цели «указать» программисту-читателю кода на то, что ваш метод может выбросить некоторое
непроверяемое (unchecked) исключение.

Пример (java.lang.NumberFormatException — непроверяемое исключение):
package java.lang;

public final class Integer extends Number implements Comparable<Integer> {
    ...
    /**
     * ...
     *
     * @param s    a {@code String} containing the {@code int}
     *             representation to be parsed
     * @return     the integer value represented by the argument in decimal.
     * @exception  NumberFormatException  if the string does not contain a
     *               parsable integer.
     */
/*
    public static int parseInt(String s) throws NumberFormatException {
        return parseInt(s,10);
    }
    ...
}

Integer.parseInt() может бросить unchecked NumberFormatException на неподходящем аргументе
(int k = Integer.parseInt(«123abc»)), это отразили
        — в сигнатуре метода: throws NumberFormatException
        — в документации (javadoc): @ exception
но это ни к чему нас не обязывает.
*/

/*
        4. Множественные исключения

        Рассмотрим ситуацию с кодом, который может бросать проверяемые исключения разных типов.
        Далее учитывайте, что EOFException и FileNotFoundException — потомки IOException.

        Мы можем точно указать, что выбрасываем
        import java.io.EOFException;
        import java.io.FileNotFoundException;

public class App01 {
    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}
*/

/*
    или вот так
        import java.io.EOFException;
        import java.io.FileNotFoundException;

public class App01 {
    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        f0();
        f1();
    }
    public static void f0() throws EOFException {...}
    public static void f1() throws FileNotFoundException {...}
}
*/

/*
    А можем «испугать» сильнее (предком обоих исключений)
        import java.io.EOFException;
        import java.io.FileNotFoundException;
        import java.io.IOException;

public class App01 {
    // пугаем ПРЕДКОМ исключений
    public static void main(String[] args) throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}
*/

/*
    или вот так
        import java.io.EOFException;
        import java.io.FileNotFoundException;

public class App01 {
    // пугаем ПРЕДКОМ исключений
    public static void main(String[] args) throws IOException {
        f0();
        f1();
    }
    public static void f0() throws EOFException {...}
    public static void f1() throws FileNotFoundException {...}
}
*/

/*
    Можно и вот так: EOFException и FileNotFoundException «обобщаем до» IOException,
    а InterruptedException «пропускаем нетронутым» (InterruptedException — НЕ потомок IOException)
        import java.io.EOFException;
        import java.io.FileNotFoundException;

public class App01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        f0();
        f1();
        f2();
    }
    public static void f0() throws EOFException {...}
    public static void f1() throws FileNotFoundException {...}
    public static void f2() throws InterruptedException {...}
}
*/

/*
5. Или catch, или throws

        Не надо пугать тем, что вы перехватили
        так
public class App01 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            // ...
        }
    }
}
*/

/*
    или так (ставим catch по предку и точно перехватываем)
public class App01 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Throwable e) {
            // ...
        }
    }
}
*/

/*
    Но если перехватили только потомка, то не выйдет
public class App01 {
    public static void main(String[] args) {
        try {
            throw new Throwable();
        } catch (Exception e) {
            // ...
        }
    }
}

>> COMPILATION ERROR: unhandled exception: java.lang.Throwable
*/

/*
        Не годится, естественно, и перехватывание «брата»
public class App01 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Error e) {
            // ...
        }
    }
}

>> COMPILATION ERROR: unhandled exception: java.lang.Exception
*/

/*

        Если вы часть перехватили, то можете этим не пугать
        import java.io.EOFException;
        import java.io.FileNotFoundException;

public class App01 {
    // EOFException перехватили catch-ом, им не пугаем
    public static void main(String[] args) throws FileNotFoundException {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new EOFException();
            } else {
                throw new FileNotFoundException();
            }
        } catch (EOFException e) {
            // ...
        }
    }
}
*/

/*
6. Поведение компилятора/JVM

        Необходимо понимать, что
        — проверка на cheched исключения происходит в момент компиляции (compile-time checking)
        — перехват исключений (catch) происходит в момент выполнения (runtime checking)
public class App01 {
    // пугаем Exception
    public static void main(String[] args) throws Exception {
        Throwable t = new Exception(); // и лететь будет Exception
        throw t; // но тут ошибка компиляции
    }
}

>> COMPILATION ERROR: unhandled exception: java.lang.Throwable
*/

/*
        Полная аналогия с
public class App01 {
    public static void main(String[] args) throws Exception {
        Object ref = "Hello!";  // ref указывает на строку
        char c = ref.charAt(0); // но тут ошибка компиляции
    }
}

>> COMPILATION ERROR: Cannot resolve method 'charAt(int)'
*/

/*
        Хотя ССЫЛКА ref УКАЗЫВАЕТ на объект типа java.lang.String (у которого имеется метод charAt(int)),
        но ТИП ССЫЛКИ — java.lang.Object (ссылка типа java.lang.Object на объект типа java.lang.String).
        Компилятор ориентируется на «левый тип» (тип ссылки, а не тип ссылаемого) и не пропускает такой код.

        Хотя В ДАННОЙ СИТУАЦИИ компилятор мог бы разобрать, что t ссылается на Exception, а ref — на String,
        но этого уже невозможно сделать при раздельно компиляции. Представьте, что мы МОГЛИ БЫ скомпилировать ОТДЕЛЬНО
        такой класс, упаковать в jar и распространять
// НЕ КОМПИЛИРУЕТСЯ! ИССЛЕДУЕМ ГИПОТЕТИЧЕСКУЮ СИТУАЦИЮ!
public class App01 {
    public static void f0(Throwable t) throws Exception {
        throw t;
    }
    public static void f1(Object ref){
        char c = ref.charAt(0);
    }
}
*/

/*
    А кто-то берет этот класс, добавляет в classpath и вызывает App01.f0(new Throwable()) или App01.f1(new Integer(42)).
    В таком случае JVM столкнулась бы с ситуацией, когда от нее требует бросить проверяемое исключение,
    которое не отследил компилятор (в случае с f0) или вызвать метод, которого нет (в случае с f1)!

        Java — язык со статической типизацией (т.е. отслеживание корректности использования типов
        (наличие используемых полей, наличие вызываемых методов, проверка на checked исключения, ...)
        проводится компилятором), запрещает такое поведение.
        В некоторых языках (языки с динамической типизацией — отслеживание корректности использования типов проводится
        средой исполнения (оно разрешено, например в JavaScript).

        Компилятор не пропустит этот код, хотя метод main ГАРАНТИРОВАННО НЕ ВЫБРОСИТ ИСКЛЮЧЕНИЯ
public class App01 {
    // пугаем Exception
    public static void main(String[] args) throws Exception {
        try {
            Throwable t = new Exception(); // и лететь будет Exception
            throw t; // но тут ошибка компиляции
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
}

>> COMPILATION ERROR: unhandled exception: java.lang.Throwable
*/

/*
public class App01 {
    // ТЕПЕРЬ пугаем Throwable
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception(); // а лететь будет Exception
            throw t;
        } catch (Exception e) { // и мы перехватим Exception
            System.out.println("Перехвачено!");
        }
    }
}

>> Перехвачено!
*/

/*
        7. Overriding и throws

        При переопределении (overriding) список исключений потомка не обязан совпадать с таковым у предка.
        Но он должен быть «не сильнее» списка предка:
        import java.io.FileNotFoundException;
        import java.io.IOException;

public class Parent_01 {
    // предок пугает IOException и InterruptedException
    public void f() throws IOException, InterruptedException {}
}

class Child_01 extends Parent_01 {
    // а потомок пугает только потомком IOException
    @Override
    public void f() throws FileNotFoundException {}
}
*/

  /*
    Однако тут мы попытались «расширить тип» бросаемых исключений
        import java.io.IOException;

public class Parent_02 {
    public void f() throws IOException, InterruptedException {}
}

class ChildB extends Parent_02 {
    @Override
    public void f() throws Exception {}
}

>> COMPILATION ERROR: overridden method does not throw 'java.lang.Exception'
*/

  /*
        Почему можно сужать тип, но не расширять?
        Рассмотрим следующую ситуацию:
public class Parent_03 {
    // предок пугает Exception
    public void f() throws Exception {}
}


// тут ошибка компиляции в Java, но, ДОПУСТИМ, ее нет
public class Child_03 extends Parent_03 {
    // потомок расширил Exception до Throwable
    public void f() throws Throwable {}
}


public class Demo {
    public static void test(Parent_03 ref) {
        // тут все компилируется, Parent_03.f() пугает Exception и мы его ловим catch
        try {
            ref.f();
        } catch(Exception e) {}
    }
}


public class App01 {
    public static void main(String[] args) {
        // тут все компилируется, Demo.test хотел Parent_03 и мы дали ему подтип - Child_03
        Demo.test(new Child_03());
    }
}


    Внимательно посмотрите на этот пример — если бы потомок мог расширять тип бросаемого исключения предка,
    то те места которые «ждут» предка, а получают экземпляр «расширенного» потомка могли бы неконтролируемо выбрасывать
    проверяемые исключения
*/

  /*
        8. Передача свойства по наследству

        Напомним иерархию исключений с расставленными флагами свойства checked/unchecked
        Object
        |
        Throwable(CHECKED)
        /            \
        Error(UNCHECKED)    Exception(CHECKED)
        |
        RuntimeException(UNCHECKED)

        Логика расположения свойства НЕ СВЯЗАНА С НАСЛЕДОВАНИЕМ. Эту логику мы рассмотрим позже (в следующих статьях).
        Однако свойство checked/unchecked пользовательских классов исключений строится
        ИСКЛЮЧИТЕЛЬНО НА ОСНОВЕ НАСЛЕДОВАНИЯ.

        Правило крайне простое:
        1. Если исключение из списка Throwable, Error, Exception, RuntimeException — то твое свойство надо просто
           запомнить.
        2. Если ты не из списка, то твое свойство равно свойству предка. Нарушить наследование тут нельзя.

        Если мы породим потомков A, B, C, D, E, F, G, H, I, J, K, L которые следующим образом наследуются от «корневища»
        (Throwable, Error, Exception, RuntimeException), то значение их свойства checked/unchecked можно увидеть на схеме
        Object
        |
        Throwable(CHECKED)
        /    |       \
        Error(UNCHECKED)   |   Exception(CHECKED)
        |       |       |      |            |
        A(UNC)  D(UNC)  |      F(C)        RuntimeException(UNCHECKED)
        /   \             |     /   \             |       |
        B(UNC) C(UNC)       |   G(C)  H(C)          I(UNC)  J(UNC)
                          E(C)   /   \
                            K(UNC) L(UNC)

 */