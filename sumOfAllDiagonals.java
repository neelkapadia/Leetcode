/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class sumOfAllDiagonals {

    int[] sum(int[][] mat) {
        int[] arr = new int[mat.length + mat[0].length - 1];
        int k, j;
        for (int i = 0; i < mat.length; i++) {
            k = i;
            j = 0;
            while (k >= 0 && j <= i) {
                arr[i] += mat[k--][j++];
            }
        }
        for (int i = 1; i < mat[0].length; i++) {
            k = mat[0].length - 1;
            j = i;
            while (k >= i && j <= mat[0].length - 1) {
                arr[i + mat.length - 1] += mat[k--][j++];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        sumOfAllDiagonals s = new sumOfAllDiagonals();
        //int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] mat = {{ 6, 7, 8},
                    { 4, 6, 7},
                    { 1, 4, 6}};
        int arr[] = s.sum(mat);
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

/*
6 7 8
4 6 7
1 4 6

*/