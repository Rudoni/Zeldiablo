package Game;

import Entites.Personnage;
import MoteurJeu.Jeu;

/**
 * Classe principale pour l'utislisateur
 */
public class MainPerso {

    /**
     * Programme principal pour lancer le jeu
     * @param args arguments du programmes principal (resteront vides)
     */
    public static void main(String[] args) {
        Labyrinthe labyrinthe = new Labyrinthe();
        Personnage aventurier = labyrinthe.getAventurier();
    }
}
