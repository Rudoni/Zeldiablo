package Cases;

import Entites.*;
import Game.*;


public class Vide extends Case {
    private Entite ent;

    public Vide(int x, int y, Labyrinthe laby) {
        super(x,y,laby);
        this.ent = null;
    }

    public boolean isOccupe(){
        if(ent==null){
            return false;
        } else {
            return true;
        }
    }

    public void ajouterEnt(Entite ent){
        if(!this.isOccupe()){
            this.ent = ent;
        }
    }

    public void retirerEnt(){
        this.ent = null;
    }
}
