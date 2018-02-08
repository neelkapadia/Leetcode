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
public class DP_NoOfLongestIncreasingSubSequence {
    public int findNumberOfLIS(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int lis[] = new int[nums.length];
        Arrays.fill(lis, 1);
        System.out.println(lis[0]);
        for (int i = 1; i < lis.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
            System.out.println(lis[i]);
        }
        int max_count = 0, count;
        for (int i = lis.length - 1; i > 0; i--) {
            count = 1;
            while (lis[i] == lis[i - 1]) {
                count++;
                if (i > 1) {
                    i--;
                } else {
                    break;
                }
            }
            if (count > max_count) {
                max_count = count;
            }
        }
        return max_count;
    }

    public static void main(String[] args) {
        DP_NoOfLongestIncreasingSubSequence dp = new DP_NoOfLongestIncreasingSubSequence();
        int nums[] = {1,2,4,3,5,4,7,2};
        int x = dp.findNumberOfLIS(nums);
        System.out.println("Count: "+x);
    }
}