package Entites;

/**
 * Classe Aventurier
 */
public class Aventurier extends Personnage {
    /**
     * Nom de l'aventurier
     */
    private String nom;
    /**
     * Amulette de l'aventurier
     */
    private boolean amulette;
    /**
     * Constructeur d'aventurier
     *
     * @param s nom de l'aventurier
     */
    public Aventurier(String s) {
        super(20, 10);
        this.nom = s;
        this.amulette = false;
    }

    /**
     * Permet de subir de degats
     * @param d degats subis
     */
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

    /**
     * retire l'amulette de l'aventurier
     */
    public void retirerAmulette() {this.amulette = false;}


}
