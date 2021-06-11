package Tests;

import Cases.Case;
import Cases.Piege;
import Entites.Aventurier;

import static org.junit.Assert.*;

public class PiegeTest {

    /**
     * Test faire degat
     */
    @org.junit.Test
    public void faireDegat() {
        Piege p = new Piege(1, 1);
        Aventurier a = new Aventurier("Paul");
        p.setPersonnage(a);
        p.faireDegat();
        int res = a.getPv();
        assertEquals("Pas le bon nombre de pv", 19, res);
    }

}