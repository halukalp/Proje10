package com.migros.ucg.collections.list.program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Run
{
    private static final String STR1 = "STRING-1";
    private static final String STR2 = "STRING-2";
    private static final String STR3 = "STRING-3";
    private static final String STR4 = new String("STRING-4");
    private static final String STR5 = "STRING-5";

    private static final String DIZGE1 = "DIZGE-1";
    private static final String DIZGE2 = "DIZGE-2";
    private static final String DIZGE3 = "DIZGE-3";
    private static final String DIZGE4 = "DIZGE-4";

    public static void main(String[] args)
    {
        List<String> stringList1 = new ArrayList<>();
        stringList1.add(STR1);
        stringList1.add(STR2);
        stringList1.add(STR3);
        stringList1.add(STR4);
        stringList1.add(STR5);

        System.out.println(stringList1);

        // ITERASYON KISA YOL
        System.out.println("\nstringList1:");
        for (String str : stringList1)
        {
            System.out.println(str);
        }

        System.out.println("\n");

        // ITERASYON UZUN YOL
        System.out.println("\nstringList1:");
        Iterator<String> iteratorStringListesi1 = stringList1.iterator();
        while (iteratorStringListesi1.hasNext())
        {
            String str = iteratorStringListesi1.next();

            System.out.println(str);
        }

        List<Integer> sayiListesi1 = new ArrayList<>();
        sayiListesi1.add(new Integer(3));
        sayiListesi1.add(42);
        sayiListesi1.add(-991);
        sayiListesi1.add(new Integer(58));

        stringList1.add(2, sayiListesi1.toString());
        System.out.println("\nstringList1 güncellendi:");
        for (String str : stringList1)
        {
            System.out.println(str);
        }

        List<String> stringList2 = new ArrayList<>();
        stringList2.add(DIZGE1);
        stringList2.add(DIZGE2);
        stringList2.add(DIZGE3);
        stringList2.add(DIZGE4);
        System.out.println("\nstringList2:");
        for (String str : stringList2)
        {
            System.out.println(str);
        }

        stringList2.addAll(3, stringList1);
        System.out.println("\nstringList2:");
        for (String str : stringList2)
        {
            System.out.println(str);
        }

        System.out.println("\nstringList2 3. eleman: " + stringList2.get(2));

        System.out.println("\n\n" + stringList1 + "\n" + stringList2 + "'i\n içeriyor mu ?:"
                + stringList1.containsAll(stringList2));

        System.out.println("\n\n" + stringList2 + "\n" + stringList1 + "'i\n içeriyor mu ?:"
                + stringList2.containsAll(stringList1));

        System.out.println("\n\n");
        System.out.println("stringList2 alt liste: " + stringList2.subList(5, 8)); // [5, 8)

        List<String> strList2SubList1 = stringList2.subList(5, 8);
        System.out.println("\n\n" + stringList1.containsAll(strList2SubList1));
    }
}
