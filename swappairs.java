/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class swappairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode curr = head;
        ListNode next = head.next;
        head = next;
        boolean flag = false;
        while (curr != null) {
            curr.next = next.next;
            next.next = curr;
            if(flag == false){
                prev = next;
                flag =true;
            }
            else{
                prev.next = next;
            }
            prev = curr;
            curr = curr.next;
            if (curr == null || curr.next == null) {
                return head;
            }
            next = next.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode x = new ListNode(1);
        x.next = new ListNode(2);
        x.next.next = new ListNode(3);
        x.next.next.next = new ListNode(4);

        swappairs s = new swappairs();
        ListNode a = s.swapPairs(x);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
