/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class DP_maxSubArray {
    int [] sum;
    int max = 0;
    public int maxSubArray(int[] nums) {
        if(nums.length ==- 0)
            return Integer.MIN_VALUE;
        sum = new int[nums.length];
        sum[0] = nums[0];
        max = sum[0];
        for(int i = 1;i<nums.length;i++){
            if(sum[i-1]+nums[i] > nums[i]){
                sum[i] = sum[i-1] + nums[i];
            }
            else {
                sum[i] = nums[i];
            }
            if(sum[i]>max)
                max = sum[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        DP_maxSubArray m = new DP_maxSubArray();
        int output = m.maxSubArray(nums);
        System.out.println(output);
    }

}
