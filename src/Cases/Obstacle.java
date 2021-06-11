package Cases;

/**
 * classe obstacle
 */
public class Obstacle extends Case {

    /**
     * constructeur obstacle
     * @param x abscisse
     * @param y ordonnee
     */
    public Obstacle(int x, int y) {
        super(x,y);
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
    public void faireDegat() {

    }

    @Override
    public void retirerCoeur() {

    }

}
