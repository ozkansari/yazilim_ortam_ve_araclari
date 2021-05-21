package tr.edu.medipol.yazilimaraclari.ders10;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciRestApi {

    @GetMapping("/listele")
    public List<Ogrenci> listele(){
        return OgrenciDepo.ogrencileriGetir();
    }
    
    
}
