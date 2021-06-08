package Entites;
import Game.*;
import Cases.*;
import MoteurJeu.Commande;

public abstract class Personnage {
    protected  String nom;
    protected  int pv;
    protected Case saCase;

    public Personnage(String s, int hp, Labyrinthe laby, Case c){
        if (!(s.equals("")) && (hp>0) && (laby != null)){
            this.nom = s;
            this.pv = hp;
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

    //méthode interne à la classe pour eviter du copier/coller
    public boolean essayerMovement(int x,int y,Labyrinthe lab){
        boolean f = false;
        if(lab.getCases()[saCase.getX()+x][saCase.getY()+y] instanceof Vide && !(lab.isOccupe(lab.getCases()[saCase.getX()+x][saCase.getY()+y]))){
            saCase = lab.getCases()[saCase.getX()+x][saCase.getY()+y] ;
            f = true;
        } else {
            System.out.println("case non accessible");
        }
        return f;
    }

    public abstract void move(Labyrinthe lab, Commande c);

    public Case getCase(){
        return saCase;
    }
    public int getPv() {
        return pv;
    }

}
