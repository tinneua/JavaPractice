package main.Practicum2.Task01;

import java.util.HashMap;
import java.util.Map;

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
        StringBuilder result = new StringBuilder();
        int aLength = a.length();
        int bLength = b.length();

        int tempMemory = 0;
        Map<Character,Integer> abc = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            abc.put((char)('0' + i), i);
        }

        for (int i = 0; i < 26; i++) {
            abc.put((char)('a' + i), i + 10);
            abc.put((char)('A' + i), i + 10);
        }

        for (int i = 0; i < aLength || i < bLength; i++) {
            char tempA = ( i < aLength) ? a.charAt(aLength - i - 1) : '0';
            char tempB = ( i < bLength) ? b.charAt(bLength - i - 1) : '0';

            int sum = tempMemory + abc.get(tempA) + abc.get(tempB);
            if (sum < 36) {
                result.append(fromInt(sum));
                tempMemory = 0;
            } else {
                result.append(fromInt(sum % 36));
                tempMemory = 1;
            }
        }
        if (tempMemory == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }
    private char fromInt(int num) {
        if (num < 10) {
            return (char) ('0' + num);
        } else {
            return (char) ('a' + num -10);
        }
    }
}
