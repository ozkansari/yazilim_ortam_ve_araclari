package tr.edu.medipol.yazortarac;

public class Hesaplama {

	/**
	 * Tam sayi toplama yapmayi saglayan metod
	 * 
	 * @param sayi1 birinici tam sayi
	 * @param sayi2 ikinci tam sayi
	 * 
	 * @return sayi1 ve sayi2 toplamini verir
	 */
	public static int toplama(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	/**
	 * Sinirsiz adet tam sayi icin toplama yapmayi saglayan metod
	 * 
	 * @param sayilar toplanacak tam sayi degerleri dizisi
	 * @return sayilarin toplamini doner
	 */
	public static int toplama(int [] sayilar) {
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		return toplam;
	}
	
}
