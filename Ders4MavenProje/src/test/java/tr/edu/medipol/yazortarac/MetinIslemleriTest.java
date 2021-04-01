package tr.edu.medipol.yazortarac;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public final void testBasHarflerineKisaltBosInput() {
		assertEquals("", MetinIslemleri.basHarflerineKisalt(""));
		assertNull(MetinIslemleri.basHarflerineKisalt(null));
	}
	
	@Test
	public final void testBasHarflerineKisaltBuyukKucukHarf() {
		assertEquals("Gs", MetinIslemleri.basHarflerineKisalt("Galata saray"));
	}
	
	@Test
	public final void testBasHarflerineKisaltBJK() {
		
		// On kosullar
		String metin = "Besiktas Jimnastik Kulubu";
		
		// Asil test edecegimiz metodu cagiriyor ve sonucunu aliyoruz
		String sonuc = MetinIslemleri.basHarflerineKisalt(metin);
		
		// Sonucu kontrol ediyoruz
		// if(sonuc != "BJK") {
		// 	fail("Hatali sonuc. Sonuc BJK olmaliydi");
		// }
		
		assertEquals(
			"Hatali sonuc. Sonuc BJK olmaliydi", // Kosul saglanmazsa gosterilecek mesaj (opsiyonel)
			"BJK", // beklenen sonuc
			sonuc // asil uretilen sonuc
		);
 
	}

}
