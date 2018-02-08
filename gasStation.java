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

public class gasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int capacity = 0, i, x, j, count = 0;
        int start[] = new int[gas.length];
        Arrays.fill(start, 1);
        while (count < gas.length) {
            if (start[count] != -1) {
                i = count;
                j = 0;
                capacity = 0;
                while (capacity >= 0 && j < gas.length) {
                    capacity += gas[(i % gas.length)];
                    capacity -= cost[i % gas.length];
                    if (gas[i % gas.length] < cost[i % gas.length]) {
                        start[count] = -1;
                    }
                    i++;
                    j++;
                }
                if (capacity >= 0) {
                    return count;
                }
                count++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        gasStation g = new gasStation();
        int[] gas = new int[5];
        int[] cost = new int[5];
        gas[4] = 7;
        gas[0] = 2;
        gas[1] = 5;
        gas[2] = 1;
        gas[3] = 4;

        cost[4] = 5;
        cost[0] = 3;
        cost[1] = 4;
        cost[2] = 2;
        cost[3] = 5;

        int x = g.canCompleteCircuit(gas, cost);
        System.out.println(x);
    }
}

/*
    int capacity = 0, i, x,j,count=0;
        ArrayList<Integer> al = new ArrayList<>();
        for (i = 0; i < gas.length; i++) {
            al.add(i);
        }
        while (!al.isEmpty()) {
            x = al.remove(0);
            i = x;
            j=0;
            capacity = 0;
            while (capacity >= 0 && j<gas.length) {
                capacity += gas[(i%gas.length)];
                capacity -= cost[i%gas.length];
                if(gas[i%gas.length]<cost[i%gas.length]){
                    int a = al.indexOf(i%gas.length);
                    if(a!=-1)
                        al.remove(a);
                }
                i++;
                j++;
            }
            if(capacity>=0)
                return x;
        }
        return -1;  
    }

*/