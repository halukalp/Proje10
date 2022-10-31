package com.migros.ucg.interfaces.java8.lambda.program;

public class Main
{
    public static void main(String[] args)
    {
        Arayabilir arayabilir1 = new Arayabilir()
        {
            @Override
            public void aramaYap(String aranacakNumara)
            {

            }
        };

//        calistir(new Arayabilir()
//                 {
//                     @Override
//                     public void aramaYap(String aranacakNumara)
//                     {
//                         if(aranacakNumara.startsWith("444"))
//                         {
//                             System.out.println("Aranacak numara hatalı.");
//                         }
//                         else
//                         {
//                             System.out.println("Aranacak numara: " + aranacakNumara);
//                         }
//                     }
//                 }
//                ,
//                "0555 444 33 22");


        // yukarıdaki kullanım yerine, bu kullanım
        calistir(new Arayabilir()
                {
                     @Override
                     public void aramaYap(String aranacakNumara)
                     {
                         if(aranacakNumara.startsWith("444"))
                         {
                             System.out.println("Aranacak numara hatalı.");
                         }
                         else
                         {
                             System.out.println("Aranacak numara: " + aranacakNumara);
                         }
                     }
                 }
                ,
                "0555 444 33 22");
    }

    public static void calistir(Arayabilir arayabilir, String telNo)
    {
        arayabilir.aramaYap(telNo);
    }
}
