/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        int i = 1;
        if(s.isEmpty())
            return false;
//        while (i <= s.length()) {
//            System.out.println(s.indexOf(s.substring(0, i)));
//            System.out.println(s.lastIndexOf(s.substring(0, i)) + i);
//            if (s.indexOf(s.substring(0, i)) == 0 && s.lastIndexOf(s.substring(0, i)) + i == s.length()) {
//                return true;
//            }
//            i++;
//        }
        
        
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern rsp = new RepeatedSubstringPattern();
        boolean x = rsp.repeatedSubstringPattern("aabaa");
        System.out.println(x);
    }
}
