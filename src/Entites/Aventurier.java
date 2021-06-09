package Entites;

/**
 * Classe Aventurier
 */
public class Aventurier extends Personnage {

    /**
     * Constructeur d'aventurier
     * @param s nom de l'aventurier
     */
    public Aventurier(String s) {
        super(s, 5, 10);
    }

    /**
     * Savoir si l'aventurier est mort
     * @return vrai si il est mort
     */
    public boolean AventurierEtreMort() {
        return this.getPv() == 0;
    }

    /**
     * Faire subir des degats a un aventurier
     */
    public void subirDegat(Personnage p) {
        if (!this.AventurierEtreMort()) {
            int pvActu = this.getPv();
            this.setPv(pvActu -= p.getDegats());
        }
        if (this.AventurierEtreMort()) {
            System.out.println("Vous etes mort, vous avez perdu");
            System.exit(1);
        }
    }


    @Override
    public void attaquer(Personnage p) {
        if (p != null){
            p.subirDegat(this);
        }
    }

}
