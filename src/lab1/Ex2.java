package lab1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int n_row = sc.nextInt();
        System.out.print("Enter number of column: ");
        int n_col = sc.nextInt();
        System.out.println("Number of rows: " + n_row);
        System.out.println("Number of column: " + n_col);

        int[][] matrix = new int[n_row][n_col];

        for (int i = 0; i < n_row; i++){
            for (int j = 0; j < n_col; j++){
                System.out.printf("Enter matrix [%d][%d]: ", (i+1), (j+1));
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix");
        for (int[] temp_matrix: matrix){
            for (int value: temp_matrix){
                System.out.print(" " + value + " ");
            }
            System.out.println();
        }
    }
}
