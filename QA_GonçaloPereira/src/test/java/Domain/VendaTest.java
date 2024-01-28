package Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    Venda venda1;
    Venda venda2;
    @BeforeEach
    void setUp() {
        venda1 = new Venda("Produtos para Casa", "Fita Cola Preta", 2000, 1);
        venda2 = new Venda("Fita", "Fita Cola Branca", 1000, 2);
    }

    @Test
    void getTipoProduto() {
        assertEquals("Produtos para Casa", venda1.getTipoProduto());
        assertEquals("Fita", venda2.getTipoProduto());
    }

    @Test
    void getProduto() {
        assertEquals("Fita Cola Preta", venda1.getProduto());
        assertEquals("Fita Cola Branca", venda2.getProduto());
    }

    @Test
    void getQuantidadeVendida() {
        assertEquals(2000, venda1.getQuantidadeVendida());
        assertEquals(1000, venda2.getQuantidadeVendida());
    }

    @Test
    void getPrecoUnitario() {
        assertEquals(1, venda1.getPrecoUnitario());
        assertEquals(2, venda2.getPrecoUnitario());
    }

}