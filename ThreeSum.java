/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
import java.util.Arrays;
public class ThreeSum {
    
public static void printPermutations(int[] n, int[] Nr, int idx) {
    if (idx == n.length) {  //stop condition for the recursion [base clause]
        //System.out.println(Arrays.toString(n));
        return;
    }
    for (int i = 0; i <= Nr[idx]; i++) { 
        n[idx] = i;
        printPermutations(n, Nr, idx+1); //recursive invokation, for next elements
    }
}
public static void main(String[] args) {
    /* let n.length == 3 and Nr[0] = 2, Nr[1] = 3, Nr[2] = 3 */
    int[] n = new int[4];
    int Nr[] = {2,3,3,4};
    printPermutations(n, Nr, 0);
    String s = "hello";
    String s1 = "world";
    String [] s2 = {s,s1};
    System.out.println(s2[s2.length-1].length());
    
}
}