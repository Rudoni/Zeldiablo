package Game;

import Entites.Aventurier;
import MoteurJeu.Commande;
import MoteurJeu.Jeu;

public class JeuPerso implements Jeu {
    private Aventurier aventurier;
    private Labyrinthe lab;

    public JeuPerso(){

    }

    @Override
    public void evoluer(Commande commandeUser) {

    }

    @Override
    public boolean etreFini() {
        if (aventurier.getPv() == 0) {
            // afficher à l'écran la mort du perso
            return true;
        }
        /*if (aventurier.getCase() == ){
            return false;
        }

         */
        return false;
    }

    public Aventurier getPj() {
        return aventurier;
    }

}
