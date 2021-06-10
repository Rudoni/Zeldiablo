package Entites;

/**
 * Classe abstraite personnage
 */
public abstract class Personnage {
    private int pv;
    private int degats;

    /**
     * Constructeur de personnage
     * @param hp points de vie du perso
     */
    public Personnage(int hp, int degats){
        this.pv = hp;
        this.degats = degats;
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
    public void setPv(int newPv) {this.pv = newPv;}

    /**
     * Getter des dégats du perso
     * @return les dégats
     */
    public int getDegats() {
        return this.degats;
    }

    public boolean etreMort() {
        return this.getPv() == 0;
    }

    public abstract void subirDegat(int d);

    public void attaquer(Personnage p) {
        if (p != null){
            p.subirDegat(this.getDegats());
        }
    }
}
