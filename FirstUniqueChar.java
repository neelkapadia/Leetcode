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
public class FirstUniqueChar {

    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), 1);
            } else {
                int a = hm.get(s.charAt(i));
                hm.put(s.charAt(i), a+1);
            }
        }
        char temp=' ';
        for (char x : hm.keySet()) {
            if (hm.get(x) == 1) {
                temp = x;
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==temp)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        FirstUniqueChar f = new FirstUniqueChar();
        int x = f.firstUniqChar("leetcodel");
        System.out.println(x);
    }
}
