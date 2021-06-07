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
        return ent != null;
    }

    @Override
    public void ajouterEnt(Entite ent){
        if(!this.isOccupe()){
            this.ent = ent;
        }
    }

    @Override
    public void retirerEnt(){
        this.ent = null;
    }
}
