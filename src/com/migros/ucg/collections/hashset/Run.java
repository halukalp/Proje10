package com.migros.ucg.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class Run
{
    public static void main(String[] args)
    {
        Set<Integer> sayiKumesi1 = new HashSet<Integer>();
        sayiKumesi1.add(3);
        sayiKumesi1.add(2);
        sayiKumesi1.add(new Integer(1));
        sayiKumesi1.add(6);
        sayiKumesi1.add(3);
        sayiKumesi1.add(14);
        sayiKumesi1.add(12);
        sayiKumesi1.add(15);
        sayiKumesi1.add(16);
        sayiKumesi1.add(17);
        sayiKumesi1.add(new Integer(26));
        sayiKumesi1.add(32);

        System.out.println("\n");
        for (Integer sayiNesnesi : sayiKumesi1)
        {
            System.out.println(sayiNesnesi);
        }
    }

}
