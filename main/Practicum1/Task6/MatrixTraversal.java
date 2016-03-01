package main.Practicum1.Task6;


import java.util.Arrays;


/**
 * Обійти матрицю по спіралі і записати всі числа в одмірний масив.
 Для матриці
 [[1,   2,  3,  4],
 [5,   6,  7,  8]
 [9,  10, 11, 12]
 [13, 14, 15, 16]]
 вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
 */
public class MatrixTraversal {
    public static void main(String[] args) {

        int[][] a = { {1,2},{3,4}};
        int[] end = new MatrixTraversal().print(a);
        System.out.println(Arrays.toString(end));
    }
    public int[] print(int[][] input) {

        int iMin = 0;
        int iMax = input.length-1;
        int jMin = 0;
        int jMax = input[0].length-1;
        int k =0;
        int[] arr = new int[(iMax+1)*(jMax+1)];
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int j = jMin; j <= jMax && input[0].length>0; j++) {
                arr[k] = input[iMin][j];
                k++;
            }
            iMin++;
            for (int i = iMin; i <= iMax && input.length>0; i++) {
                arr[k] = input[i][jMax];
                k++;
            }
            jMax--;
            for (int j = jMax; j >= jMin && iMin<=iMax; j--) {
                arr[k] = input[iMax][j];
                k++;
            }
            iMax--;

            for (int i = iMax; i >= iMin && jMin<=jMax; i--) {
                arr[k] = input[i][jMin];
                k++;
                flag = true;
            }
            jMin++;
        }
        return arr;
    }
}
