package Tests;

import Entites.Aventurier;
import Game.Labyrinthe;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class LabyrintheTest {

    @Test
    public void testEtreFini() throws IOException {
        Labyrinthe l = new Labyrinthe("Paul", "labyrinthe1");
        l.getAventurier().amuletteRecuperee();
    }

    @Test
    public void testChangerLabyrinthe() throws IOException {
        Labyrinthe l = new Labyrinthe("pol");
        l.changerLabyrinthe(2);
    }

    @Test
    public void testEvoluerAventurier() {
    }

    @Test
    public void testEvoluerMonstres() {
    }

    @Test
    public void testMonstreAttaque() {
    }

    @Test
    public void testAttaquer() {
    }

}