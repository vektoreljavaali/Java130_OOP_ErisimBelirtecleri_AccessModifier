package com.vektorel.entity;

public class SatisRepository {

    /**
     * bir müşteriye ürün satışı yapmak için müşteri bilgileri alınır.
     * ürünün özel id numarası alınır, ve satışı yapılan adet alınır.
     * UrunRepository den id sini verdiği ürünün  kendisini isteyecek.
     * @param musteri
     * @param urunId
     * @param adet
     */
    public void satisYap(String musteri, String urunId, int adet){
        UrunRepository repository = new UrunRepository();
        /**
         * Repository ye ürünün id sini vererek ürün nesnesini talep ettim.
         */
        Urun urun = repository.findById(urunId);
        System.out.println("Satış Yapıldı..: "+ musteri);
        urun.yazdir();
    }
}
