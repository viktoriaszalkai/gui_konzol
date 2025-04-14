package hu.szamalk.modell;

import java.io.Serializable;
import java.util.UUID;

public class Mukincs implements Serializable {
    private UUID azon;
    private String alkoto, cim;
    private Kategoriak kategoria;

    public Mukincs(UUID azon, String alkoto, String cim, Kategoriak kategoria) {
        this.azon = azon;
        this.alkoto = alkoto;
        this.cim = cim;
        this.kategoria = kategoria;
    }

    public UUID getAzon() {
        return azon;
    }

    public String getAlkoto() {
        return alkoto;
    }

    public String getCim() {
        return cim;
    }

    public Kategoriak getKategoria() {
        return kategoria;
    }

    @Override
    public String toString() {
        return "Mukincs{" +
                "azon=" + azon +
                ", alkoto='" + alkoto + '\'' +
                ", cim='" + cim + '\'' +
                ", kategoria=" + kategoria +
                '}';
    }
}
