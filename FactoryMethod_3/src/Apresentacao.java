import java.io.File;

public class Apresentacao extends Document{

    public Apresentacao(String autor, String nome, String ext) {
        super(autor, nome, ext = String.valueOf(Ext.PPTX));
    }


    @Override
    public void open() {
        System.out.println("A criar ficheiro.");
        File file = new File("FactoryMethod_3/src/ficheiroApre.pptx");
        System.out.println("Ficheiro criado.");
    }

    @Override
    public void escrever() {

    }

    @Override
    public void close() {

    }
}
