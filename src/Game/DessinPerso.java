package Game;

import Cases.Case;
import Cases.Vide;
import MoteurJeu.DessinJeu;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DessinPerso implements DessinJeu {

    private final int TAILLE = 47;
    private JeuPerso jeu;
    private Image img_aventurier;
    private Image img_sol;
    private Image img_mur;
    private Image img_amu;

    public DessinPerso(JeuPerso j) {
        this.jeu = j;
    }

    @Override
    public void dessiner(BufferedImage image) {
        //Chargement des images
        try {
            img_aventurier = ImageIO.read(new File(".\\src\\Images\\magik.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
            img_mur = ImageIO.read(new File(".\\src\\Images\\GrayWalls.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
            img_sol = ImageIO.read(new File(".\\src\\Images\\grass.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
            img_amu = ImageIO.read(new File(".\\src\\Images\\amulette.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
        } catch (IOException ex) {
            System.out.println("Erreur : Chargement des images");
        }
        //Image imagenoer_re = imagenoer.getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);

        //----------------------------------------------------------------
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.BLUE);
        Labyrinthe l = jeu.getLabyrinthe();
        Case[][] c = l.getCases();
        for (int x = 0; x < c.length; x++) {
            for (int y = 0; y < c.length; y++) {
                if (c[y][x] instanceof Vide){
                    g.drawImage(img_sol, x*TAILLE, y*TAILLE, null);
                    //g.setColor(new Color(67, 67, 67));
                    //g.fillRect(x*TAILLE,y*TAILLE,TAILLE,TAILLE);
                    if (((Vide) c[y][x]).getAmulette()) {
                        g.setColor(Color.YELLOW);
                        //g.fillOval(y*TAILLE,x*TAILLE,TAILLE,TAILLE);
                        g.drawImage(img_amu, x*TAILLE, y*TAILLE, null);
                    }
                } else {
                    g.drawImage(img_mur, x*TAILLE, y*TAILLE, null);
                    //g.setColor(new Color(17, 67, 14));
                    //g.fillRect(x*TAILLE,y*TAILLE,TAILLE,TAILLE);
                }
            }
        }
        // boucle pour les monstres

        // Affichage du joueur
        int xAvent = l.getCaseAventurier().getX();
        int yAvent = l.getCaseAventurier().getY();


        g.drawImage(img_aventurier, yAvent*TAILLE, xAvent*TAILLE, null);
        //g.setColor(Color.RED);
        //g.fillOval(yAvent*TAILLE,xAvent*TAILLE,TAILLE,TAILLE);
    }
}
