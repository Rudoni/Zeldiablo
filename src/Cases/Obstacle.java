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

    @Override
    public void faireDegat() {

    }

    @Override
    public boolean getAmulette() {
        return false;
    }

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
