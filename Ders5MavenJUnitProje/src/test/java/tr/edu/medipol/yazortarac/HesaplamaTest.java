package tr.edu.medipol.yazortarac;

import org.junit.Test;
import org.junit.*;

public class HesaplamaTest {

	@Test
	public void testToplama() {
		int asilSonuc1 = Hesaplama.toplama(2, 2);
		Assert.assertEquals(4, asilSonuc1);
		
		Assert.assertEquals(0, Hesaplama.toplama(-2, 2) );
		
		Assert.assertEquals(0, Hesaplama.toplama(2, -2) );
		
		Assert.assertEquals(99999, Hesaplama.toplama(0, 99999) );
	}
}
