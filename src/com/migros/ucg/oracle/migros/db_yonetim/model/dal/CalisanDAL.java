package com.migros.ucg.oracle.migros.db_yonetim.model.dal;

import com.migros.ucg.oracle.migros.db_yonetim.model.entity.Calisan;
import com.migros.ucg.oracle.migros.db_yonetim.model.utility.TabloAd;

public class CalisanDAL extends VarlikDAL<Calisan, Integer>
{
    public CalisanDAL()
    {
        super(Calisan.class, TabloAd.CALISANLAR);
    }
}

