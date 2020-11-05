package tr.edu.medipol.yazilimaraclari;

import org.apache.commons.lang3.StringUtils;

public class OrnekJavaProgrami1 {

	public static void main(String[] args) {
		System.out.println(karakterKontrol("Merhaba 123"));
		System.out.println(karakterKontrol("Merhaba-123****?"));
	}
	
	public static boolean karakterKontrol(String metin) {
		return StringUtils.isAlphanumericSpace(metin);
	}

}
