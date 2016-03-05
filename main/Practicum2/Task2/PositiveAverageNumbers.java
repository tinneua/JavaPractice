package main.Practicum2.Task2;

/**
 * Знайти середнє арифметике двух додатніх чисел.
 Наприклад:
 average( 2, 4 ) = 3
 average( 4, 7 ) = 5
 */
public class PositiveAverageNumbers {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = 2147483647;
        System.out.println(new PositiveAverageNumbers().average(a,b));
    }
    public int average(int a, int b) {

        if (Integer.MAX_VALUE == a && Integer.MAX_VALUE == b)
            return Integer.MAX_VALUE;
        if (Integer.MAX_VALUE == a || Integer.MAX_VALUE == b)
            return (a >> 1) + (b >> 1);
        return (a+b) >>>1;
    }
}
