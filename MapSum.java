
import java.util.HashMap;
import java.util.Set;
import java.lang.*;
import java.util.Iterator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class MapSum {

    String key;
    int val;
    HashMap hm = new HashMap();

    public MapSum() {

    }

    public void insert(String key, int val) {
        hm.put(key, val);
    }

    public int sum(String prefix) {
        Set s = hm.keySet();
        Iterator<String> itr = s.iterator();
        while (itr.hasNext()) {
            
        }
        
        s.containsAll(s);
        return 0;
    }

    public static void main(String[] args) {
        MapSum m = new MapSum();
        m.insert("abc", 5);
        m.insert("abc", 6);
    }
}
