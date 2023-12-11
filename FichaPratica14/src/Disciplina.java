import Enums.AreaFormacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
    private String nome;

    private AreaFormacao area;

    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao area, int duracaoHoras) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }

    public Disciplina() {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o nome da disciplina: ") ;
        this.nome = input.next();
        System.out.println("Insira a area de formacao da disciplina:  INFORMATICA, ECONOMIA, CONTABILIDADE, MEDICINA.");
        this.area = AreaFormacao.valueOf(input.next().toUpperCase());
        System.out.print("Insira a duracao da disciplina: ");
        this.duracaoHoras = input.nextInt();
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public AreaFormacao getArea() {
        return area;
    }

    public String getNome() {
        return nome;
    }
}
