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

public class searchInRotatedArray {

    int search(int arr[], int element) {
        int pivot = 0, index;
        while (arr[pivot] < arr[pivot + 1]) {
            pivot++;
        }
        if (element == arr[pivot]) {
            return pivot;
        }
        if (element < arr[0]) {
            index = binarySearch(pivot + 1, arr.length - 1, arr, element);
        } else {
            index = binarySearch(0, pivot, arr, element);
        }
        return index;
    }

    int binarySearch(int start, int end, int arr[], int element){
	int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (element < arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 1, 2, 3};
        searchInRotatedArray s = new searchInRotatedArray();
        System.out.println(s.search(arr, 9));
    }

}
