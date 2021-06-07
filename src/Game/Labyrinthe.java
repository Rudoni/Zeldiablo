package Game;

import Cases.Case;
import Cases.Obstacle;
import Cases.Vide;
import Entites.Aventurier;
import Entites.Monstre;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Labyrinthe {
    private Case[][] cases;
    //private Cases.Case[][] cases;
    private Aventurier avent;
    private ArrayList<Monstre> monstres;
    private Case start;
    private Case end;

    public Labyrinthe(int[][] grille){
        this.cases = new Case[grille.length][grille.length];
        for(int i=0;i<grille.length;i++){
            for (int j=0;j<grille.length;j++){
                switch (grille[i][j]){
                    case(0):
                        cases[i][j] = new Vide(i,j,this);
                        break;
                    case(1):
                        cases[i][j] = new Obstacle(i,j,this);
                        break;
                    case(2):
                        Vide start = new Vide(i,j,this);
                        cases[i][j] = start;
                        this.start = start;
                        break;
                    case(3):
                        Vide end = new Vide(i,j,this);
                        cases[i][j] = end ;
                        this.end = end;
                        break;
                }

            }
        }
    }

    public boolean isOccupe(Case c){
        boolean f = false;
        for(int i=0;i<monstres.size();i++){
            if(monstres.get(i).getCase()==c){
                f = true;
            }
        }
        return f;
    }

    public Labyrinthe(){

        try {
            File f = new File("labyrinthe.txt");
            BufferedReader in = new BufferedReader(new FileReader(f));
            String a;
            int i = 0;
            while(!((a=in.readLine())==null)) {
                for (int j = 0; j < a.length(); j++) {
                    char tmp = a.charAt(j);
                    switch (tmp){
                        case('0'):
                            cases[i][j] = new Vide(i,j,this);
                            break;
                        case('1'):
                            cases[i][j] = new Obstacle(i,j,this);
                            break;
                        case('2'):
                            Vide start = new Vide(i,j,this);
                            cases[i][j] = start;
                            this.start = start;
                            break;
                        case('3'):
                            Vide end = new Vide(i,j,this);
                            cases[i][j] = end ;
                            this.end = end;
                            break;
                    }
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void ajouterAv(Aventurier av){
        this.avent = av;
    }

    public boolean fin(){
        return (avent.getCase()==this.end);
    }

    public void afficher(){
        for (Case[] aCase : this.cases) {
            for (int j = 0; j < this.cases.length; j++) {
                if (aCase[j] instanceof Vide) {
                    if (aCase[j] == this.end) {
                        System.out.print("E  ");
                    } else {
                        if ( this.isOccupe(aCase[j]) ) {
                            System.out.print("O  ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                } else {
                    System.out.print("X  ");
                }
            }
            System.out.println("");
        }
    }

    public void go(){
        if(this.start!=null && this.end!=null) {
            Aventurier av = new Aventurier("denis", 100, this, this.start);
            this.afficher();
            System.out.println("haut : z\nbas : s\ngauche : q\ndroite : d");
            while (!(this.fin())) {
                av.move();
                System.out.println();
                this.afficher();
            }
            System.out.println("Bien joué tu es sorti du Labyrinthe !");
        }else{
            System.out.println("Le Labyrinthe ne possède pas de case départ et/ou fin");
        }
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
