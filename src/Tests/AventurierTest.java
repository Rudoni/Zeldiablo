package Tests;

import Entites.Aventurier;
import org.junit.Test;

import static org.junit.Assert.*;

public class AventurierTest {

    /**
     * Test pour subir des degats
     */
    @Test
    public void testSubirDegat() {
        Aventurier a = new Aventurier("paul");
        a.subirDegat(1);
        int res = a.getPv();
        assertEquals("Pas le bon nombre de pvs", 19, res);
    }

    /**
     * Test pour recup l'amulette
     */
    @Test
    public void testAmuletteRecuperee() {
        Aventurier a = new Aventurier("paul");
        a.amuletteRecuperee();
        boolean res = a.getAmulette();
        assertTrue("Amulette non presente", res);
    }

    /**
     * Test pour retirer l'amulette
     */
    @Test
    public void testRetirerAmulette() {
        Aventurier a = new Aventurier("paul");
        a.amuletteRecuperee();
        a.retirerAmulette();
        boolean res = a.getAmulette();
        assertFalse("Amulette presente", res);
    }
}