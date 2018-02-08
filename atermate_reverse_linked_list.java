/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
class Node {

    int val;
    ListNode next;
}

public class atermate_reverse_linked_list {

    public ListNode swapPair(ListNode head) {
        ListNode p = head;
        int count = 0;
        ListNode q = head;
        ListNode r = head;
        while (r.next!=null) {
            r = r.next;
            q.next = r.next;
            r.next = q;
            if(q == head){
                head = r;
            }
            if(count!=0){
                p.next = r;
            }
            r = r.next;
            r = r.next;
            q = q.next;
            if (p != head) {
                p = p.next;
            }
            p = p.next;
            count++;
        }
        return head;
    }
}
