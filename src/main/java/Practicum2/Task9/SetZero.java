package Practicum2.Task9;

/**
 * Дано число. Треба замінити i-й біт замінити на нуль.
 Наприклад:
 для числа 6 в бінарному вигляді 110,
 замінивши 2-й біт на нуль отримаємо 100 тобто 4.
 1<= i <= 32
 */
public class SetZero {
    public static void main(String[] args) {
        int x = new SetZero().set(55,2);
        System.out.println(x);

    }
    public int set(int num, int i) {
        int mask = 1 << (i-1);
        return ~mask & num;
    }
}
