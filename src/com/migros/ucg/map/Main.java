package com.migros.ucg.map;


import com.migros.ucg.oracle.migros.db_yonetim.model.dal.MusteriDAL;
import com.migros.ucg.oracle.migros.db_yonetim.model.entity.Musteri;
import com.migros.ucg.oracle.migros.db_yonetim.model.utility.HibernateUtil;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main
{
    public static void main(String[] args)
    {
        MusteriDAL musteriDAL = new MusteriDAL();
        List<Musteri> musteriListesi1 = musteriDAL.tumVarliklariCek();

        String telNo;
        Map<String, Musteri> musteriMap1 = new HashMap<>();
        for (Musteri musteri : musteriListesi1)
        {
            telNo = JOptionPane.showInputDialog(musteri.getIsim() + " " + musteri.getSoyisim() + " için tel no giriniz:");
            musteriMap1.put(telNo, musteri);
        }

        Set<Map.Entry<String, Musteri>> entrySet1  = musteriMap1.entrySet();

        for (Map.Entry<String, Musteri> entry : entrySet1)
        {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        HibernateUtil.closeSessionFactory();
    }
}
