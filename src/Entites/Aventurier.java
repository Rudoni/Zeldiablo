package Entites;

/**
 * Classe Aventurier
 */
public class Aventurier extends Personnage {

    boolean amulette;

    /**
     * Constructeur d'aventurier
     *
     * @param s nom de l'aventurier
     */
    public Aventurier(String s) {
        super(s, 5, 10);
        this.amulette = false;
    }

    public void subirDegat(int d) {
        if (!this.etreMort()) {
            this.setPv(this.getPv() - d);
        }
        if (etreMort()) {
            System.out.println("Vous etes mort, vous avez perdu");
            System.exit(1);
        }
    }

    /**
     * Met l'amulette a vrai quand le perso la récupère
     */
    public void amuletteRecuperee() {
        this.amulette = true;
    }

    /**
     * Savoir si le perso a l'amulette
     * @return vrai si il possède l'amulette
     */
    public boolean getAmulette() {
        return this.amulette;
    }
}
