/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class DP_minPathSum {

    public int minPathSum(int[][] grid) {
        if(grid.length==0)
            return 0;
        int [][]mat = new int[grid.length][grid[0].length];
        mat[0][0] = grid[0][0];
        for(int i = 1;i<grid.length;i++){
            mat[i][0] = mat[i-1][0] + grid[i][0];
        }
        for(int i = 1; i<grid[0].length;i++){
            mat[0][i] = mat[0][i-1] + grid[0][i];
        }
        for(int i=1;i<grid.length;i++){
            for(int j = 1;j<grid[0].length;j++){
                mat[i][j] = Math.min(mat[i-1][j], mat[i][j-1]) + grid[i][j];
            }
        }
        return mat[grid.length-1][grid[0].length-1];
    }
    public static void main(String[] args) {
        DP_minPathSum dp = new DP_minPathSum();
        int [][]grid = {{1,3,1},{1,5,1},{4,2,1}};
        int sol = dp.minPathSum(grid);
        System.out.println(sol);
    }
}
