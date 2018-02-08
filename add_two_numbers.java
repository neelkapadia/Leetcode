
//Definition for singly-linked list.
class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class add_two_numbers {

      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(1);
        int sum[] = new int[2];
        ListNode p = l1;
        ListNode q = l2;
        ListNode r = l3;
        sum[0] = sum[1] = 0;
        while (p != null || q != null) {
            if (p != null && q != null) {
                sum = addTwoNumber(p.val, q.val, sum[1]);
                r.val = sum[0];
                if(p.next!=null || q.next!=null){
                    ListNode a = new ListNode(0);
                    r.next = a;
                    r = r.next;
                }
                
                p = p.next;
                q = q.next;

            } else if (p != null && q == null) {
                while (p != null) {
                    sum = addTwoNumber(p.val, 0, sum[1]);
                    r.val = sum[0];
                    if(p.next!=null){
                        ListNode a = new ListNode(0);
                        r.next = a;
                        r = r.next;
                    }
                    p = p.next;
                    
                }
            } else if (q != null && p == null) {
                while (q != null) {
                    sum = addTwoNumber(0, q.val, sum[1]);
                    r.val = sum[0];
                    if(q.next!=null){
                        ListNode a = new ListNode(0);
                        r.next = a;
                        r = r.next;
                    }
                    q = q.next;
                    
                }
            }
        }
        if(sum[1]==1){
            ListNode a = new ListNode(0);
            r.next = a;
            r = a;
            r.val = sum[1];
        }
            
        return l3;
    }

    public int[] addTwoNumber(int x, int y, int carry) {
        int z = x + y + carry;
        carry = 0;
        if (z > 9) {
            carry = z / 10;
            z = z % 10;
        }
        int[] r = new int[2];
        r[0] = z;
        r[1] = carry;
        return r;
}
}
