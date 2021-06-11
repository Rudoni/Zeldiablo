package Entites;

/**
 * Classe Monstre
 */
public class Monstre extends Personnage {

    /**
     * Constructeur de monstre
     * @param vie vie du monstre
     * @param d degats que le montre inflige
     */
    public Monstre(int vie,int d) {
        super(vie, d);
    }

    /**
     * permet de faire subir au monstre des degats
     * @param d degats subis
     */
    public void subirDegat(int d) {
        if (!this.etreMort()) {
            this.setPv(this.getPv() - d);
        }
    }

}
