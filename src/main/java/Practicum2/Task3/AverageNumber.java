package Practicum2.Task3;

/**
 * Знайти середнє значення двох цілих чисел.
 Приклади:
 average( 4, 6 ) = 5
 average( -4, -7 ) = -5
 average( -4, 7 ) = 1
 */
public class AverageNumber {
    public static void main(String[] args) {
        int a = -2147483648;
        int b = -2;
        System.out.println(new AverageNumber().average(a, b));
    }
    public int average (int a, int b) {
        if (Integer.MIN_VALUE == a && Integer.MIN_VALUE == b)
            return Integer.MIN_VALUE;
        if (Integer.MIN_VALUE == a || Integer.MIN_VALUE == b)
            return (a>>1)+(b>>1);
        if (a<0&&b<0) {
            return (a+b)/2;
        }
        return (a+b) >>>1;
    }
}
