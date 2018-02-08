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

public class g {

    int[] A;
    int[] E;
    HashMap<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
    HashSet<Integer> hashSet = new HashSet<Integer>();

    public int LongestPathWithSameValue(int[] A, int[] E) {
        // write your code in Java SE 8
        this.A = A;
        this.E = E;
        int i = 0;
        while (i < E.length) {
            List<Integer> list;
            int node1 = E[i++];
            int node2 = E[i++];

            list = hashMap.getOrDefault(node1, new ArrayList<Integer>());
            if (!list.contains(node2)) {
                list.add(node2);
                hashMap.put(node1, list);
            }
            list = hashMap.getOrDefault(node2, new ArrayList<Integer>());
            if (!list.contains(node1)) {
                list.add(node1);
                hashMap.put(node2, list);
            }

        }
        // graph adjacency list created
        int len = 0;
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            int parent = (int) pair.getKey();
            hashSet.add(parent);
            List<Integer> list = (List<Integer>) pair.getValue();

            int secondMax = 0;
            int maximum = 0;

            for (i = 0; i < list.size(); i++) {

                if (!hashSet.contains(list.get(i))) {
                    int val = getDFSLength(list.get(i), A[parent - 1]);

                    if (val > secondMax) {
                        secondMax = val;
                    }
                    if (val > maximum) {
                        secondMax = maximum;
                        maximum = val;
                    }
                }
            }

            len = Math.max(len, maximum + secondMax);
            hashSet.remove(parent);
        }
        return len;
    }

    public int getDFSLength(int selfNode, int parentVal) {
        hashSet.add(selfNode);
        if (A[selfNode - 1] == parentVal) {
            int sum = 1;
            if (hashMap.containsKey(selfNode)) {
                List<Integer> list = hashMap.get(selfNode);
                for (int i = 0; i < list.size(); i++) {
                    if (!hashSet.contains(list.get(i))) {
                        sum = Math.max(sum, 1 + getDFSLength(list.get(i), A[selfNode - 1]));
                    }
                }
                hashSet.remove(selfNode);
                return sum;
            } else {
                hashSet.remove(selfNode);
                return 1;
            }
        } else {
            hashSet.remove(selfNode);
            return 0;
        }
    }

        public static void main(String[] args) {
        g g1 = new g();
        int A[] = {1, 1, 1, 1, 2};
        int E[] = {1, 2, 1, 3, 2, 4, 2, 5};
//        [1, 1, 1, 2, 2], [1, 2, 1, 3, 2, 4, 2, 5]
        int len = g1.LongestPathWithSameValue(A, E);
        System.out.println(len);
    }
}
