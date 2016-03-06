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
        int[] sums  = new int[32];
        for (int number : input) {
            for (int j = 0; j < 32; j++) {
                int mask = 1 << j;
                if ((number & mask) != 0) {
                    sums[j] += 1;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += sums[31-i] % 5;
        }
        return result;
    }
}
