package Cases;

/**
 * classe vide
 */

public class Vide extends Case {

    private boolean amulette;

    /**
     * Constructeur d'une case vide
     * @param x emplacement abscisse
     * @param y emplacement ordonnee
     * @param amulette si l'amulette est la
     */
    public Vide(int x, int y, boolean amulette) {
        super(x,y);
        this.amulette = amulette;
    }

    /**
     * savoir si l'amulette est sur la case
     * @return vrai si l'amulette est sur la case
     */
    public boolean getAmulette() {
        return this.amulette;
    }

    @Override
    public void faireDegat() {

    }

    public void attraperAmulette(){
        if (this.getPersonnage() != null && this.getAmulette()){

        }
    }
}
