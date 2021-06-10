package Cases;

/**
 * classe obstacle
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


    public void desactivePiege(){
        this.active = false;
    }

    public void faireDegat(){
        this.personnage.subirDegat(1);
        this.desactivePiege();
        System.out.println(this.personnage.getPv());
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