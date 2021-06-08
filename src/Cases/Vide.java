package Cases;

/**
 * classe vide
 */

public class Vide extends Case {

    /**
     * Attribut occupe
     */
    private boolean occupe;

    /**
     * Constructeur d'une case vide
     * @param x emplacement abscisse
     * @param y emplacement ordonnee
     */
    public Vide(int x, int y) {
        super(x,y);
        this.occupe = false;
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



}
