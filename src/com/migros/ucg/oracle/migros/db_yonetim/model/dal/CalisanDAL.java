package com.migros.ucg.oracle.migros.db_yonetim.model.dal;

import com.migros.ucg.oracle.migros.db_yonetim.model.entity.Calisan;
import com.migros.ucg.oracle.migros.db_yonetim.model.utility.HibernateUtil;
import com.migros.ucg.oracle.migros.db_yonetim.model.utility.Sorgu;
import com.migros.ucg.oracle.migros.db_yonetim.model.utility.TabloAd;
import com.migros.ucg.utility.Util;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CalisanDAL
{
    private Session session;
    private Transaction transaction;

    public boolean sil(Integer calisanID)
    {
        try
        {
            session = HibernateUtil.getSession();
            transaction = HibernateUtil.getTransaction();

            Calisan bulunanCalisan = (Calisan) session.get(Calisan.class, calisanID);

            session.delete(bulunanCalisan);

            transaction.commit();

            return true;
        }
        catch (Exception e)
        {
            Util.showGeneralExceptionInfo(e);

            if (transaction != null) transaction.rollback();

            return false;
        }
    }

    public List<Calisan> tumCalisanlariCek()
    {
        try
        {
            session = HibernateUtil.getSession();
            transaction = HibernateUtil.getTransaction();

            SQLQuery sqlQuery = session.createSQLQuery(Sorgu.TUM_VARLIKLARI_CEK + TabloAd.CALISANLAR);

            return sqlQuery != null ? sqlQuery.addEntity(Calisan.class).list() : null;
        }
        catch (Exception e)
        {
            Util.showGeneralExceptionInfo(e);

            return null;
        }
    }

    public Integer ekle(Calisan calisan)
    {
        try
        {
            session = HibernateUtil.getSession();
            transaction = HibernateUtil.getTransaction();

            Integer calisanID = (Integer) session.save(calisan);

            transaction.commit();

            return calisanID;
        }
        catch (Exception e)
        {
            Util.showGeneralExceptionInfo(e);

            if (transaction != null) transaction.rollback();

            return null;
        }
    }
}

