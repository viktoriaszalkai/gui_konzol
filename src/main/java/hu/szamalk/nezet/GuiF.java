package hu.szamalk.nezet;

import hu.szamalk.modell.Gyujtemeny;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class GuiF {
    private JComboBox cmbGyujtemeny;
    private JPanel pnlMain;
    private JFrame frame;
    private JMenuItem mitBeolvas;

    public GuiF() {
        ini();
        mitBeolvas.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("gyujtemeny.ser"))){
                    Gyujtemeny mukincsek = (Gyujtemeny) ois.readObject();
                    cmbGyujtemeny.addItem(mukincsek);
                }catch (FileNotFoundException ex){
                    System.err.println("error: " + ex.getMessage());
                    ex.printStackTrace();
                }catch (IOException | ClassNotFoundException ex){
                    System.err.println("error " + ex.getMessage());
                    ex.printStackTrace();
                }
            }

    });
    }

    public void ini() {
        frame = new JFrame("Gyűjtemény");
        frame.setContentPane(pnlMain);
        frame.setSize(520, 240);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        mitBeolvas = new JMenuItem("Beolvasás");
        JMenu mnuPrg = new JMenu("Program");
        mnuPrg.add(mitBeolvas);
        mnuPrg.add(new JSeparator());
        JMenuBar mnuBar = new JMenuBar();
        mnuBar.add(mnuPrg);
        frame.setJMenuBar(mnuBar);
        frame.pack();

    }

    }

