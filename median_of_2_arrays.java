/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */

public class median_of_2_arrays {

    double calculate_median(int nums1[], int nums2[]) {
        double median;
        int size;
        int m = nums1.length;
        int n = nums2.length;
        size = m + n;
        int arr[] = new int[size];
        int i, j, k;
        i = j = k = 0;
        while (i != (size / 2) + 1) {
            if (j < m && k < n) {
                if (nums1[j] < nums2[k]) {
                    arr[i] = nums1[j];
                    j++;
                } else {
                    arr[i] = nums2[k];
                    k++;
                }
            } else if (j < m && k >= n) {
                arr[i] = nums1[j];
                j++;
            } else if (j >= m && k < n) {
                arr[i] = nums2[k];
                k++;
            }
            i++;
        }
        for(i = 0; i<arr.length;i++)
            System.out.println(arr[i]);
        if (size % 2 != 0) {
            median = arr[size / 2];
        } else {
            median = (arr[size / 2] + arr[(size / 2) - 1])/2.0;
        }
        return median;
    }

    public static void main(String[] args) {
        median_of_2_arrays m = new median_of_2_arrays();
        int[] nums1 = new int[4];
        int[] nums2 = new int[4];

        nums1[0] = 4;
        nums1[1] = 5;
        nums1[2] = 6;
        nums1[3] = 7;

        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;
        nums2[3] = 3;

        double median = m.calculate_median(nums1, nums2);
        System.out.println(median);

    }

}
