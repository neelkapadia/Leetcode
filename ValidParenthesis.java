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

public class ValidParenthesis {

    public boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        ArrayList<Character> al = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                al.add(s.charAt(i));
                //System.out.println(s.charAt(i));
            } else {
                if(al.size()==0)
                    return false;                
                char a = al.remove(al.size() - 1);
                if (s.charAt(i) == ')') {
                    if (a != '(') {
                        return false;
                    }
                }
                if (s.charAt(i) == '}') {
                    if (a != '{') {
                        return false;
                    }
                }
                if (s.charAt(i) == ']') {
                    if (a != '[') {
                        return false;
                    }
                }
            }
        }
        if(!al.isEmpty())
            return false;
        return true;
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        boolean p = vp.isValid("()[{]}");
        System.out.println(p);
    }
}
