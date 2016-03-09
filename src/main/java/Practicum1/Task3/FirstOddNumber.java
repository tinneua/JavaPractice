package Practicum1.Task3;

/**
 * Знайти перше непарне число і повернути його індекс. Якщо такого немає, повернути -1
 */
public class FirstOddNumber {
    public static void main(String[] args) {
    int[] input = {2,2,2,4,4};
        System.out.println(new FirstOddNumber().find(input));
    }
    public int find(int[] input) {
        int num = -1;
        for (int i = 0; i<input.length;i++) {
            if (input[i]%2 != 0) {
                num = i;
                break;
                }
            }
        return num;
    }
}
