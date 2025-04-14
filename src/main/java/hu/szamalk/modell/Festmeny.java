package hu.szamalk.modell;

import java.io.Serializable;
import java.util.UUID;

public class Festmeny extends Mukincs implements Serializable {
    private String stilus, technika;

    public Festmeny(UUID azon, String alkoto, String cim, Kategoriak kategoria, String stilus, String technika) {
        super(azon, alkoto, cim, kategoria);
        this.stilus = stilus;
        this.technika = technika;
    }

    public String getStilus() {
        return stilus;
    }

    public String getTechnika() {
        return technika;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "Festmeny{" +
                "stilus='" + stilus + '\'' +
                ", technika='" + technika + '\'' +
                '}';
    }
}
