/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascaltriangle;

/**
 *
 * @author Akif
 */
public class PascalTriangle {

    public int[][] pascalTriangleWithArray(int rowAndColumnNumber) {
        int[][] a = new int[rowAndColumnNumber][rowAndColumnNumber];

        for (int i = 0; i < rowAndColumnNumber; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    //first column
                    a[i][j] = 1;
                } else if (i == j) {
                    //diagonal
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }
        for (int i = 0; i < rowAndColumnNumber; i++) {
            for (int j = 0; j < rowAndColumnNumber; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        return a;
    }

    

    public static void main(String[] args) {
        int passingValue = 6;
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.pascalTriangleWithArray(passingValue);
        System.out.println("Ok done");
    }

}
