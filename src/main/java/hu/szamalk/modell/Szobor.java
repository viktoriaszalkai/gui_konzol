package hu.szamalk.modell;

import java.io.Serializable;
import java.text.Collator;
import java.util.UUID;

public class Szobor extends Mukincs implements Comparable<Szobor>, Serializable {

    private String anyag;
    private int evsz;


    public Szobor(UUID azon, String alkoto, String cim, Kategoriak kategoria, String anyag) {
        super(azon, alkoto, cim, kategoria);
        this.anyag = anyag;
        evsz = 20;
    }

    public Szobor(UUID azon, String alkoto, String cim, Kategoriak kategoria, String anyag, int evsz) {
        super(azon, alkoto, cim, kategoria);
        this.anyag = anyag;
        setEvsz(evsz);
    }

    public String getAnyag() {
        return anyag;
    }

    public int getEvsz() {
        return evsz;
    }

    public void setEvsz(int evsz) {

            if(evsz > 21){
                throw new NemLetezoSzazadException("a max évszázad 21!");
            }
            this.evsz = evsz;

    }

    public static AnyagComparator rendezAnyag(){
        return new AnyagComparator();
    }

    public static SzazadComparator rendezEvsz(){
        return new SzazadComparator();
    }


    @Override
    public String toString() {
        String os = super.toString();
        return os + "Szobor{" +
                "anyag='" + anyag + '\'' +
                ", evsz=" + evsz +
                '}';
    }

    @Override
    public int compareTo(Szobor o) {

        Collator collator = Collator.getInstance();
        return collator.compare(this.getAlkoto() ,  o.getAlkoto());
    }
}
