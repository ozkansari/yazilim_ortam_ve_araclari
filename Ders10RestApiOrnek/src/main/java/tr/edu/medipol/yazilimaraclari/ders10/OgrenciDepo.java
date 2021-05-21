package tr.edu.medipol.yazilimaraclari.ders10;

import java.util.*;

public final class OgrenciDepo {

    private static final List<Ogrenci> OGRENCILER = new ArrayList<>(); 
    static {
        OGRENCILER.add( new Ogrenci("Ali Kalyoncu"  ,"HR202024541744") );
        OGRENCILER.add( new Ogrenci("Ayşe Şen"      ,"HR202054354354") );
        OGRENCILER.add( new Ogrenci("Fatma Kurban"  ,"HR202023432446") );
        OGRENCILER.add( new Ogrenci("Ahmet Gözüpek" ,"HR202545464247") );
    }
    
    private OgrenciDepo() {
        
    }
    
    public static List<Ogrenci> ogrencileriGetir() {
        return OGRENCILER;
    }
    
    public static List<Ogrenci> ogrenciEkle(Ogrenci ogrenci) {
        OGRENCILER.add(ogrenci);
        return OGRENCILER;
    }
    
    public static List<Ogrenci> ogrenciSil(String numara){
        for(Ogrenci o : OGRENCILER) {
            if( o.getNumara().equals(numara) ) {
                OGRENCILER.remove(o);
            }
        }
        
        return OGRENCILER;
    }
    
}
