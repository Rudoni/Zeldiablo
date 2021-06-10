package Cases;

import Entites.Aventurier;

/**
 * classe de case vide
 */

public class Vide extends Case {

    /**
     * Attribut permettant de savoir si la case est la case ou se trouve l'amulette
     */
    private boolean amulette;

    /**
     * Attribut permettant de redonner de la vie au joueur
     */
    private boolean coeur;

    /**
     * Constructeur d'une case vide
     * @param x emplacement abscisse
     * @param y emplacement ordonnee
     * @param amulette si l'amulette est la
     */
    public Vide(int x, int y, boolean amulette, boolean coeur) {
        super(x,y);
        this.amulette = amulette;
        this.coeur = coeur;
    }

    /**
     * savoir si l'amulette est sur la case
     * @return vrai si l'amulette est sur la case
     */
    @Override
    public boolean getAmulette() {
        return this.amulette;
    }

    /**
     * Permet de retirer l'amulette
     */
    @Override
    public void retirerAmulette() {
        if (this.getPersonnage() instanceof Aventurier && this.getAmulette()){
            amulette = false;
        }
    }

    /**
     * Permet a la case d'infliger des degats
     */
    @Override
    public void faireDegat() {

    }

    public boolean isCoeur() {
        return coeur;
    }

    public void retirerCoeur(){
        if (this.getPersonnage() instanceof Aventurier && this.isCoeur()){
            coeur = false;
        }
    }

}
