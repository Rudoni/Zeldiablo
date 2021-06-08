package Game;

import Cases.Case;
import Cases.Obstacle;
import Cases.Vide;
import Entites.Monstre;
import MoteurJeu.DessinJeu;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DessinPerso implements DessinJeu {

    private final int TAILLE = 20;
    private JeuPerso jeu;

    public DessinPerso(JeuPerso j) {
        this.jeu = j;
    }

    @Override
    public void dessiner(BufferedImage image) {
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.BLUE);
        Labyrinthe l = jeu.getLabyrinthe();
        Case[][] c = l.getCases();
        for (int x = 0; x < c.length; x++) {
            for (int y = 0; y < c.length; y++) {
                if (c[x][y] instanceof Vide){
                    g.setColor(Color.GRAY);
                    g.fillRect(x*TAILLE,y*TAILLE,TAILLE,TAILLE);
                } else {
                    g.setColor(Color.GREEN);
                    g.fillRect(x*TAILLE,y*TAILLE,TAILLE,TAILLE);
                }
            }
        }
        // boucle pour les monstres

        // Affichage du joueur
        int xAvent = l.getCaseAventurier().getX();
        int yAvent = l.getCaseAventurier().getY();
        g.fillOval(xAvent*TAILLE,yAvent*TAILLE,TAILLE,TAILLE);
    }
}
