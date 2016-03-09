package Practicum3.Task6;

/**
 * Дано відсортований масив унікальних чисел
 * Необхідно реалізувати функцію пошуку target числа
 * що працює за O(logN)
 * Якщо число існує в масиві - повернути індекс, в іншому випадку -1-(insertionIndex)
 * Де insertionIndex це індекс куди можно було б вставити index.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0,1};
        System.out.println(new BinarySearch().find(array,5));
    }
    public int find(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) >>> 1;
            if (array[middle] == target) return middle;
            if (array[middle] < target) {
                start = middle + 1;
            } else end = middle - 1;
        }

        return -1 - start;
    }
}
