package Game;

import Entites.Personnage;
import MoteurJeu.Commande;
import MoteurJeu.Jeu;

/**
 * classe qui contient les donnees du jeu. Pour le moment, il ne possede qu'un
 * personnage
 *
 */
public class JeuPerso implements Jeu {

    /**
     * le personnage du jeu
     */
    private Labyrinthe labyrinthe;
    /**
     * Savoir si on est sorti du labyrinthe
     */
    private boolean sorti;
    /**
     * constructeur de jeu avec un Personnage
     */
    public JeuPerso() {
        this.labyrinthe = new Labyrinthe("Paul");
        this.sorti = false;
    }

    /**
     * methode qui contient l'evolution du jeu en fonction de la commande
     *
     * @param commandeUser commande utilisateur
     */
    @Override
    public void evoluer(Commande commandeUser) {
        labyrinthe.evoluerAventurier(commandeUser);
        this.sorti = labyrinthe.etreFini();
    }

    @Override
    public boolean etreFini() {
        // le jeu n'est jamais fini
        return false;
    }

}
