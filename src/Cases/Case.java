package Cases;


import Entites.Entite;
import Game.Labyrinthe;

public abstract class Case {
    protected Labyrinthe lab;
    protected  int x,y;

    public Case(int x, int y, Labyrinthe laby){
        this.lab = laby;
        this.x = x;
        this.y = y;

    }

    public abstract void retirerEnt();

    public abstract void ajouterEnt(Entite e);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


