package Ex_04;

public class Main {
    public static void main(String[] args) {
        Imovel casa01= new Imovel("LALALA", 423, "Porto", TipoImovel.CASA, TipoAcabamento.NOVA_COM_ALTO_ACABAMENTO, 100, 3, 2, 0);
        Imovel casa02= new Imovel("LALALA", 423, "Porto", TipoImovel.CASA, TipoAcabamento.NOVA_COM_ALTO_ACABAMENTO, 100, 3, 2, 0);

        System.out.println(casa01.valorImovel());
        System.out.println(casa01.getEstadoImovel());
        casa01.imprimirDescricao();

        System.out.println(casa01.imovelVendido());

    }
}
