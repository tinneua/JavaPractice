package Practicum2.Task6;

/**
 * Перевірити чи являється бінарне представлення числа поліндромом.
 * 0000 0000 0000 0001 1000 0000 0000 0000
 */
public class BitsPalindrome {
    public static void main(String[] args) {
        System.out.println(new BitsPalindrome().isPalindrome(-2147483647));

    }
    public boolean isPalindrome(int input) {
        for (int i = 0;  i < 16; i++) {

            if (((input >> i) & 1) != ((input >> (31 - i)) & 1)) {
                return false;
            }
        }
        return true;
    }
}
