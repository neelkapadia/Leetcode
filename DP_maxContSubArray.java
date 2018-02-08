
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Neel_Kapadia
 */
public class DP_maxContSubArray {

    public int findLength(int[] A, int[] B) {
        int mat[][] = new int[A.length + 1][B.length + 1];
        int max = 0;
        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= B.length; j++) {
                if (A[i - 1] == B[j - 1]) {
                    mat[i][j] = mat[i - 1][j - 1] + 1;
                }
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        DP_maxContSubArray dp = new DP_maxContSubArray();
        int A[] = {5,14,53,80,48};//{1, 2, 3, 2, 1};//{0,1,1,1,1};
        int B[] = {50,47,3,80,83};//{3, 2, 1, 4, 7};//{1,0,1,0,1};
        int ans = dp.findLength(A, B);
        System.out.println(ans);
    }
}

//[5,14,53,80,48]
//[50,47,3,80,83]
