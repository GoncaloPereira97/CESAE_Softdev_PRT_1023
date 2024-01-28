package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioControllerTest {

    FuncionarioController funcionarioController;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        String path = "src/test/resources/minimercado.csv";
        funcionarioController = new FuncionarioController(path);
    }

    @Test
    void addVenda() throws IOException {
        String path = "src/test/resources/minimercado.csv";
        funcionarioController.addVenda("Produtos para Casa", "Fita Cola Preta", 2000, 1, path);
        funcionarioController.addVenda("Alimentacao", "Molho de algas", 1, 60000, path);
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String teste = "";
        String teste2 = "";
        String[] linha = scanner.nextLine().split(";");
        for (int i = 0; scanner.hasNextLine(); i++) {
            linha = scanner.nextLine().split(",");
            if (linha[1].equals("Fita Cola Preta")) {
                teste = linha[1];
            } else if (linha[1].equals("Molho de algas")) {
                teste2 = linha[1];
            }
        }
        assertEquals("Fita Cola Preta", teste);
        assertEquals("Molho de algas", teste2);
    }

    @Test
    void addVendaInvalida() throws IOException {
        String path = "src/test/resources/minimercado.csv";
        assertThrows(IllegalArgumentException.class, () -> {
            funcionarioController.addVenda("Desporto", "Bola", 13,23, path);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            funcionarioController.addVenda("Cozinha", "tacho", 12,23, path);
        });
    }

    @Test
    void consultarStockProduto() throws IOException {
        String path = "src/test/resources/minimercado.csv";
        funcionarioController.addVenda("Produtos para Casa", "Fita Cola Branca", 2000, 1, path);
        funcionarioController.addVenda("Alimentacao", "Molho de caracol", 1, 60000, path);
        funcionarioController = new FuncionarioController(path);
        assertEquals(1199, funcionarioController.consultarStockProduto("Molho de caracol"));
        assertEquals(0, funcionarioController.consultarStockProduto("Fita Cola Branca"));
        assertEquals(0,funcionarioController.consultarStockProduto("PRODUTO QUE NAO EXISTE"));
    }


}