/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class StringCompression {

    public int compress(char[] chars) {
        int num = 1, ctr = 0;
        char x;
        char[] temp;

        for (int i = 1; i < chars.length; i++) {
            x = chars[i - 1];
            if (chars[i] == chars[i - 1]) {
                num++;
            } else {
                chars[ctr] = x;
                ctr++;
                temp = ("" + num).toCharArray();
                if (temp.length != 1 || temp[0] != '1') {
                    for (int j = 0; j < temp.length; j++) {
                        chars[ctr] = temp[j];
                        System.out.print(chars[ctr]+" ");
                        ctr++;
                    }
                }
                num = 1;
            }
        }
        chars[ctr] = chars[chars.length - 1];
        ctr++;
        temp = ("" + num).toCharArray();
        if (temp.length != 1 || temp[0] != '1') {
            for (int j = 0; j < temp.length; j++) {
                chars[ctr] = temp[j];
                ctr++;
            }
        }
//        for (int i = 0; i < ctr; i++) {
//            System.out.print(chars[i]);
//        }
        
        return ctr;
    }

    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
//        char arr[] = {'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'a', 'b'};
        char arr[] = {'a', 'a','a', 'a','a', 'a','a', 'a'};

        System.out.println(sc.compress(arr));       
    }
}
