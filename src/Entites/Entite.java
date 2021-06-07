package Entites;
import Game.*;
import Cases.*;

public abstract class Entite {
    protected  String nom;
    protected  int pv;
    protected Case saCase;
    protected Labyrinthe lab;


    public Entite(String s, int hp, Labyrinthe laby, Case c){
        if (!(s.equals("")) && (hp>0) && (laby != null)){
            this.nom = s;
            this.pv = hp;
            this.lab = laby;
            this.saCase = c;
        }

        if (s.equals("")){
            System.out.println("Veuillez entrer un nom valide (non nul).");
        }
        if (hp<0){
            System.out.println("L'aventurier ne peut pas débuter en étant mort");
        }
        if (laby == null){
            System.out.println("Le labyrinthe n'existe pas");
        }
    }

    public abstract void move();


    public int getPv() {
        return pv;
    }
}
