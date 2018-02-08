/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */


public class mergrSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3, p;
        boolean a = false, b = false;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l3 = l1;
            l1 = l1.next;
            if(l1==null)
                a = true;
        } else {
            l3 = l2;
            l2 = l2.next;
            if(l2==null)
                b = true;
        }
        p = l3;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }
            if (l1 == null) {
                a = true;
            }
            if (l2 == null) {
                b = true;
            }
            l3 = l3.next;
        }
        if (a == true) {
            while (l2 != null) {
                l3.next = l2;
                l2 = l2.next;
                l3 = l3.next;
            }
        }
        else {
            while (l1 != null) {
                l3.next = l1;
                l3 = l3.next;
                l1 = l1.next;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        ListNode x = new ListNode(1);
        x.next = new ListNode(3);
        x.next.next = new ListNode(5);
        
        ListNode y = new ListNode(2);
        y.next = new ListNode(4);
        y.next.next = new ListNode(6);
        
        mergrSortedLists m = new mergrSortedLists();
        ListNode a = m.mergeTwoLists(x, y);
        while(a!=null){
            System.out.println(a.val);
            a = a.next;
        }
    }
}
