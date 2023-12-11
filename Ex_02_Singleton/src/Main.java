import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {


        Logger logger = Logger.getInstance("LALALAND\\logger.txt");

        logger.log("mensagem 1");
        logger.log("mensagem 2");
        logger.log("mensagem 3");
        logger.log("mensagem 4");
        logger.log("mensagem 5");
    }
}
