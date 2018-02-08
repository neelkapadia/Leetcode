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

public class MyCalendar {

    static TreeMap<Integer, Integer> book;
    boolean check = false;

    public MyCalendar() {
        book = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prev = book.floorKey(start),
                next = book.ceilingKey(start);
        if ((prev == null || book.get(prev) <= start) && (next == null || end <= next)) {
            book.put(start, end);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyCalendar m = new MyCalendar();
        System.out.println(m.book(10, 20));
        System.out.println(m.book(15, 25));
        System.out.println(m.book(20, 30));
        System.out.println(m.book(12, 18));
    }
}