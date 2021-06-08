package Cases;

/**
 * classe abstraite case
 */

public abstract class Case {

    /**
     * entier coordonnees de la case
     */

    private  int x,y;

    /**
     * constructeur case
     * @param x abscisse
     * @param y ordonnee
     */

    public Case(int x, int y){
        this.x = x;
        this.y = y;

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
}


