package Game;

import Cases.Case;
import Cases.Vide;
import MoteurJeu.DessinJeu;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DessinPerso implements DessinJeu {

    private final int TAILLE = 47;
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
                if (c[y][x] instanceof Vide){
                    g.setColor(new Color(67, 67, 67));
                    g.fillRect(x*TAILLE,y*TAILLE,TAILLE,TAILLE);
                } else {
                    g.setColor(new Color(17, 67, 14));
                    g.fillRect(x*TAILLE,y*TAILLE,TAILLE,TAILLE);
                }
            }
        }
        // boucle pour les monstres

        // Affichage du joueur
        int xAvent = l.getCaseAventurier().getX();
        int yAvent = l.getCaseAventurier().getY();
        g.setColor(Color.RED);
        g.fillOval(yAvent*TAILLE,xAvent*TAILLE,TAILLE,TAILLE);
    }
}
