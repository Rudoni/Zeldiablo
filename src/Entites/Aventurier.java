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
                    if(lab.getCases()[saCase.getX()-1][saCase.getY()] instanceof Vide && !(lab.isOccupe(lab.getCases()[saCase.getX()-1][saCase.getY()]))){
                        saCase = lab.getCases()[saCase.getX()-1][saCase.getY()] ;
                        f = true;
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("s"):
                    if(lab.getCases()[saCase.getX()+1][saCase.getY()] instanceof Vide && !(lab.isOccupe(lab.getCases()[saCase.getX()+1][saCase.getY()]))){
                        saCase = lab.getCases()[saCase.getX()+1][saCase.getY()] ;
                        f = true;
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("d"):
                    if(lab.getCases()[saCase.getX()][saCase.getY()+1] instanceof Vide && !(lab.isOccupe(lab.getCases()[saCase.getX()][saCase.getY()+1]))){
                        saCase = lab.getCases()[saCase.getX()][saCase.getY()+1] ;
                        f = true;
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("q"):
                    if(lab.getCases()[saCase.getX()][saCase.getY()-1] instanceof Vide && !(lab.isOccupe(lab.getCases()[saCase.getX()][saCase.getY()-1]))){
                        saCase = lab.getCases()[saCase.getX()][saCase.getY()-1] ;
                        f = true;
                    } else {
                        System.out.println("case non accessible");
                    }
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
                    if(lab.getCases()[saCase.getX()-1][saCase.getY()] instanceof Vide && !(lab.isOccupe(lab.getCases()[saCase.getX()-1][saCase.getY()]))){
                        saCase = lab.getCases()[saCase.getX()-1][saCase.getY()] ;
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("s"):
                    if(lab.getCases()[saCase.getX()+1][saCase.getY()] instanceof Vide && !(lab.isOccupe(lab.getCases()[saCase.getX()+1][saCase.getY()]))){
                        saCase = lab.getCases()[saCase.getX()+1][saCase.getY()] ;
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("d"):
                    if(lab.getCases()[saCase.getX()][saCase.getY()+1] instanceof Vide && !(lab.isOccupe(lab.getCases()[saCase.getX()][saCase.getY()+1]))){
                        saCase = lab.getCases()[saCase.getX()][saCase.getY()+1] ;
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("q"):
                    if(lab.getCases()[saCase.getX()][saCase.getY()-1] instanceof Vide && !(lab.isOccupe(lab.getCases()[saCase.getX()][saCase.getY()-1]))s){
                        saCase = lab.getCases()[saCase.getX()][saCase.getY()-1] ;
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                default:
                    System.out.println("Veuillez entrer une coordonnée valide :");
                    lab.afficher();
                    break;
            }
    }


}
