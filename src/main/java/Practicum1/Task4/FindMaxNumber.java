package Practicum1.Task4;

/**
 * Знайти максимальне число в масиві.
 Гарантується, що масив завжди не пустий.
 */
public class FindMaxNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,10};
        System.out.println(new FindMaxNumber().max(array));
    }
    public int max(int[] input) {
        int max = input[0];
        for (int anInput : input) {
            max = anInput > max ? anInput : max;
        }
        return max;
        }
}
