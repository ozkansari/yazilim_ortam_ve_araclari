package tr.edu.medipol.yazortarac;

import org.apache.commons.text.WordUtils;

public class MetinIslemleri {

	public static void main(String[] args) {
		
		String metin = "Besiktas Jimnastik Kulubu";
		
		String sonuc = basHarflerineKisalt(metin);
		
		System.out.println(metin + " -> " + sonuc);
	}

	protected static String basHarflerineKisalt(String metin) {
		String sonuc = WordUtils.initials(metin);
		return sonuc;
	}

}
