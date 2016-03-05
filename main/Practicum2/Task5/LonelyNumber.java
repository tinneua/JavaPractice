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
        int Num = input[0];

        int tempMaxIndex;
        int tempMinIndex;
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            int anInput = input[i];
            tempMaxIndex = (i + 1) > input.length - 1 ? i-1 : i+1;
            tempMinIndex = (i - 1) < 0 ? i + 1 : i-1;
            if (input[i]!=input[tempMaxIndex] && input[i]!=input[tempMinIndex]) {
                Num = anInput;
            }
        }
        return Num;
    }
}
