import java.io.File;

public class Texto extends Document{
    public Texto(String autor, String nome, String ext) {
        super(autor, nome, ext = String.valueOf(Ext.DOCX));
    }

    @Override
    public void open() {
        System.out.println("A criar ficheiro");
        File file = new File("FactoryMethod_3/src/ficheiroDoc.docx");
        System.out.println("Ficheiro criado");
    }

    @Override
    public void escrever() {

    }

    @Override
    public void close() {

    }
}
