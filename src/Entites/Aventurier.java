package Entites;

import Cases.Case;
import Cases.Vide;
import Game.Labyrinthe;
import MoteurJeu.*;

import java.util.Scanner;

public class Aventurier extends Entite {

    public Aventurier(String s, int hp, Labyrinthe laby, Case c) {
        super(s, hp, laby,c);
        c.ajouterEnt(this);
        lab.ajouterAv(this);
    }

    public void deplacer(Commande commande){

    }

    @Override
    public void move() {
        boolean f = false;
        Scanner sc = new Scanner(System.in);

        while (!f){

            String dep = sc.nextLine();
            switch(dep){
                case("z"):
                    if(lab.getCases()[saCase.getX()-1][saCase.getY()] instanceof Vide){
                        saCase.retirerEnt();
                        saCase = lab.getCases()[saCase.getX()-1][saCase.getY()] ;
                        saCase.ajouterEnt(this);
                        f = true;
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;

                case("s"):
                    if(lab.getCases()[saCase.getX()+1][saCase.getY()] instanceof Vide){
                        saCase.retirerEnt();
                        saCase = lab.getCases()[saCase.getX()+1][saCase.getY()] ;
                        saCase.ajouterEnt(this);
                        f = true;
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("d"):
                    if(lab.getCases()[saCase.getX()][saCase.getY()+1] instanceof Vide){
                        saCase.retirerEnt();
                        saCase = lab.getCases()[saCase.getX()][saCase.getY()+1] ;
                        saCase.ajouterEnt(this);
                        f = true;
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("q"):
                    if(lab.getCases()[saCase.getX()][saCase.getY()-1] instanceof Vide){
                        saCase.retirerEnt();
                        saCase = lab.getCases()[saCase.getX()][saCase.getY()-1] ;
                        saCase.ajouterEnt(this);
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
    public void move(String str) {
            String dep = str;
            switch(dep){
                case("z"):
                    if(lab.getCases()[saCase.getX()-1][saCase.getY()] instanceof Vide){
                        saCase.retirerEnt();
                        saCase = lab.getCases()[saCase.getX()-1][saCase.getY()] ;
                        saCase.ajouterEnt(this);
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("s"):
                    if(lab.getCases()[saCase.getX()+1][saCase.getY()] instanceof Vide){
                        saCase.retirerEnt();
                        saCase = lab.getCases()[saCase.getX()+1][saCase.getY()] ;
                        saCase.ajouterEnt(this);
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("d"):
                    if(lab.getCases()[saCase.getX()][saCase.getY()+1] instanceof Vide){
                        saCase.retirerEnt();
                        saCase = lab.getCases()[saCase.getX()][saCase.getY()+1] ;
                        saCase.ajouterEnt(this);
                    } else {
                        System.out.println("case non accessible");
                    }
                    break;
                case("q"):
                    if(lab.getCases()[saCase.getX()][saCase.getY()-1] instanceof Vide){
                        saCase.retirerEnt();
                        saCase = lab.getCases()[saCase.getX()][saCase.getY()-1] ;
                        saCase.ajouterEnt(this);
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

    public Case getCase(){
        return saCase;
    }


}
