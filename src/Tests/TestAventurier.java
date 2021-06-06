package Tests;

import Entites.Aventurier;
import Game.Labyrinthe;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAventurier {
    private Labyrinthe lab = new Labyrinthe();

    @Test
    public void testMoveHautOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[1][3]);
        av.move("h");
        assertEquals("Devrait se trouver en x:3 y:0",lab.getCases()[0][3],av.getCase());
    }

    @Test
    public void testMoveBasOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[1][3]);
        av.move("b");
        assertEquals("Devrait se trouver en x:3 y:2",lab.getCases()[2][3],av.getCase());
    }

    @Test
    public void testMoveGaucheOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[1][3]);
        av.move("g");
        assertEquals("Devrait se trouver en x:2 y:1",lab.getCases()[1][2],av.getCase());
    }

    @Test
    public void testMoveDroiteOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[1][3]);
        av.move("d");
        assertEquals("Devrait se trouver en x:4 y:1",lab.getCases()[1][4],av.getCase());
    }

    @Test
    public void testMoveObstacle(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[0][3]);
        av.move("d");
        assertEquals("Devrait se trouver en x:0 y:3",lab.getCases()[0][3],av.getCase());
    }



}
