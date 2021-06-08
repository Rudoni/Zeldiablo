package Game;

import MoteurJeu.DessinJeu;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DessinPerso implements DessinJeu {
    private final int TAILLE = 5;
    private JeuPerso jeu;

    public DessinPerso(){

    }
    @Override
    public void dessiner(BufferedImage image) {
        Graphics gi = image.getGraphics();
        int x = jeu.getAventurier().getCase().getX();
        int y = jeu.getAventurier().getCase().getY();
        gi.fillOval(x,y,x*TAILLE,y*TAILLE);
    }
}
