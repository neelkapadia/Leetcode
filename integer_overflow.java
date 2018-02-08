/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class integer_overflow {
    public static void main(String[] args) {
        int x = 1147483747,count =0;
        
        String s = Integer.toString(x);
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1 = s1.reverse();
        
        s = s1.toString();
//        int a = Integer.parseInt(s);
        
//        if(Integer.parseInt(s)>Integer.MAX_VALUE)
  //          System.out.println("0");
        System.out.println(s);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
