package com.migros.ucg.collections.queue.program;

import java.util.LinkedList;
import java.util.Queue;

public class Run
{
    public static void main(String[] args)
    {
        Queue<Integer> sayiKuyrugu1 = new LinkedList<Integer>();

        sayiKuyrugu1.add(new Integer(33));

        sayiKuyrugu1.add( -337 );

        Integer sayiNesnesi3 = new Integer(2);
        sayiKuyrugu1.add(sayiNesnesi3);

        sayiKuyrugu1.add(-71);

        for (Integer sayiNesnesi : sayiKuyrugu1)
        {
            System.out.println(sayiNesnesi);
        }

        System.out.println("\nsayiKuyrugu1 baştaki eleman: " + sayiKuyrugu1.peek());

        System.out.println("\nsayiKuyrugu1 baştaki eleman " + sayiKuyrugu1.poll() + " çekildi.");

        System.out.println("\nsayiKuyrugu1 güncellendi: " + sayiKuyrugu1);

        sayiKuyrugu1.add(62);

        System.out.println("\nsayiKuyrugu1 güncellendi: " + sayiKuyrugu1);

        System.out.println("\nsayiKuyrugu1 baştaki eleman: " + sayiKuyrugu1.peek());
    }
}
