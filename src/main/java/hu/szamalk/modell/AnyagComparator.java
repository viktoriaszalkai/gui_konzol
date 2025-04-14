package hu.szamalk.modell;

import java.text.Collator;
import java.util.Comparator;

public class AnyagComparator implements Comparator<Szobor> {
    @Override
    public int compare(Szobor o1, Szobor o2) {
        Collator c = Collator.getInstance();
        return c.compare(o1.getAnyag(), o2.getAnyag());
    }
}
