
import java.util.*;

public class google {

    HashSet<Integer> al = new HashSet<Integer>();
    HashMap<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
    int A[];

    public int Dfs(int root, int parent) {//, ArrayList<Integer> al, HashMap<Integer, List<Integer>> hm, int A[]) {
        int x;
        if (!al.contains(root)) {
            al.add(root);
        }
        if (A[root - 1] == parent) {
            x = 1;
            if (hm.containsKey(root)) {
                List<Integer> list = hm.get(root);
                for (int i = 0; i < list.size(); i++) {
                    if (!al.contains(list.get(i))) {
                        x = Math.max(x, 1 + Dfs(list.get(i), A[root - 1]));//, al, hm, A));
                        System.out.println("root: " + root + " val: " + x);
                    }
                }
                al.remove(root);
                return x;

            } else {
                al.remove((root));
                return 1;
            }

        } else {
            if (al.contains(root)) {
                al.remove(root);
            }
            return 0;
        }
    }

    public int solution(int[] A, int[] E) {
        // write your code in Java SE 8
        this.A = A;
        int i = 0, path, x, y;
        while (i < E.length) {
            List<Integer> l;
            x = E[i];
            y = E[i];

            l = hm.getOrDefault(x, new ArrayList<Integer>());
            if (!l.contains(y)) {
                l.add(y);
                hm.put(x, l);
            }
            l = hm.getOrDefault(y, new ArrayList<Integer>());
            if (!l.contains(x)) {
                l.add(x);
                hm.put(y, l);
            }
            i = i + 2;
        }
        path = 0;
        Iterator itr = hm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry map = (Map.Entry) itr.next();
            int parent = (int) map.getKey();
            if (!al.contains(parent)) {
                al.add(parent);
            }
            List<Integer> list = (List<Integer>) map.getValue();
            //int max[] = new int[2];
            //int max = 0;
            int max = 0 ,smax = 0;
            for (i = 0; i < list.size(); i++) {
                if (!al.contains(list.get(i))) {
                    int val = Dfs(list.get(i), A[parent - 1]);//, al, hm, A);
                    if (val > smax) {
                        smax = val;
                    }
                    if (val > max) {
                        smax = max;
                        max = val;
                    }
                }
            }

            path = Math.max(path, max + smax);
            al.remove(parent);
        }
        return path;
    }

    public static void main(String[] args) {
        google g = new google();
        int A[] = {1, 1, 1, 2, 2};
        int E[] = {1, 2, 1, 3, 2, 4, 2, 5};
//        [1, 1, 1, 2, 2], [1, 2, 1, 3, 2, 4, 2, 5]
        int len = g.solution(A, E);
        System.out.println(len);
    }
}
