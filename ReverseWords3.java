/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class ReverseWords3 {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String [] str;
        str = s.trim().split("\\s+");
        s = "";
        for(int i = 0;i<str.length;i++){
            sb = sb.append(str[i]);
            sb = sb.reverse();
            String x = sb.toString();
            s = s.concat(x);
            if(i!=str.length-1)
                s = s.concat(" ");
            sb.delete(0, sb.capacity());
        }
        return s;
    }
    public static void main(String[] args) {
        ReverseWords3 rw = new ReverseWords3();
        String x = rw.reverseWords("Hi I am Neel Kapadia");
        System.out.println(x);
    }
}
