package Entites;

/**
 * Classe Aventurier
 */
public class Aventurier extends Personnage {

    /**
     * Constructeur d'aventurier
     *
     * @param s nom de l'aventurier
     */
    public Aventurier(String s) {
        super(s, 5, 10);
    }

    public void subirDegat(int d) {
        if (!this.EtreMort()) {
            this.setPv(this.getPv() - d);
        }
        if (EtreMort()) {
            System.out.println("Vous etes mort, vous avez perdu");
            System.exit(1);
        }
    }


}
