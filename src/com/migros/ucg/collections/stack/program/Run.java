package com.migros.ucg.collections.stack.program;

import java.util.Iterator;
import java.util.Stack;

public class Run
{
    public static void main(String[] args)
    {
        Stack<Integer> sayiYigini1 = new Stack<Integer>();
        sayiYigini1.add(new Integer(42));
        sayiYigini1.add(new Integer(-888));
        sayiYigini1.add(73);
        sayiYigini1.add(-1);

        System.out.println("sayiYigini1: " + sayiYigini1);

        System.out.println("sayiYigini1 tepe elemani: "
                + sayiYigini1.peek());

        System.out.println("sayiYigini1 tepe elemani "
                + sayiYigini1.pop() + " çekildi" );

        System.out.println("sayiYigini1 güncellendi: " + sayiYigini1);

        System.out.println("\n" + "sayiYigini1 elemanları:");
        Iterator<Integer> iteratorSayiYigini1 = sayiYigini1.iterator();
        while (iteratorSayiYigini1.hasNext())
        {
            Integer sayiNesnesi = (Integer) iteratorSayiYigini1.next();
            System.out.println(sayiNesnesi);
        }



        System.out.println( "Yığına eklenen eleman: "
                + sayiYigini1.push( new Integer(42) ) );

        System.out.println("sayiYigini1 tepe elemani " + sayiYigini1.peek());

        System.out.println("\n" + "sayiYigini1 elemanları:");
        System.out.println(sayiYigini1);

        System.out.println("sayiYigini1 tepe elemanı adresi: "
                + Integer.toHexString(sayiYigini1.peek()));

        System.out.println("sayiYigini1 ilk elemanın adresi: "
                + Integer.toHexString(sayiYigini1.get(0)));


        System.out.println("\n");

        if(sayiYigini1.get(0) == sayiYigini1.peek())
        {
            System.out.println("Elemanlar aynı adresi işaret eder.");
        }
        else
        {
            System.out.println("Elemanlar aynı adresi işaret etmez.");
        }
    }
}
