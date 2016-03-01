package main.Practicum1.Task5;

import java.util.Arrays;

/**
 * Обійти матрицю "змійкою" і повернути всі числа в одномірному масиві.
 Наприклад:
 Для
 [[ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]]
 повернути
 [1, 4, 7, 8, 5, 2, 3, 6, 9]
 */
public class MatrixSnakeTraversal {
    public static void main(String[] args) {
        int[][] a = { {}};
        int[] end = new MatrixSnakeTraversal().print(a);
        System.out.println(Arrays.toString(end));
    }
    public int[] print(int[][] input) {
        int iMin = 0;
        int iMax = input.length-1;
        int jMin = 0;
        int jMax = input[0].length-1;
        int k =0;
        int[] arr = new int[(iMax+1)*(jMax+1)];

        while(jMin<input[0].length) {
            for (int i = 0; i<= iMax && input.length>0; i++) {
                arr[k] = input[i][jMin];
                k++;
            }
            jMin++;
            for (int i = iMax; i>= iMin && jMin<=jMax; i--) {
                arr[k] = input[i][jMin];
                k++;
            }
            jMin++;
        }
        return arr;
    }
}
