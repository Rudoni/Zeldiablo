package Game;

import Cases.Case;
import Cases.Obstacle;
import Cases.Vide;
import Entites.Aventurier;
import Entites.Monstre;
import Entites.Personnage;
import MoteurJeu.Commande;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe labyrinthe
 */
public class Labyrinthe {
    /**
     * Attributs de type case
     */
    private Case[][] cases;
    private Case caseDepart;
    private Case caseArrivee;

    /**
     * Attributs de type personnages
     */
    private Aventurier aventurier;
    private Case caseAventurier;
    private ArrayList<Monstre> monstres;

    /**
     * Constructeur de labyrinthe a partir d'un fichier texte
     */
    public Labyrinthe() {

        //Instanciation des attributs
        this.aventurier = new Aventurier("Paul");
        this.monstres = new ArrayList<Monstre>();
        this.cases = new Case[21][21];

        //Lecture du fichier texte pour créer le labyrinthe
        try {
            //Mise en place d'un reader
            File f = new File("labyrinthe.txt");
            BufferedReader in = new BufferedReader(new FileReader(f));
            String a;
            int i = 0;
            //Lecture de chaque lignes du fichier
            while (!((a = in.readLine()) == null)) {
                for (int j = 0; j < a.length(); j++) {
                    char tmp = a.charAt(j);
                    //Identifier le types de cases
                    switch (tmp) {
                        case ('0'):
                            cases[i][j] = new Vide(i, j);
                            break;
                        case ('1'):
                            cases[i][j] = new Obstacle(i, j);
                            break;
                        case ('2'):
                            Vide debut = new Vide(i, j);
                            cases[i][j] = debut;
                            this.caseDepart = debut;
                            break;
                        case ('3'):
                            Vide fin = new Vide(i, j);
                            cases[i][j] = fin;
                            this.caseArrivee = fin;
                            break;
                    }
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Permet de déplacer un personnage sur la map
     *
     * @param p personnage à déplacer
     * @param x Abscisse où déplacer le perso
     * @param y Ordonnee où déplacer le perso
     */
    public void deplacerPerso(Personnage p, int x, int y) {
        this.cases[x][y].setPersonnage(p);
    }

    /**
     * Getteur de l'aventurier
     *
     * @return l'aventurier
     */
    public Aventurier getAventurier() {
        return this.aventurier;
    }

    public Case[][] getCases() {
        return this.cases;
    }

    public void deplacer() {
        Scanner sc = new Scanner(System.in);
        String dep = sc.nextLine();
        boolean f = false;
        while (!f) {
            switch (dep) {
                case ("z"):
                    f = this.essayerMovement(-1, 0, this.aventurier);
                    break;
                case ("s"):
                    f = this.essayerMovement(+1, 0, this.aventurier);
                    break;
                case ("d"):
                    f = this.essayerMovement(0, +1, this.aventurier);
                    break;
                case ("q"):
                    f = this.essayerMovement(0, -1, this.aventurier);
                    break;
                default:
                    System.out.println("Veuillez entrer une coordonnée valide :");
            }
        }
    }

    //POUR LES TESTS DE MOUVEMENTS
    public void deplacer(String c) {
        switch (c) {
            case ("z"):
                this.essayerMovement(-1, 0, this.aventurier);
                break;
            case ("s"):
                this.essayerMovement(+1, 0, this.aventurier);
                break;
            case ("d"):
                this.essayerMovement(0, +1, this.aventurier);
                break;
            case ("q"):
                this.essayerMovement(0, -1, this.aventurier);
                break;
            default:
                System.out.println("Veuillez entrer une coordonnée valide :");
        }
    }

    //méthode interne à la classe pour eviter du copier/coller
    private boolean essayerMovement(int x, int y, Personnage pers) {
        boolean f = false;
        if (this.getCases()[this.caseAventurier.getX() + x][this.caseAventurier.getY() + y] instanceof Vide && !(this.getCases()[this.caseAventurier.getX() + x][this.caseAventurier.getY() + y].estOccupe())) {
            this.caseAventurier.retirerPersonnage();
            this.caseAventurier = this.getCases()[this.caseAventurier.getX() + x][this.caseAventurier.getY() + y];
            this.caseAventurier.setPersonnage(pers);
            f = true;
        } else {
            System.out.println("case non accessible");
        }
        return f;
    }

}
