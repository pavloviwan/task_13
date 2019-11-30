/** Задача №13
 * Необходимо провести сравнение длины двух строк,
 * которые были введены с клавиатуры и записаны в соответствующие переменные.
 * Вывести на экран строку с наибольшей длиной.
 * Если длины равны, вывести соответствтующее сообщение.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {
    public static void main (String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку 1:");
        String str1 = reader.readLine();
        System.out.println("Введите строку 2:");
        String str2 = reader.readLine();
        if (str1.length() > str2.length()) System.out.println(str1);
        else if (str1.length() < str2.length()) System.out.println(str2);
        else System.out.println("Длины строк равны!");
    }
}
