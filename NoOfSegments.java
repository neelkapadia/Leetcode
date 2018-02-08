/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class NoOfSegments {

    public int countSegments(String s) {
        s = s.trim();
        if(s.length()==0){
            return 0;
        }
        String[] str = s.trim().split("\\s+");
        return str.length;
    }
    public static void main(String[] args) {
        NoOfSegments nos = new NoOfSegments();
        int x  = nos.countSegments("  ");
        System.out.println(x);
    }
}
