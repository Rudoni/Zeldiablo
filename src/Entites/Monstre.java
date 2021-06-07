package Entites;

import Cases.Case;
import Game.*;

public class Monstre extends Entite {
    private String nom;
    private Case c;
    private Labyrinthe lab;

    public Monstre(String s, int hp, Labyrinthe laby, Case c) {
        super(s, hp, laby, c);
    }

    @Override
    public void move() {

    }

    /*
    @Override
    // pas d'intérêt de redéfinir pour le moment mais ajout d'autres obstacles par la suite
    public void move(int xMap, int yMap) {
        int dep = Math.abs(xMap) + Math.abs(yMap);
        // le monstre passera au dessus si c un buisson ou un tronc par exemple
        if (lab.isAccessible(x+xMap,y+yMap) && dep==1){
            this.x = x+xMap;
            this.y = y+yMap;
        }
    }
    */
}
