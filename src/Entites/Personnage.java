package Entites;

public abstract class Personnage {
    private  String nom;
    private  int pv;

    public Personnage(String s, int hp){
        this.nom=s;
        this.pv=hp;
    }

    //méthode interne à la classe pour eviter du copier/coller
    /*
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
    */

    /*
    public abstract void move(Labyrinthe lab, Commande c);
    */

    public String getNom(){
        return nom;
    }

    public int getPv() {
        return pv;
    }

}
