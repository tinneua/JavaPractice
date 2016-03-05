package main.Practicum2.Task01;

import java.math.BigInteger;

/**
 * Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
 Повернути суму чисел, також в системі 36.
 Наприклад:
 "9" + "1" = "a"
 "z" + "1" = "10"
 */
public class AddNumBase36 {
    public static void main(String[] args) {
        String a = "zytrdzgt4689uihfsetjlujrqxkliuteaz";
        String b = "1jhffxdfztstrdfyuiy9754542342thjp";
        System.out.println(new AddNumBase36().add(a,b));
    }
    public String add(String a, String b) {
        BigInteger x = new BigInteger(a,36).add( new BigInteger(b,36));
        return x.toString(36);
    }
}
