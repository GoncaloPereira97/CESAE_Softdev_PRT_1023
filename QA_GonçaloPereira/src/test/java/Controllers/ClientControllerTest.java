package Controllers;

import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ClientControllerTest {

    ClientController clientController;
    @BeforeEach
    void setUp() throws FileNotFoundException {
        clientController = new ClientController();
        clientController.getTodasVendas().clear();
        Venda venda1 = new Venda("Produtos para Casa", "Fita Cola Preta", 2000, 1);
        Venda venda2 = new Venda("Produtos para Casa", "Fita Cola Preta", 2000, 1);
        Venda venda3 = new Venda("Alimentacao", "Molho de algas", 1, 60000);
        Venda venda4 = new Venda("Higiene", "Gel de Banho Cheira Bem", 3000, 0.01);
        clientController.getTodasVendas().add(venda1);
        clientController.getTodasVendas().add(venda2);
        clientController.getTodasVendas().add(venda3);
        clientController.getTodasVendas().add(venda4);
    }

    @Test
    void produtoMaisCaro() {
        assertEquals("Molho de algas", clientController.produtoMaisCaro().getProduto());
        assertEquals(60000, clientController.produtoMaisCaro().getPrecoUnitario());
        assertNotEquals("Fita Cola Preta", clientController.produtoMaisCaro().getProduto());
    }

    @Test
    void produtosDisponiveisSemDuplicados() {
        assertEquals(3, clientController.produtosDisponiveisSemDuplicados().size());
        assertEquals("Fita Cola Preta", clientController.produtosDisponiveisSemDuplicados().get(0).getProduto());
        assertEquals("Molho de algas", clientController.produtosDisponiveisSemDuplicados().get(1).getProduto());
        assertEquals("Gel de Banho Cheira Bem", clientController.produtosDisponiveisSemDuplicados().get(2).getProduto());
    }

    @Test
    void produtosDeCategoria() {
        assertEquals("Fita Cola Preta", clientController.produtosDeCategoria("Produtos para Casa").get(0).getProduto());
        assertEquals("Molho de algas", clientController.produtosDeCategoria("Alimentacao").get(0).getProduto());
        assertNotEquals("Fita Cola Preta", clientController.produtosDeCategoria("Alimentacao").get(0).getProduto());
    }

    @Test
    void produtoMaisBarato() {
        assertEquals("Gel de Banho Cheira Bem", clientController.produtoMaisBarato().getProduto());
        assertEquals(0.01, clientController.produtoMaisBarato().getPrecoUnitario());
        assertNotEquals("Molho de algas", clientController.produtoMaisBarato().getProduto());
    }
}