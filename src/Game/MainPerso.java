package Game;

import MoteurJeu.MoteurGraphique;

/**
 * Classe principale pour l'utislisateur
 */
public class MainPerso {

    public static void main(String[] args) throws InterruptedException{
        JeuPerso jeu = new JeuPerso();
        DessinPerso dessin = new DessinPerso(jeu);
        MoteurGraphique moteur = new MoteurGraphique(jeu,dessin);
        moteur.lancerJeu(845,845);
        System.out.println("Finito");
    }
}
