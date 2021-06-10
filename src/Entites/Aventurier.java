package Entites;

/**
 * Classe Aventurier
 */
public class Aventurier extends Personnage {
    private String nom;
    boolean amulette;


    /**
     * Constructeur d'aventurier
     *
     * @param s nom de l'aventurier
     */
    public Aventurier(String s) {
        super(5, 10);
        this.nom = s;
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

    public void retirerAmulette() {this.amulette = false;}

    /**
     * Getter du nom
     * @return le nom du personnage
     */
    public String getNom(){
        return this.nom;
    }

}
