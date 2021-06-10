package Entites;

/**
 * Classe abstraite personnage
 */
public abstract class Personnage {
    private int pv;
    private int degats;
    private int pvMax;

    /**
     * Constructeur de personnage
     * @param hp points de vie du perso
     */
    public Personnage(int hp, int degats){
        this.pv = hp;
        this.degats = degats;
        this.pvMax = hp;
    }

    /**
     * Getter des points de vie
     * @return points de vie du personnage
     */
    public int getPv() {
        return this.pv;
    }

    /**
     * Setter des pvs
     * @param newPv nouveaux pv du perso
     */
    public void setPv(int newPv) {
        this.pv = newPv;
        if (this.pv>20){
            this.pv =20;
        }
    }

    /**
     * Getter des dégats du perso
     * @return les dégats
     */
    public int getDegats() {
        return this.degats;
    }

    public boolean etreMort() {
        return this.getPv() <= 0;
    }

    public abstract void subirDegat(int d);

    public void attaquer(Personnage p) {
        if (p != null){
            p.subirDegat(this.getDegats());
        }
    }

    public int getPvMax() {
        return pvMax;
    }
}
