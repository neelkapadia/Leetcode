/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class reorderList {
     public void reorderList(ListNode head) {
        ListNode p,q;
        p = q = head;
        while(true){
            if(p.next == null){
                return;
            }
            else if(p.next.next == null){
                return;
            }
            while(q.next.next!=null){
                q = q.next;
            }
            q.next.next = p.next;
            p.next = q.next;
            q.next = null;
            p = p.next.next;
            q = p;
        }
    }
}
