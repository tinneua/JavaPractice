package Practicum1.Task2;

/**
 * Обчислити суму цифр числа.
 Наприклад сума цифр числа 123 дорівнює  6.
 */

public class SumDigits {
    public static void main(String[] args) {
    int num = 123;
        System.out.println(new SumDigits().sum(num));
    }
    public int sum(int number) {
        int sum = 0;
        while (number !=0) {
            sum += number % 10;
            number /= 10;
        }
        return Math.abs(sum);
    }
}
