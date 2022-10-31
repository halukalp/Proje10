package com.migros.ucg.collections.deque.program;

import java.util.Deque;
import java.util.LinkedList;

public class Run
{
    private static final String STR1 = "STRING-1";
    private static final String STR2 = "STRING-2";
    private static final String STR3 = "STRING-3";
    private static final String STR4 = new String("STRING-4");
    private static final String STR5 = new String("STRING-5");

    public static void main(String[] args)
    {
        Deque<String> deque1 = new LinkedList<String>();
        deque1.add(STR1);
        deque1.add(STR2);
        deque1.add(STR3);
        deque1.add(STR4);

        deque1.addLast(STR5);

        System.out.println(deque1);


        System.out.println("deque1 peek: " + deque1.peek());

        System.out.println("deque1 peek first: " + deque1.peekFirst());

        System.out.println("deque1 peek last: " + deque1.peekLast());

        System.out.println("deque1 peek element " + deque1.poll() + " is removed.");

        System.out.println("deque1 peek element(first) " + deque1.pollFirst() + " is removed.");

        System.out.println("deque1 peek element(last) " + deque1.pollLast() + " is removed.");

        deque1.push(STR1);

        System.out.println(deque1);

        deque1.add(STR5);

        System.out.println(deque1);
    }
}
