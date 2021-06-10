package Game;

import Entites.Aventurier;
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
    private int num;
    /**
     * constructeur de jeu avec un Personnage
     */
    public JeuPerso() {
        this.num = 1;
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
        labyrinthe.evoluerMonstres();
        this.sorti = labyrinthe.etreFini();
        System.out.println(labyrinthe.getMonstres().size()+" "+labyrinthe.getCaseMonstres().size());
        if (this.sorti) {
            this.num++;
            this.labyrinthe.getAventurier().retirerAmulette();
            this.labyrinthe.changerLabyrinthe(num);
        }
    }

    /**
     * Revoie faux car le jeu ne fini pas
     * @return false
     */
    @Override
    public boolean etreFini() {
        // le jeu n'est jamais fini
        return false;
    }

    /**
     * Getter du labyrinthe
     * @return le labyrinthe
     */
    public Labyrinthe getLabyrinthe() {
        return this.labyrinthe;
    }

}
