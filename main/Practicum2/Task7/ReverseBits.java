package main.Practicum2.Task7;

/**
 * Для даного числа поміняти всі біти місцями відносно центра.
 Наприклад:
 Для 2 (10) повернути 1073741824 (01000000000000000000000000000000).
 */
public class ReverseBits {
    public static void main(String[] args) {
        int x = new ReverseBits().reverse(-2147483647);
        System.out.println(x);
        System.out.println(Integer.toBinaryString(-2147483647));
        System.out.println(Integer.toBinaryString(x));
    }
    public int reverse(int input) {

        int result = 0;
        for (int i = 0; i<32; i++) {
            result<<=1;
            result |=((input>>i)&1);
        }
    return result;
    }
}
