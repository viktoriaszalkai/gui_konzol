package hu.szamalk.nezet;

import hu.szamalk.modell.Gyujtemeny;
import hu.szamalk.modell.Mukincs;
import hu.szamalk.modell.Szobor;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Konzol  {
    Gyujtemeny gy = new Gyujtemeny();

    public Konzol() {
        konzolraIr();
        fajlbair();
    }

    public void konzolraIr(){
        for (Mukincs mukincs : gy.szobrokalkotoSzerint()) {
            System.out.println(mukincs);
        }
        for (Mukincs mukincs : gy.festmenyek()) {
            System.out.println(mukincs);
        }
    }

    public void fajlbair(){
            try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("gyujtemeny.ser"))){
                objKi.writeObject(gy);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    private void statisztika(){


    }
    private void szobrok(){
        Gyujtemeny gy = new Gyujtemeny();
        for (Szobor sz : gy.szobrokalkotoSzerint()) {
            System.out.println(sz);
        }
    }

}
