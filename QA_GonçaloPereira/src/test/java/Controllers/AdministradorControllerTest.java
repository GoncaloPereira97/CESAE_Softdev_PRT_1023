package Controllers;

import Domain.Venda;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorControllerTest {

    AdministradorController administradorController;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        administradorController = new AdministradorController();
        Venda venda1 = new Venda("Produtos para Casa", "Fita Cola Preta", 2000, 1);
        Venda venda2 = new Venda("Produtos para Casa", "Fita Cola Preta", 2000, 1);
        Venda venda3 = new Venda("Alimentacao", "Molho de algas", 1, 60000);
        Venda venda4 = new Venda("Higiene", "Gel de Banho Cheira Bem", 3000, 1);
        administradorController.getTodasVendas().add(venda1);
        administradorController.getTodasVendas().add(venda2);
        administradorController.getTodasVendas().add(venda3);
        administradorController.getTodasVendas().add(venda4);
    }

    @Test
    void produtoMaisVendido() {
        assertEquals("Fita Cola Preta", administradorController.produtoMaisVendido().getProduto());
        assertEquals(4000, administradorController.produtoMaisVendido().getQuantidadeVendida());
    }

    @Test
    void produtoQueMaisVendeu() {
        assertEquals("Gel de Banho Cheira Bem", administradorController.produtoQueMaisVendeu().getProduto());
        assertEquals(3000, administradorController.produtoQueMaisVendeu().getQuantidadeVendida());
        assertNotEquals("Fita Cola Preta", administradorController.produtoQueMaisVendeu().getProduto());
    }

    @Test
    void vendaMaisValor() {
        assertEquals("Molho de algas", administradorController.vendaMaisValor().getProduto());
        assertEquals(60000, administradorController.vendaMaisValor().getQuantidadeVendida() * administradorController.vendaMaisValor().getPrecoUnitario());
        assertNotEquals("Gel de Banho Cheira Bem", administradorController.vendaMaisValor().getProduto());
    }

    @Test
    void adicionarUtilizador() throws IOException {
        String path = "src/test/resources/login_grandesNegocios.csv";
        administradorController.adicionarUtilizador("Admin", "VitoCodes", "adoroaminhaturma", path);
        administradorController.adicionarUtilizador("Admin", "Tobias", "macaco", path);
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String teste = "";
        String teste2 = "";
        String[] linha = scanner.nextLine().split(";");
        for (int i = 0; scanner.hasNextLine(); i++) {
            linha = scanner.nextLine().split(";");
            if (linha[1].equals("VitoCodes")) {
                teste = linha[1];
            } else if (linha[1].equals("Tobias")) {
                teste2 = linha[1];
            }
        }
        assertEquals("VitoCodes", teste);
        assertEquals("Tobias", teste2);
    }

    @Test
    void adicionarUtilizadorInvalido() throws IOException {
        String path = "src/test/resources/login_grandesNegocios.csv";
        assertThrows(IllegalArgumentException.class, () -> {
            administradorController.adicionarUtilizador("Manel", "Joaquim", "macaco", path);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            administradorController.adicionarUtilizador("Administrador", "Joaquim", "macaco", path);
        });
    }

    @Test
    void valorVendas() {
        administradorController.getTodasVendas().clear();
        assertTrue(administradorController.getTodasVendas().isEmpty());
        Venda venda1 = new Venda("Produtos para Casa", "Fita Cola Preta", 2000, 1);
        administradorController.getTodasVendas().add(venda1);
        administradorController.getTodasVendas().add(venda1);
        administradorController.getTodasVendas().add(venda1);
        assertEquals(6000, administradorController.valorVendas());
        administradorController.getTodasVendas().add(venda1);
        administradorController.getTodasVendas().add(venda1);
        administradorController.getTodasVendas().add(venda1);
        assertEquals(12000, administradorController.valorVendas());
    }

    @Test
    void mediaVendas() {
        administradorController.getTodasVendas().clear();
        assertTrue(administradorController.getTodasVendas().isEmpty());
        Venda venda1 = new Venda("Produtos para Casa", "Fita Cola Preta", 2000, 1);
        Venda venda2 = new Venda("Produtos para Casa", "Fita Cola Preta", 4000, 1);
        administradorController.getTodasVendas().add(venda1);
        administradorController.getTodasVendas().add(venda1);
        administradorController.getTodasVendas().add(venda1);
        assertEquals(2000, administradorController.mediaVendas());
        administradorController.getTodasVendas().add(venda2);
        administradorController.getTodasVendas().add(venda2);
        administradorController.getTodasVendas().add(venda2);
        assertEquals(3000, administradorController.mediaVendas());

    }

//    @AfterEach
//    void tearDown() throws IOException {
//        String pathOriginal = "src/main/resources/login_grandesNegocios.csv";
//        String pathTeste = "src/test/resources/login_grandesNegocios.csv";
//        File file = new File(pathOriginal);
//        File fileTeste = new File(pathTeste);
//        FileWriter writer = new FileWriter(fileTeste, true);
//        Scanner scanner = new Scanner(file);
//        Scanner scannerTeste = new Scanner(fileTeste);
//        String linha;
//        String linhaTeste;
//
//        while (scannerTeste.hasNextLine()) {
//            if (scanner.hasNextLine()) {
//                linha = scanner.nextLine();
//                linhaTeste = scannerTeste.nextLine();
//                if (!linha.equals(linhaTeste)) {
//                    writer.write("\n" + linha);
//                } else {
//                    writer.flush();
//                }
//            }
//        }
//        writer.close();
//    }
}
