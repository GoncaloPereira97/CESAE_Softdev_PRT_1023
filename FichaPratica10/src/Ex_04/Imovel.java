package Ex_04;

public class Imovel {

    private String rua;

    private int numPorta;
    private String cidade;
    private TipoImovel tipoImovel;

    private TipoAcabamento tipoAcabamento;

    private int area;

    private int numQuartos;
    private int numCasasBanho;
    private int areaPiscina;

    private EstadoImovel estadoImovel;

    public Imovel(String rua, int numPorta, String cidade, TipoImovel tipoImovel, TipoAcabamento tipoAcabamento, int area, int numQuartos, int numCasasBanho, int areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipoImovel = tipoImovel;
        this.tipoAcabamento = tipoAcabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numCasasBanho = numCasasBanho;
        this.areaPiscina = areaPiscina;
        this.estadoImovel = EstadoImovel.VENDA;
    }

    public EstadoImovel getEstadoImovel() {
        return estadoImovel;
    }

    public EstadoImovel imovelVendido() {
        return EstadoImovel.VENDIDO;
    }

    public double valorImovel() {
        double preco;
        if (this.tipoImovel.equals(TipoImovel.APARTAMENTO)) {
            preco = area * 1000;
        } else if (this.tipoImovel.equals(TipoImovel.CASA)) {
            preco = area * 3000;
        } else preco = area * 5000;

        if (this.tipoAcabamento.equals(TipoAcabamento.RESTAURO)) {
            preco = preco / 2;
        } else if (this.tipoAcabamento.equals(TipoAcabamento.USADA)) {
            preco -= preco * 0.10;
        } else if (this.tipoAcabamento.equals(TipoAcabamento.NOVA_COM_ALTO_ACABAMENTO)) {
            preco += preco * 0.25;
        }

        for (int cont = 0; cont < numQuartos; cont++) {
            preco += 7500;
        }
        for (int cont = 0; cont < numCasasBanho; cont++) {
            preco += 10500;
        }

        preco += areaPiscina * 1000;
        return preco;
    }

    public void imprimirDescricao(){
        System.out.println("Rua: "+ this.rua);
        System.out.println("Numero porta: "+  this.numPorta);
        System.out.println("Cidade: " +this.cidade);
        System.out.println("Tipo de imovel: " + this.tipoImovel);
        System.out.println("Tipo de acabamento: " +this.tipoAcabamento);
        System.out.println("Area: " + this.area );
        System.out.println("Numero de quartos: " + this.numQuartos);
        System.out.println("Numero casas de banho: " + this.numCasasBanho);
        System.out.println("Area da piscina: " +this.areaPiscina);
    }

    public Imovel comprarImoveis(Imovel imovel){
        if (this.valorImovel() > imovel.valorImovel()){
            return this;
        } else return imovel;
    }
}
