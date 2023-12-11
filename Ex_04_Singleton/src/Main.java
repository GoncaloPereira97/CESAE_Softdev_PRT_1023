import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        FileManager fileManager = FileManager.getInstance("ola\\");

        fileManager.criarFicheiro("file.txt");

    }
}
