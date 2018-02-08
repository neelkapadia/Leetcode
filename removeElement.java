/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class removeElement {

    public int removeElement(int[] nums, int val) {
        int x = nums.length - 1, count = 0;
        if(nums.length==1){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=val){
                nums[count++] = nums[i];
            }
        }
        if(count==0){
            nums = null;
            return 0;
        }
        return count;
    }

    public static void main(String[] args) {
        removeElement r = new removeElement();
        //int[] nums = {1,2,3,2,5,6,2,8,9};
        int[] nums = {2};
        System.out.println(r.removeElement(nums, 2));
    }
}
