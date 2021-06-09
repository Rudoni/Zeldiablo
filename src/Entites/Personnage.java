package Entites;

/**
 * Classe abstraite personnage
 */
public abstract class Personnage {
    private String nom;
    private int pv;
    private int degats;

    /**
     * Constructeur de personnage
     * @param s nom du perso
     * @param hp points de vie du perso
     */
    public Personnage(String s, int hp, int degats){
        this.nom = s;
        this.pv = hp;
        this.degats = degats;
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

    public void subirDegat(Personnage p) {
        if (!this.etreMort()) {
            int pvActu = this.getPv();
            int degats = pvActu - p.getDegats();
            this.setPv(degats);
        } else {
            System.out.println("Vous etes mort, vous avez perdu");
            System.exit(1);
        }
    }

    public abstract void subirDegat(int d);


    public void attaquer(Personnage p) {
        if (p != null){
            p.subirDegat(this);
        }
    }
}
