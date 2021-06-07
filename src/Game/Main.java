package Game;

import MoteurJeu.MoteurGraphique;
import MoteurJeu.PanelDessin;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static JeuPerso jp;
    private static DessinPerso dp;
    private static MoteurGraphique mg;

    public static void main(String[] args) throws InterruptedException {
        JFrame fenetre = new JFrame("Zeldiablo");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400;
        int height = 400;
        dp = new DessinPerso();
        jp = new JeuPerso();
        PanelDessin p = new PanelDessin(width, height, dp);
        mg = new MoteurGraphique(new JeuPerso(), dp);
        mg.lancerJeu(width, height);


        p.setPreferredSize(new Dimension(width, height));
        fenetre.setContentPane(p);
        fenetre.pack();
        fenetre.setVisible(true);
    }

}
