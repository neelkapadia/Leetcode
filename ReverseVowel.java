/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class ReverseVowel {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int loc[] = new int[s.length()];
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' || s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                sb.append(s.charAt(i));
                loc[count] = i;
                count++;
            }
        }
        String temp = sb.toString();
        StringBuilder x = new StringBuilder(s);
        for(int i = 0;i<count;i++){
            x.replace(loc[i], loc[i]+1, temp.substring(temp.length() - i-1,temp.length()-i));
        }
        
        return x.toString();
    }
    public static void main(String[] args) {
        ReverseVowel rv = new ReverseVowel();
        String s = rv.reverseVowels("aA");
        System.out.println(s);
    }
}
