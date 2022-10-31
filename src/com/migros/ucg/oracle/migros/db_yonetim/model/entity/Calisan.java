package com.migros.ucg.oracle.migros.db_yonetim.model.entity;

import javax.persistence.*;
import java.util.Date;

@SequenceGenerator(name = "CALISANLAR_SEQUENCE", sequenceName = "CALISANLAR_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "CALISANLAR")
@Entity
public class Calisan
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CALISANLAR_SEQUENCE")
    @Column(name = "CALISAN_ID")
    @Id
    private Integer calisanID;

    private String isim;

    private String soyisim;

    private Double maas;

    @Temporal(TemporalType.DATE)
    @Column(name = "ISE_GIRIS_TARIHI")
    private Date iseGirisTarihi;

    public Calisan(String isim, String soyisim, double maas)
    {
        this.isim = isim;
        this.soyisim = soyisim;
        this.maas = maas;
        iseGirisTarihi = new Date();
    }

    public Calisan()
    {
        iseGirisTarihi = new Date();
    }

    public Integer getCalisanID() {
        return calisanID;
    }

    public void setCalisanID(Integer calisanID) {
        this.calisanID = calisanID;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Double getMaas() {
        return maas;
    }

    public void setMaas(Double maas) {
        this.maas = maas;
    }

    public Date getIseGirisTarihi() {
        return iseGirisTarihi;
    }

    public void setIseGirisTarihi(Date iseGirisTarihi) {
        this.iseGirisTarihi = iseGirisTarihi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "calisanID=" + calisanID +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", maas=" + maas +
                ", iseGirisTarihi=" + iseGirisTarihi +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calisan calisan = (Calisan) o;

        return calisanID != null ? calisanID.equals(calisan.calisanID) : calisan.calisanID == null;
    }

    @Override
    public int hashCode() {
        return calisanID != null ? calisanID.hashCode() : 0;
    }
}
