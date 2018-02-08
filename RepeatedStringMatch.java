/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        String str="";
        int n = B.length()/A.length();
        int i = 0;
        while(str.contains(B)==false&& i <= n+1){
            str = str.concat(A);
            i++;
        }
        if(str.contains(B))
            return i;
        else
            return -1;
    }
    public static void main(String[] args) {
        RepeatedStringMatch rsm = new RepeatedStringMatch();
        int x = rsm.repeatedStringMatch("abcd", "cdabcdab");
        System.out.println(x);
    }
}
