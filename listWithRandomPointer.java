/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
//Definition for singly-linked list with a random pointer.
class RandomListNode {

    int label;
    RandomListNode next, random;

    RandomListNode(int x) {
        this.label = x;
    }
}

public class listWithRandomPointer {

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return head;
        }

        RandomListNode a = new RandomListNode(head.label);
        RandomListNode p = head, q = a;

        while (p.next != null) {
            p = p.next;
            a.next = new RandomListNode(p.label);
            a = a.next;
        }
        p = head;
        RandomListNode x = q, y = q;
        RandomListNode temp = q;
        while (p != null) {
            if (p.random != null) {
                temp = q;
                while (temp.label != p.random.label) {
                    temp = temp.next;
                }
                y.random = temp;
            } else {
                y.random = null;
            }
            y = y.next;
            p = p.next;
        }
        return x;
    }

    public static void main(String[] args) {
        RandomListNode r = new RandomListNode(1);
        r.next = new RandomListNode(2);
        r.next.next = new RandomListNode(3);
        r.random = r.next.next;
        r.next.random = r;
        r.next.next.random = r.next;

        listWithRandomPointer l = new listWithRandomPointer();
        RandomListNode x = l.copyRandomList(r);

        System.out.println("Old Memory:" + r);

        while (x != null) {
            System.out.println("New Memory: " + x);
            System.out.println("X: " + x.label);
            System.out.println("Random X: " + x.random.label);
            x = x.next;
        }
    }
}
