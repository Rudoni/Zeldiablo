package Entites;

/**
 * Classe abstraite personnage
 */
public abstract class Personnage {
    private  String nom;
    private  int pv;

    /**
     * Constructeur de personnage
     * @param s nom du perso
     * @param hp points de vie du perso
     */
    public Personnage(String s, int hp){
        this.nom = s;
        this.pv = hp;
    }

    /**
     * Getter du nom
     * @return le nom du personnage
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Getter des points de vie
     * @return points de vie du personnage
     */
    public int getPv() {
        return this.pv;
    }


}
