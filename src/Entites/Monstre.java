package Entites;

/**
 * Classe Monstre
 */
public class Monstre extends Personnage {

    /**
     * Constructeur de monstre
     * @param s nom du monstre
     */
    public Monstre(int vie,int d) {
        super(vie, d);
    }

    public void subirDegat(int d) {
        if (!this.etreMort()) {
            this.setPv(this.getPv() - d);
        }
    }

}
