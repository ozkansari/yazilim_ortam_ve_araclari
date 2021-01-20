package tr.edu.medipol.yazilimaraclari.SpringBootRestApi;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciRestApi {

	public static List<String> ogrenciler = new ArrayList<>();
	
	@GetMapping("/listele")
	public List<String> listele() {
		return ogrenciler;
	}
	
	@PostMapping("/ekle")
	public String ekle(@RequestBody String ad) {
		ogrenciler.add(ad);
		return ad;
	}
}
