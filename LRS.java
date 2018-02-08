/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
class Solution {
    public int findLength(int[] A, int[] B) {
        int mat[][] = new int[A.length+1][B.length+1];
        for(int i = 0;i<=A.length;i++){
            for(int j = 0;j<=B.length;j++){
                mat[i][j]=0;
            }
        }        
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<B.length;j++){
                if(A[i]==B[j]){
                    mat[i+1][j+1] = mat[i][j]+1;
                }
                else{
                    if(mat[i][j+1]>mat[i+1][j])
                        mat[i+1][j+1] = mat[i][j+1];
                    else
                        mat[i+1][j+1] = mat[i+1][j];
                }
            }
        }
        return mat[A.length][B.length];
    }
    public static void main(String[] args) {
        
    }
}