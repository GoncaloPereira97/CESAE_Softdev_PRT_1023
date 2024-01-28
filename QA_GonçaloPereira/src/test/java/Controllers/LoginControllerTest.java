package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LoginControllerTest {

    LoginController loginController;

    AdministradorController administradorController;

    @BeforeEach
    void setUp() throws IOException {
        String path = "src/test/resources/login_grandesNegocios.csv";
        loginController = new LoginController(path);
        administradorController = new AdministradorController();
    }

    @Test
    void validarLogin() throws IOException {
        String path = "src/test/resources/login_grandesNegocios.csv";
        assertFalse(loginController.validarLogin("ADMIN", "Maluco", "soumanel"));
        administradorController.adicionarUtilizador("ADMIN", "Maluco", "soumanel", path);
        loginController = new LoginController(path);
        assertTrue(loginController.validarLogin("ADMIN", "Maluco", "soumanel"));
    }
}