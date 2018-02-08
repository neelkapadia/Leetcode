
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MultiHashtable;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class ZigZagArray {

    int[] rearrange(int array[]) {
        boolean flag;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            if(i%2==0){
                flag = true;
            }
            else{
                flag = false;
            }
            if (flag == true) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            } else {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        
        return array;
    }
    public static void main(String[] args) {
        ZigZagArray z = new ZigZagArray();
        int [] array = {4, 3, 7, 8, 6, 2, 1};
        int arr[] = z.rearrange(array);
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
