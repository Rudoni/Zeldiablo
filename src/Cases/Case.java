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
        this.occupe = false;
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

    public void retirerPersonnage(){
        this.personnage = null;
    }

    /**
     * Setter occupe
     */
    public void setOccupe(){
        this.occupe = !this.occupe;
    }

    /**
     * getter occupe
     * @return si la case est occupee
     */
    public boolean estOccupe(){
        return this.occupe;
    }


    public abstract void faireDegat();

    public abstract boolean getAmulette();

    public abstract void retirerAmulette();
}


