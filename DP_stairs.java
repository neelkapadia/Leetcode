/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class DP_stairs {
    public int climb_Stairs1(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs1(i + 1, n) + climb_Stairs1(i + 2, n);
    }
    public int climb_Stairs(int n){
        int a = 1, b = 2;
        if(n==1)
            return a;
        if(n==2)
            return b;
        int c=0;
        for(int i = 3;i<=n;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        DP_stairs dp = new DP_stairs();
        int ans = dp.climb_Stairs(8);
        System.out.println(ans);
    }
}    

