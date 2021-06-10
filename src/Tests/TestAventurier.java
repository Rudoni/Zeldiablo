/*
package Tests;

import Entites.Aventurier;
import Game.*;
import org.junit.jupiter.api.Test;

public class TestAventurier {
    private Labyrinthe lab = new Labyrinthe("Testeur","Test");

    @Test
    public void testMoveHautOK(){
        lab.deplacer("z");
        assertEquals("Devrait se trouver en x:2 y:1",lab.getCases()[1][2],lab.getCaseAventurier());
    }

    @Test
    public void testMoveBasOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[2][2]);
        av.move("s",lab);
        assertEquals("Devrait se trouver en x:2 y:3",lab.getCases()[3][2],av.getCase());
    }

    @Test
    public void testMoveGaucheOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[2][2]);
        av.move("q",lab);
        assertEquals("Devrait se trouver en x:1 y:2",lab.getCases()[2][1],av.getCase());
    }

    @Test
    public void testMoveDroiteOK(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[2][2]);
        av.move("d",lab);
        assertEquals("Devrait se trouver en x:3 y:2",lab.getCases()[2][3],av.getCase());
    }

    @Test
    public void testMoveObstacle(){
        Aventurier av = new Aventurier("denis",100,lab,lab.getCases()[1][3]);
        av.move("d",lab);
        assertEquals("Devrait se trouver en x:3 y:1",lab.getCases()[1][3],av.getCase());
    }
}
*/

