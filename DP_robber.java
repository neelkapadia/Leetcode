/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class DP_robber {

    int max;
    int[] sum;

    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            if(nums[0]<nums[1])
                return nums[1];
            return nums[0];
        }
        sum = new int[nums.length];
        sum[0] = nums[0];
        sum[1] = nums[1];
        for (int i = 0; i < nums.length; i++) {
            if (i + 2 < nums.length) {
                if (sum[i] + nums[i + 2] > sum[i + 2]) {
                    sum[i + 2] = sum[i] + nums[i + 2];
                }
            }
            if (i + 3 < nums.length) {
                if (sum[i] + nums[i + 2] > sum[i + 3]) {
                    sum[i + 3] = sum[i] + nums[i + 3];
                }
            }
        }
        for(int i = 0;i<sum.length;i++){
            if(sum[i]>max)
                max = sum[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,7,5,15,3};
        DP_robber dp = new DP_robber();
        int sol = dp.rob(nums);
        System.out.println(sol);
    }
}
