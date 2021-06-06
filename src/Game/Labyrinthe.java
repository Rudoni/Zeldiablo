package Game;

import Cases.Case;
import Cases.Obstacle;
import Cases.Vide;
import Entites.Aventurier;
import Entites.Monstre;

import java.util.ArrayList;

public class Labyrinthe {
    private Case[][] cases;
    //private Cases.Case[][] cases;
    private Aventurier avent;
    private ArrayList<Monstre> monstres;

    public Labyrinthe(int[][] grille){
        this.cases = new Case[grille.length][grille.length];
        for(int i=0;i<grille.length;i++){
            for (int j=0;j<grille.length;j++){
                if(grille[i][j] == 0){
                    cases[i][j] = new Vide(i,j,this);
                } else {
                    cases[i][j] = new Obstacle(i,j,this);
                }
            }
        }
    }

    public Labyrinthe(){
        int[][] grille = {{1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},//0
                {1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1},//1
                {1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1},//2
                {1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1},//3
                {1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1},//4
                {1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1},//5
                {1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1},//6
                {1,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,1,0,1},//7
                {1,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1},//8
                {1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,1},//9
                {1,1,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1},//10
                {1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,1},//11
                {1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1},//12
                {1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,1},//13
                {1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1},//14
                {1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1},//15
                {1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,0,1},//16
                {1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,1},//17
                {1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1},//18
                {1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1},//19
                {1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1}};//20
        this.cases = new Case[grille.length][grille.length];
        for(int i=0;i<grille.length;i++){
            for (int j=0;j<grille.length;j++){
                if(grille[i][j] == 0){
                    cases[i][j] = new Vide(i,j,this);
                } else {
                    cases[i][j] = new Obstacle(i,j,this);
                }
            }
        }
    }

    public void ajouterAv(Aventurier av){
        this.avent = av;
    }

    public void afficher(){
        for(int i=0;i<this.cases.length;i++) {
            for (int j = 0; j < this.cases.length; j++) {
                if(cases[i][j] instanceof Vide){
                    if(((Vide) cases[i][j]).isOccupe()){
                        System.out.print("O ");
                    }else{
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
    }

    public void go(){
        Aventurier av = new Aventurier("denis",100,this,this.getCases()[2][2]);
        this.afficher();
        System.out.println("haut : h\nbas : b\ngauche : g\ndroite : d");
        while(true){
            av.move();
            System.out.println();
            this.afficher();
        }
    }

    public boolean isAccessible(int x, int y){
        /* if (cases[x][y] instanceof Cases.Obstacle){
            return false;
        } else {
            return true;
        } */
        return !(cases[x][y] instanceof Obstacle);
    }

    public Case[][] getCases() {
        return cases;
    }

    public Aventurier getAvent() {
        return avent;
    }

    public ArrayList<Monstre> getMonstres() {
        return monstres;
    }

    public static void main(String[] args) {
        Labyrinthe lab = new Labyrinthe();
        lab.go();
    }


}
