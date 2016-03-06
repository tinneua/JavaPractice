package main.Practicum2.Task5;

import java.util.Arrays;

/**
 * Дано масив цілих чисел. Всі числа в масиві повторюються рівно 5 разів і лише одне число не має дублікатів.
 Знайти число, що неповторюється.
 Складність рішення по часу повинна бути O(N).
 */
public class LonelyNumber {
    public static void main(String[] args) {
        int[] array = {7,7,7,7,7,5,5,5,5,5,3};
        System.out.println(new LonelyNumber().find(array));
    }
    public int find(int[] input) {
        int[] units = new int[32];
        int result = 0;

        for (int number : input) {
            int mask = 1;
            for (int j = 0; j < 32; j++) {
                boolean hasBit = (number & mask) != 0;
                units[31 - j] += hasBit ? 1 : 0;
                mask <<= 1;
            }
        }

        for (int unit : units) {
            unit %= 5;
            result = result << 1;
            result += (unit & 1);
        }

        return result;
    }
}
