package Cases;
import Entites.*;
import Game.*;

public abstract class Case {
    private Labyrinthe lab;
    private  int x,y;

    public Case(int x, int y, Labyrinthe laby){
        this.lab = laby;
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


