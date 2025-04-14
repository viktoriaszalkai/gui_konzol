package hu.szamalk.modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Gyujtemeny implements Serializable {
    private List<Mukincs> mukincsek;

    public Gyujtemeny() {
        mukincsek = new ArrayList<>();
        mukincsek.add(new Szobor(UUID.randomUUID(),"szobrasz1","szobor1",Kategoriak.EREDETI,"anyag1",18));
        mukincsek.add(new Szobor(UUID.randomUUID(),"szobrasz2","szobor2",Kategoriak.KIS_ERTEKU,"anyag2",16));
        mukincsek.add(new Szobor(UUID.randomUUID(),"szobrasz3","szobor3",Kategoriak.MASOLAT,"anyag3"));
        mukincsek.add(new Szobor(UUID.randomUUID(),"szobrasz4","szobor4",Kategoriak.EREDETI,"anyag4",20));

        mukincsek.add(new Festmeny(UUID.randomUUID(),"festo1","festmeny1",Kategoriak.EREDETI,"stilus1","technika1" ));
        mukincsek.add(new Festmeny(UUID.randomUUID(),"festo2","festmeny2",Kategoriak.KIS_ERTEKU,"stilus2","technika2" ));
        mukincsek.add(new Festmeny(UUID.randomUUID(),"festo3","festmeny3",Kategoriak.MASOLAT,"stilus3","technika3" ));
        mukincsek.add(new Festmeny(UUID.randomUUID(),"festo4","festmeny4",Kategoriak.EREDETI,"stilus4","technika4" ));

    }

    public List<Szobor> szobrokalkotoSzerint(){
        List<Szobor> szobrok = new ArrayList<>();
        for (Mukincs mukincs : mukincsek) {
            if(mukincs instanceof Szobor){
                szobrok.add((Szobor) mukincs);
            }
        }

        Collections.sort(szobrok);
        return szobrok;
    }

    public List<Festmeny> festmenyek(){
        List<Festmeny> festmenyek = new ArrayList<>();
        for (Mukincs mukincs : mukincsek) {
            if(mukincs instanceof Festmeny){
                festmenyek.add((Festmeny) mukincs);
            }
        }
        return festmenyek;
    }

    @Override
    public String toString() {
        return "Gyujtemeny{" +
                "mukincsek=" + mukincsek +
                '}';
    }
}
