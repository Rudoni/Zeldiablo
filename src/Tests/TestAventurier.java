package Tests;

import Entites.Aventurier;
import Game.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAventurier {
    private int[][] tabTest = {
        {1,1,1,1,1},
        {1,0,0,0,1},
        {1,0,0,0,1},
        {1,0,0,0,1},
        {1,1,1,1,1}
    };
    private Labyrinthe lab = new Labyrinthe(tabTest);

    @Test
    public void testMoveHautOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[2][2]);
        av.move("z");
        assertEquals("Devrait se trouver en x:2 y:1",lab.getCases()[1][2],av.getCase());
    }

    @Test
    public void testMoveBasOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[2][2]);
        av.move("s");
        assertEquals("Devrait se trouver en x:2 y:3",lab.getCases()[3][2],av.getCase());
    }

    @Test
    public void testMoveGaucheOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[2][2]);
        av.move("q");
        assertEquals("Devrait se trouver en x:1 y:2",lab.getCases()[2][1],av.getCase());
    }

    @Test
    public void testMoveDroiteOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[2][2]);
        av.move("d");
        assertEquals("Devrait se trouver en x:3 y:2",lab.getCases()[2][3],av.getCase());
    }

    @Test
    public void testMoveObstacle(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[1][3]);
        av.move("d");
        assertEquals("Devrait se trouver en x:3 y:1",lab.getCases()[1][3],av.getCase());
    }



}
