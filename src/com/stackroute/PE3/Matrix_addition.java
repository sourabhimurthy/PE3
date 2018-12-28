package com.stackroute.PE3;
import java.util.Scanner;

public class Matrix_addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int col = sc.nextInt();
        int[][] first = new int[row][col];
        int[][] second = new int[row][col];

        System.out.println("Enter the input of first matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                first[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the input of second matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                second[i][j] = sc.nextInt();
            }
        }
        int[][] res = sumOfMatrix(first, second);
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(res[i][j]);
            }
        }
    }


    public static int[][] sumOfMatrix(int[][] array1, int[][] array2) {
        int[][] sum = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println(sum);
        return sum;
    }
}
