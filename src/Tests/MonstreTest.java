package Tests;

import Entites.Monstre;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonstreTest {

    /**
     * Test pour faire subir des degats a un monstre
     */
    @Test
    public void subirDegat() {
        Monstre m = new Monstre(10, 1);
        m.subirDegat(1);
        int res = m.getPv();
        assertEquals("Pas le bon nombre de pvs", 9, res);
    }
}