package Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilizadorTest {

    Utilizador utilizador1;

    Utilizador utilizador2;
    @BeforeEach
    void setUp() {
        utilizador1=new Utilizador("FUNC", "VitoCodes", "adoroaminhaturma");
        utilizador2=new Utilizador("ADMIN", "Tobias", "macaco");
    }

    @Test
    void getTipoConta() {
        assertEquals("FUNC", utilizador1.getTipoConta());
        assertEquals("ADMIN", utilizador2.getTipoConta());
    }

    @Test
    void getUsername() {
        assertEquals("VitoCodes", utilizador1.getUsername());
        assertEquals("Tobias", utilizador2.getUsername());
    }

    @Test
    void getPassword() {
        assertEquals("adoroaminhaturma", utilizador1.getPassword());
        assertEquals("macaco", utilizador2.getPassword());
    }
}