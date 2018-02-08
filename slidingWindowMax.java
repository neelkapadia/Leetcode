/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
import java.util.*;

public class slidingWindowMax {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int max[] = new int[nums.length - k + 1];
        int counter = 0;
        Deque<Integer> dq = new LinkedList<>();
        dq.add(nums[0]);
        int i;
        for (i = 1; i < k; i++) {
            while(!dq.isEmpty() && nums[i]>= nums[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }

        for(;i < nums.length; ++i){
            //System.out.println(nums[dq.peek()] + " ");
            max[counter++] = nums[dq.peek()];
            while(!dq.isEmpty() && dq.peek() <= i - k)
                dq.removeFirst();
            
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        //System.out.println(nums[dq.peek()]);
        max[counter++] = dq.peek();
        return max;
    }
//        int max, j = 0;
//        int[] output = new int[(int) Math.ceil(nums.length / k)];
//        max = findMax(nums,0,k);
//        System.out.println(max);
//        output[j++] = max;
//        for (int i = k; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//            if (nums[i] < max) {
//                if (max == nums[i - k]) {
//                    max = findMax(nums, i-k+1, k);
//                }
//            }
//        }
//        return output;
//    }
//
//    public int findMax(int[] nums, int i, int k) {
//        int max = 0;
//        while(i<i+k) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//            i++;
//        }
//        return max;
//    }

    public static void main(String[] args) {
        slidingWindowMax sm = new slidingWindowMax();
        int nums[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int [] arr = sm.maxSlidingWindow(nums, 3);
        for(int i : arr)
            System.out.println(i);
    }
}
