package Cases;

/**
 * classe piege
 */
public class Piege extends Case {

    boolean active = true;

    /**
     * constructeur obstacle
     * @param x abscisse
     * @param y ordonnee
     */
    public Piege(int x, int y) {
        super(x,y);
    }

    public void faireDegat(){
        this.personnage.subirDegat(1);
        System.out.println(this.personnage.getPv());
    }

    /**
     * getter amulette
     * @return vrai si l'amulette est presente
     */
    @Override
    public boolean getAmulette() {
        return false;
    }

    /**
     * getter coeur
     * @return vrai si le coeur est la
     */
    @Override
    public boolean isCoeur() {
        return false;
    }

    @Override
    public void retirerAmulette() {
    }

    @Override
    public void retirerCoeur() {

    }
}