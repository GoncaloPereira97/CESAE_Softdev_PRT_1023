import java.io.*;

public class Logger {

    private String caminho;

    private static Logger instance;

    private Logger(String caminho) {
        this.caminho = caminho;
    }

    public static Logger getInstance(String caminho){
        if (instance == null){
            instance = new Logger(caminho);
        }

        return instance;
    }

    public void log(String texto) throws IOException {
        FileWriter fout = new FileWriter(this.caminho, true);

        fout.write(texto + "\n");
        fout.close();
    }
}
