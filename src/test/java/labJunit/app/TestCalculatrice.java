package labJunit.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalculatrice {

    @Test
    void testSomme() {
        Calculatrice calc = new Calculatrice();
        assertEquals(calc.somme(2,3), 5);
    }

    @Test
    void testProduit() {
        Calculatrice calc = new Calculatrice();
        assertEquals(calc.produit(2,3), 6);
    }
}
