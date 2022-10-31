package com.migros.ucg.oracle.migros.db_yonetim.model.dal;

import com.migros.ucg.oracle.migros.db_yonetim.model.entity.Calisan;
import com.migros.ucg.oracle.migros.db_yonetim.model.utility.HibernateUtil;
import com.migros.ucg.oracle.migros.db_yonetim.model.utility.Sorgu;
import com.migros.ucg.oracle.migros.db_yonetim.model.utility.TabloAd;
import com.migros.ucg.utility.Util;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public class VarlikDAL<V, ID extends Serializable>
{
    private Session session;
    private Transaction transaction;

    private Class<V> varlikSinifi;
    private TabloAd tabloAd;

    public VarlikDAL(Class<V> varlikSinifi, TabloAd tabloAd)
    {
        this.varlikSinifi = varlikSinifi;
        this.tabloAd = tabloAd;
    }

    public boolean sil(ID varlikID)
    {
        try
        {
            session = HibernateUtil.getSession();
            transaction = HibernateUtil.getTransaction();

            V bulunanVarlik = (V) session.get(varlikSinifi, varlikID);

            session.delete(bulunanVarlik);

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

    public List<V> tumVarliklariCek()
    {
        try
        {
            session = HibernateUtil.getSession();
            transaction = HibernateUtil.getTransaction();

            SQLQuery sqlQuery = session.createSQLQuery(Sorgu.TUM_VARLIKLARI_CEK + tabloAd);

            return sqlQuery != null ? sqlQuery.addEntity(varlikSinifi).list() : null;
        }
        catch (Exception e)
        {
            Util.showGeneralExceptionInfo(e);

            return null;
        }
    }

    public Integer ekle(V varlik)
    {
        try
        {
            session = HibernateUtil.getSession();
            transaction = HibernateUtil.getTransaction();

            Integer varlikID = (Integer) session.save(varlik);

            transaction.commit();

            return varlikID;
        }
        catch (Exception e)
        {
            Util.showGeneralExceptionInfo(e);

            if (transaction != null) transaction.rollback();

            return null;
        }
    }
}
