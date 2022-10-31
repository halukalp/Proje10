package com.migros.ucg.oracle.migros.db_yonetim.model.dal;

import com.migros.ucg.oracle.migros.db_yonetim.model.entity.Musteri;
import com.migros.ucg.oracle.migros.db_yonetim.model.utility.TabloAd;

public class MusteriDAL extends VarlikDAL<Musteri, String>
{

    public MusteriDAL()
    {
        super(Musteri.class, TabloAd.MUSTERILER);
    }
}
