package Entites;

import Cases.Case;
import Cases.Vide;
import Game.Labyrinthe;
import java.util.Scanner;

public class Aventurier extends Entite {

    public Aventurier(String s, int hp, Labyrinthe laby, Case c) {
        super(s, hp, laby,c);
        laby.ajouterAv(this);
    }

    @Override
    public void move(Labyrinthe lab) {
        boolean f = false;
        Scanner sc = new Scanner(System.in);
        while (!f){
            String dep = sc.nextLine();
            switch(dep){
                case("z"):
                    f = this.essayerMovement(-1,0,lab);
                    break;
                case("s"):
                    f = this.essayerMovement(+1,0,lab);
                    break;
                case("d"):
                    f = this.essayerMovement(0,+1,lab);
                    break;
                case("q"):
                    f = this.essayerMovement(0,-1,lab);
                    break;
                default:
                    System.out.println("Veuillez entrer une coordonnée valide :");
                    lab.afficher();
                    break;
            }
        }
    }

    /* Pour tester le move (on utilise une boucle qui redemande a chaque fois tant que le move n est pas bon) */
    public void move(String str,Labyrinthe lab) {
            String dep = str;
            switch(dep){
                case("z"):
                    this.essayerMovement(-1,0,lab);
                    break;
                case("s"):
                    this.essayerMovement(+1,0,lab);
                    break;
                case("d"):
                    this.essayerMovement(0,+1,lab);
                    break;
                case("q"):
                    this.essayerMovement(0,-1,lab);
                    break;
                default:
                    System.out.println("Veuillez entrer une coordonnée valide :");
                    lab.afficher();
                    break;
            }
    }
    //méthode interne à la classe pour eviter du copier/coller
    private boolean essayerMovement(int x,int y,Labyrinthe lab){
        boolean f = false;
        if(lab.getCases()[saCase.getX()+x][saCase.getY()+y] instanceof Vide && !(lab.isOccupe(lab.getCases()[saCase.getX()+x][saCase.getY()+y]))){
            saCase = lab.getCases()[saCase.getX()+x][saCase.getY()+y] ;
            f = true;
        } else {
            System.out.println("case non accessible");
        }
        return f;
    }
}
