package com.vektorel.entity;

import java.util.ArrayList;
import java.util.List;

public class UrunRepository {

    /**
     * Sadece Sınıf içine Açık
     */
    private List<Urun> urunListesi = new ArrayList<>();

    /**
     * Tüm Erişim Lokasyonlarına Açık
     * @param ad
     * @param fiyat
     */
    public void UrunEkleme(String ad,double fiyat){
        Urun urun = new Urun();
        urun.save(ad,fiyat);
        urun.yazdir();
    }

    /**
     * Sadece Paket içerisine Açık
     * @param id
     * @return
     */
    protected Urun findById(String id){
        Urun urun = new Urun();
        urun.save("PC 1500",36500);
        return urun;
    }
}
