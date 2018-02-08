
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Neel_Kapadia
 */
public class DegreeOfArray {

    public int findShortestSubArray(int[] nums) {
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            } else {
                int a = hm.get(nums[i]);
                hm.put(nums[i], a + 1);
            }
        }
        Iterator it = hm.entrySet().iterator();
        int max = 0, key = 0;
        while (it.hasNext()) {
            Map.Entry p = (Map.Entry) it.next();

            if (max < (int) p.getValue()) {
                max = (int) p.getValue();
            }
        }
        it = hm.entrySet().iterator();
        int ans = Integer.MAX_VALUE;
        while (it.hasNext()) {
            Map.Entry p = (Map.Entry) it.next();
            if ((int) p.getValue() == max) {
                int a = findFirstIndex((int) p.getKey(), nums);
                int b = findLastIndex((int) p.getKey(), nums);
                if(ans > (b-a+1))
                    ans = (b-a+1);
                System.out.println(b - a + 1);
            }
        }
        return ans;
    }

    int findFirstIndex(int x, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (x == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    int findLastIndex(int x, int[] nums) {
        int loc = -1;
        for (int i = 0; i < nums.length; i++) {
            if (x == nums[i]) {
                 loc = i;
            }
        }
        return loc;
    }

    public static void main(String[] args) {
        DegreeOfArray d = new DegreeOfArray();
        int nums[] = {1,2,2,3,1,4,2};
        System.out.println(d.findShortestSubArray(nums));
    }
}
