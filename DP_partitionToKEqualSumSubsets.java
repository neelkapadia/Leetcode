/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class DP_partitionToKEqualSumSubsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        double sum = 0.0;
        for(int x:nums){
            sum+=(double)x;
        }
        sum/=k;
        if(sum%1!=0){
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {4, 3, 2, 3, 5, 2, 4};
        DP_partitionToKEqualSumSubsets dp = new DP_partitionToKEqualSumSubsets();
        dp.canPartitionKSubsets(nums, 4);
    }
}