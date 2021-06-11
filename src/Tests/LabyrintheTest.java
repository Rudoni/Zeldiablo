package Tests;

import Entites.Aventurier;
import Game.Labyrinthe;
import MoteurJeu.Commande;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class LabyrintheTest {


    @Test
    public void testEtreFini() throws IOException {
        Labyrinthe l = new Labyrinthe("pol");
        l.getAventurier().setAmulette(true);
        l.setCase(l.getCaseArrivee());
        assertEquals("non fini", true, l.etreFini());
    }

    @Test
    public void testChangerLabyrinthe() throws IOException {
        Labyrinthe l = new Labyrinthe("pol");
        l.changerLabyrinthe(2);
    }

    @Test
    public void testEvoluerAventurier() throws IOException {
        Labyrinthe l = new Labyrinthe("pol");
        Commande c = new Commande();
        c.bas = true;
        l.evoluerAventurier(c);
        boolean res = l.getCaseAventurier().getX() == 1 && l.getCaseAventurier().getY() == 3;
        assertTrue("Aventurier pas a la bonne case", res);
    }

    @Test
    public void testMonstreAttaque() {
    }

    @Test
    public void testAttaquer() throws IOException {
    }

}