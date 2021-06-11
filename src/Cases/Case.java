package Cases;

import Entites.Personnage;

/**
 * classe abstraite case
 */
public abstract class Case {
    /**
     * Attribut occupe
     */
    private boolean occupe;
    /**
     * entier coordonnees de la case
     */
    private  int x, y;

    /**
     * Personnage (ou non) de la case
     */
    Personnage personnage;

    /**
     * constructeur case
     * @param x abscisse
     * @param y ordonnee
     */
    public Case(int x, int y){
        this.x = x;
        this.y = y;
        this.personnage = null;
    }

    /**
     * getter x
     * @return entier x
     */
    public int getX() {
        return this.x;
    }

    /**
     * getter y
     * @return entier y
     */
    public int getY() {
        return this.y;
    }

    /**
     * Getter de personnage
     * @return le personnage
     */
    public Personnage getPersonnage() {
        return this.personnage;
    }

    /**
     * Setter de personnage
     * @param personnage
     */
    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    /**
     * Retirer un perso de la case
     */
    public void retirerPersonnage(){
        this.personnage = null;
    }

    /**
     * getter occupe
     * @return si la case est occupee
     */
    public boolean estOccupe(){
        return (this.personnage != null);
    }


    /**
     * Methode qui permet a une case d'infliger des dégats
     */
    public abstract void faireDegat();

    /**
     * getter amulette
     * @return vrai si l'amulette est la
     */
    public abstract boolean getAmulette();

    /**
     * getter coeur
     * @return vrai si le coeur est la
     */
    public abstract boolean isCoeur();

    /**
     * permet de retirer l'amulette
     */
    public abstract void retirerAmulette();

    /**
     * permet de retirer le coeur
     */
    public abstract void retirerCoeur();

}


