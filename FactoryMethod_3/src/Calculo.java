import java.io.File;

public class Calculo extends Document{


    public Calculo(String autor, String nome, String ext) {
        super(autor, nome, ext = String.valueOf(Ext.XLSX));
    }

    @Override
    public void open() {
        System.out.println("A criar ficheiro");
        File file = new File("FactoryMethod_3/src/ficheiroCalc.xlsx");
        System.out.println("Ficheiro criado");
    }

    @Override
    public void escrever() {

    }

    @Override
    public void close() {

    }
}
