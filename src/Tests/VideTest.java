package Tests;

import Cases.Vide;
import Entites.Aventurier;
import org.junit.Test;

import static org.junit.Assert.*;

public class VideTest {

    /**
     * Test pour retirer l'amulette de la case
     */
    @Test
    public void retirerAmulette() {
        Vide v = new Vide(1, 1, true, false);
        Aventurier a = new Aventurier("Paul");
        v.setPersonnage(a);
        v.retirerAmulette();
        boolean res = v.getAmulette();
        assertFalse("L'amulette est toujours la", res);
    }


    /**
     * Test pour retirer le coeur de la case
     */
    @Test
    public void retirerCoeur() {
        Vide v = new Vide(1, 1, false, true);
        Aventurier a = new Aventurier("Paul");
        v.setPersonnage(a);
        v.retirerCoeur();
        boolean res = v.isCoeur();
        assertFalse("L'amulette est toujours la", res);
    }
}