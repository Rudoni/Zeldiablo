package Tests;

import Game.JeuPerso;
import MoteurJeu.Commande;
import MoteurJeu.Jeu;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeuPersoTest {

    /**
     * Test pour faire evoluer le jeu avec l'aventurier
     */
    @Test
    public void testEvoluerDeplacerAventurier() {
        JeuPerso j = new JeuPerso();
        Commande c = new Commande();
        c.bas = true;
        j.evoluer(c);
        boolean res = j.getLabyrinthe().getCaseAventurier().getX() == 1 && j.getLabyrinthe().getCaseAventurier().getY() == 3;
        assertTrue("Aventurier pas a la bonne case", res);
    }

}