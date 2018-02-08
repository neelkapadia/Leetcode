/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class valid_pali_2 {

    public boolean validPalindrome(String s) {

        int arr[] = checkPali(s);
        //System.out.println(arr[0]);
        if (arr[0] == -1) {
            return true;
        } else {
            String temp = s.substring(arr[0] + 1, arr[1] + 1);
            //System.out.println("temp 1: " + temp);
            int x[] = checkPali(temp);
//            System.out.println("x: " + x[0]);
            if(x[0]==-1)
                return true;
            temp = s.substring(arr[0], arr[1]);
//            System.out.println("temp 2: " + temp);
            x = checkPali(temp);
//            System.out.println("x: " + x[0]);
            if(x[0]==-1)
                return true;
        }
        return false;
    }

    public int[] checkPali(String s) {
        int arr[] = new int[2];
        int i = 0, j = s.length() - 1;
        while (s.charAt(i) == s.charAt(j) && i < j) {
            i++;
            j--;
        }
        if (i >= j) {
            arr[0] = arr[1] = -1;
        } else {
            arr[0] = i;
            arr[1] = j;
        }
        return arr;
    }

public static void main(String[] args) {
        String a = "zergbfjvptexsunllmgxyphgkoamzokbulcfijqjrybxampfmpmkklpasnmuiocxckculoziywffmxkrzyqlqhbxditqfhuydfqnxqehmumfbeqmmiadpvnbdbcxrbqqjuztvlgnxyiiekwuunsebfnhylcgraxkvotqmhobxuwuvdigitffoemvjamcxaujspctlamhupbbzzbdbparftnbsjnmgldrkltqpodcjankueyhrzrlylundccdnulylrzrhyeuknajcdopqtlkrdlgmnjsbntfrapbdbzzbbpuhmaltcpsjuaxcmajvmeofftigidvuwuxbohmqtovkxargclyhnfbesnuuwkeiiyxnglvtzujqqbrxcbdbnvpdaimmqebfmumheqxnqfdyuhfqtidxbhqlqyzrkxmffwyizoluckcxcoiumnsaplkkmpmfpmaxbyrjqjifclubkozmaokghpyxgmllnusxetpvjfbgrezl";
        //String a = "abcda";
        valid_pali_2 v = new valid_pali_2();
        //System.out.println(a.substring(1,2));
        boolean x = v.validPalindrome(a);
        System.out.println(x);
    }
}
