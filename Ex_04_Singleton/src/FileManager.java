import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileManager {

    private ArrayList<File> ficheiros;

    private String caminho;

    private static FileManager instance;

    private FileManager(String caminho) {
        this.caminho = caminho;
        this.ficheiros = new ArrayList<>();
    }

    public static FileManager getInstance(String caminho){
        if (instance == null){
            instance = new FileManager(caminho);
        }
        return instance;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public void criarFicheiro(String caminho) throws FileNotFoundException {
        File ficheiro = new File(this.caminho + caminho);
        PrintWriter printWriter = new PrintWriter(ficheiro);
        printWriter.println("ola");
        printWriter.close();
        ficheiros.add(ficheiro);
    }

    public void apagarFicheiro(File ficheiro){
        ficheiros.remove(ficheiro);
    }
}
