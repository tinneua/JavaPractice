package main.Practicum2.Task8;

/**
 * Для даного числа порахувати кількість біт.
 Наприклад:
 Для числа 13 в бінарному вигляді 1101 повернути 3.
 */
public class CountBits {
    public static void main(String[] args) {
        System.out.println(new CountBits().count(13));
    }
    public int count(int num) {
        //0000 ... 1101 num
        //0000 ... 0110 >>1
        //0000 ... 0011 >>1
        //0000 ... 0001 >>1
        //0000 ... 0000 >>1
        int counter = 0;
        for (int i =1; i<=32; i++) {
            int mask = 1 << (i-1);
            int temp = mask&num;
            if (temp!=0) {
                counter++;
            }
        }
        return counter;
    }
}
