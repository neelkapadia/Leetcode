
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
public class DP_contiguousSubArray {
    int lengthOfSubArray(int []nums){
        int mat[][] = new int[nums.length + 1][nums.length + 1];
        int [] arr = nums;
        int curr_max;
        Arrays.sort(arr);
        for(int i = 1;i<=nums.length;i++){
            curr_max = nums[i-1];
            for(int j = 1;j <=nums.length;j++){
                if(arr[j-1] == curr_max){
                    mat[i][j] = mat[i][j-1] + 1;
                    curr_max++;
                }
                else{
                    mat[i][j] = mat[i][j-1];
                }
            }
            if(mat[i][nums.length] < mat[i-1][nums.length]){
                mat[i][nums.length] = mat[i-1][nums.length];
            }
        }
        return mat[nums.length][nums.length];
    }
    public static void main(String[] args) {
        int [] nums = {5,4,6,2,3,8};
        DP_contiguousSubArray dp = new DP_contiguousSubArray();
        int len = dp.lengthOfSubArray(nums);
        System.out.println(len);
    }
}
