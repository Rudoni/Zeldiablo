package Cases;

import Entites.Personnage;

/**
 * classe abstraite case
 */

public abstract class Case {

    /**
     * entier coordonnees de la case
     */
    private  int x,y;

    /**
     * Personnage ou non de la case
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
}


