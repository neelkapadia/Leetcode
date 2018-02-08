/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
public class reverseListRecursive {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        reverseList(head.next);
        head.next.next = head;
        return head;
        
    }
    public static void main(String[] args) {
        ListNode x = new ListNode(1);
        x.next = new ListNode(3);
        x.next.next = new ListNode(5);
        
        reverseListRecursive r = new reverseListRecursive();
        ListNode a = r.reverseList(x);
        while(a!=null){
            System.out.println(a.val);
            a = a.next;
        }
    }
}
