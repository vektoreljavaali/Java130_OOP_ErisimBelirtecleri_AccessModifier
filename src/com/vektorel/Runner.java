package com.vektorel;

import com.vektorel.entity.SatisRepository;
import com.vektorel.entity.UrunRepository;

public class Runner {


        /**
         * Erişim Belirteçleri,
         * Tanım: Herhangi bir bileşenin(Class, Method, Değişken) erişiminin
         * kontrol edilmesi amacıyla kullanılır. Güvenli kodlamada önemlidir.
         * daha bir çok alanda kullanılır.
         * Türleri:
         *  - Private: En kapalı türüdür, sadece sınıf içine açıktır.
         *  - Protected: Bulunduğu düzey- Paket içine açıktır.
         *  - Public: Tüm erişimlere açıktır. En geniş kapsamlı kullanımdır.
         *  - *Default, bazı dökümantasyonlarda görebilirsiniz. erişim belirteci
         *     kullanılmadığı zaman ifade edilir. Özellikle Default diye bir erişim
         *     belirteci yoktur.
         */
        public static void main(String[] args) {
            UrunRepository repository = new UrunRepository();
            repository.UrunEkleme( "Laptop A",2500);

            SatisRepository satisRepository = new SatisRepository();
            satisRepository.satisYap("Muhammet HOCA","ggghg",23);
        }


}
