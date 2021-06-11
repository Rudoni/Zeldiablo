package Entites;

/**
 * Classe abstraite personnage
 */
public abstract class Personnage {
    /**
     * Pv du personnage
     */
    private int pv;
    /**
     * degats que le personnage inflige
     */
    private int degats;
    /**
     * pv maximaux que le perso peut avoir
     */
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

    /**
     * Savoir si le perso est mort
     * @return vrai si le perso est mort
     */
    public boolean etreMort() {
        return this.getPv() <= 0;
    }

    /**
     * Permet de faire subir des degats a un personnage
     * @param d degats subis
     */
    public abstract void subirDegat(int d);

    /**
     * permet a un personnage d'en attaquer un autre
     * @param p victime
     */
    public void attaquer(Personnage p) {
        if (p != null){
            p.subirDegat(this.getDegats());
        }
    }

    /**
     * getter du nombre de pvmax du personnage
     * @return pvmax du personnage
     */
    public int getPvMax() {
        return pvMax;
    }
}
