package Game;

import Cases.*;
import Entites.*;
import MoteurJeu.DessinJeu;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DessinPerso implements DessinJeu {

    private final int TAILLE = 47;
    private final int VIEJOUEUR = 20;
    private final int VIETROLL = 40;
    private JeuPerso jeu;
    private Image img_aventurier, img_sol, img_mur, img_amu, img_piege, img_troll, img_fantome, img_coeur;

    /**
     * Constructeur de Dessin
     *
     * @param j jeu
     */
    public DessinPerso(JeuPerso j) {
        this.jeu = j;
    }

    /**
     * Definit ce qui est affiche a l'ecran
     *
     * @param image bufferedImage
     */
    @Override
    public void dessiner(BufferedImage image) {
        //Chargement des images
        try {
            img_aventurier = ImageIO.read(new File(".\\src\\Images\\magik.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
            img_mur = ImageIO.read(new File(".\\src\\Images\\GrayWalls.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
            img_sol = ImageIO.read(new File(".\\src\\Images\\grass.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
            img_amu = ImageIO.read(new File(".\\src\\Images\\amulette.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
            img_piege = ImageIO.read(new File(".\\src\\Images\\piege.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
            img_troll = ImageIO.read(new File(".\\src\\Images\\troll.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
            img_fantome = ImageIO.read(new File(".\\src\\Images\\fantome.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
            img_coeur = ImageIO.read(new File(".\\src\\Images\\coeur.png")).getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);
        } catch (IOException ex) {
            System.out.println("Erreur : Chargement des images");
        }
        //Image imagenoer_re = imagenoer.getScaledInstance(TAILLE, TAILLE, Image.SCALE_DEFAULT);

        //----------------------------------------------------------------
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.BLUE);
        Labyrinthe l = jeu.getLabyrinthe();
        Case[][] c = l.getCases();
        ArrayList<Monstre> monstre = l.getMonstres();
        ArrayList<Case> c_monstre = l.getCaseMonstres();

        for (int x = 0; x < c.length; x++) {
            for (int y = 0; y < c.length; y++) {
                if (!(c[y][x] instanceof Obstacle)) {
                    g.drawImage(img_sol, x * TAILLE, y * TAILLE, null);
                    //g.setColor(new Color(67, 67, 67));
                    //g.fillRect(x*TAILLE,y*TAILLE,TAILLE,TAILLE);
                    if (c[y][x] instanceof Vide) {
                        if ((c[y][x]).getAmulette()) {
                            //g.fillOval(y*TAILLE,x*TAILLE,TAILLE,TAILLE);
                            g.drawImage(img_amu, x * TAILLE, y * TAILLE, null);
                        }
                        if (c[y][x].isCoeur()){
                            g.drawImage(img_coeur, x*TAILLE,y*TAILLE,null);
                        }
                    }
                    if (c[y][x] instanceof Piege) {
                        g.drawImage(img_piege, x * TAILLE, y * TAILLE, null);
                    }
                } else {
                    g.drawImage(img_mur, x * TAILLE, y * TAILLE, null);
                    //g.setColor(new Color(17, 67, 14));
                    //g.fillRect(x*TAILLE,y*TAILLE,TAILLE,TAILLE);
                }
            }
        }
        // boucle pour les monstres
        for (int i = 0; i < monstre.size(); i++) {
            if (monstre.get(i) != null) {
                int x_m = c_monstre.get(i).getX();
                int y_m = c_monstre.get(i).getY();
                if (monstre.get(i) instanceof Troll) {
                    g.drawImage(img_troll, y_m * TAILLE, x_m * TAILLE, null);
                    BarVie(g,x_m,y_m,monstre.get(i),VIETROLL);
                } else {
                    //Alors c'est un monstre fantome
                    g.drawImage(img_fantome, y_m * TAILLE, x_m * TAILLE, null);

                }
            }
        }
        // Affichage du joueur
        int xAvent = l.getCaseAventurier().getX();
        int yAvent = l.getCaseAventurier().getY();


        g.drawImage(img_aventurier, yAvent * TAILLE, xAvent * TAILLE, null);
        BarVie(g,xAvent,yAvent,l.getAventurier(),VIEJOUEUR);
        //g.setColor(Color.RED);
        //g.fillOval(yAvent*TAILLE,xAvent*TAILLE,TAILLE,TAILLE);
    }

    public void BarVie(Graphics2D g,int x,int y,Personnage p,int pvMax){
        g.setColor(Color.GREEN);
        g.fillRect(y*TAILLE,x*TAILLE,TAILLE*p.getPv()/pvMax,TAILLE/6);
        g.setColor(Color.BLACK);
        g.drawRect(y*TAILLE,x*TAILLE,TAILLE,TAILLE/6);
    }
}
