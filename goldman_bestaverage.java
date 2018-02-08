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
public class goldman_bestaverage {
        static int bestAverageGrade(String[][] scores) {
        HashMap<String,Integer> grade = new HashMap<String,Integer>();
        HashMap<String,Integer> count = new HashMap<String,Integer>();
        for(int i=0;i<scores.length;i++){
            if(grade.get(scores[i][0])==null){
                grade.put(scores[i][0],Integer.parseInt(scores[i][1]));
                count.put(scores[i][0],1);
            }
            else{
                int x = grade.get(scores[i][0]);
                x = x + Integer.parseInt(scores[i][1]);
                grade.put(scores[i][0],x);
                x = count.get(scores[i][0]);
                x++;
                count.put(scores[i][0],x);
            }
        }
        int average = 0;
        for(int i = 0;i<scores.length;i++){
            if(grade.get(scores[i][0])!=null){
                int sum = grade.get(scores[i][0]);
                int num = count.get(scores[i][0]);
                if(average < (sum/num))
                    average = sum/num;
            }
        }
        return average;
    }
        public static void main(String[] args) {
        String[][] sc = {{"Bobby","87"},{}};
    }
}


/*
    
    static int bestAverageGrade(String[][] scores) {
        if(scores.length==0)
            return 0;
        HashMap<String,Integer> grade = new HashMap<String,Integer>();
        HashMap<String,Integer> count = new HashMap<String,Integer>();
        for(int i=0;i<scores.length;i++){
            if(grade.get(scores[i][0])==null){
                grade.put(scores[i][0],Integer.parseInt(scores[i][1]));
                count.put(scores[i][0],1);
            }
            else{
                int x = grade.get(scores[i][0]);
                x = x + Integer.parseInt(scores[i][1]);
                grade.put(scores[i][0],x);
                x = count.get(scores[i][0]);
                x++;
                count.put(scores[i][0],x);
            }
        }
        int average = 0;
        for(int i = 0;i<scores.length;i++){
            if(grade.get(scores[i][0])!=null){
                int sum = grade.get(scores[i][0]);
                int num = count.get(scores[i][0]);
                if(average < (sum/num))
                    average = sum/num;
            }
        }
        return average;
    }


*/

/*
static String[] uniqueSubstrings(String inputString, int substringLength) {
        if(inputString.length() == 0)
            return null;
        ArrayList<String> arr = new ArrayList<String>();
        String temp;
        for(int i = 0;i<=inputString.length()-substringLength;i++){
            temp = inputString.substring(i, i+substringLength);
            if(!arr.contains(temp))
                arr.add(temp);
        }
        String [] output = new String[arr.size()];
        int i = 0;
        arr.sort(String::compareToIgnoreCase);
        for(String s : arr){
            output[i++] = s;
        }
        return output;
    }

*/