package labJunit.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompteBancaire {
    @Test
    void testSoldeDebiter() {
        CompteBancaire cb = new CompteBancaire();
        assertEquals(cb.debiterSolde(1300,300), 1000);
    }

    @Test
    void testSoldeDebiterNegatif() {
        CompteBancaire cb = new CompteBancaire();
        assertEquals(cb.debiterSolde(-300,300), -600);
    }

    @Test
    void testSoldeCrediter() {
        CompteBancaire cb = new CompteBancaire();
        assertEquals(cb.crediterSolde(1000,300), 1300);
    }
    @Test
    void testSoldeCrediterNegatif() {
        CompteBancaire cb = new CompteBancaire();
        assertEquals(cb.crediterSolde(-200,300), 100);
    }
}
