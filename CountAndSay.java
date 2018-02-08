/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class CountAndSay {

    public String count(int n) {
        if(n==1)
            return "1";
        String str1 = "";
        String a ="1";
        StringBuilder str = new StringBuilder();
        int count;
        while (--n > 0) {
            count = 1;
            str.delete(0, str.capacity());
            for (int i = 1; i < a.length(); i++) {
                if (a.charAt(i) != a.charAt(i - 1)) {
                    str.append(count);
                    str.append(a.charAt(i - 1));
                    count = 1;
                } else {
                    count++;
                }
            }
            str.append(count);
            str.append(a.charAt(a.length() - 1));
            a = str.toString();
        }
        str1 = str.toString();
        return str1;
    }

    public static void main(String[] args) {
        CountAndSay c = new CountAndSay();
        String s = c.count(4);
        System.out.println(s);
    }
}
