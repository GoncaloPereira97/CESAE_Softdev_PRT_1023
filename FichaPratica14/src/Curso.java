import Enums.AreaFormacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;

    private ArrayList<DisciplinaCurso> disciplinaCurso;

    private boolean longaDuracao;


    public void criarCurso(Escola escola) {
        Scanner input = new Scanner(System.in);
        int duracao;
        String disciplinaEscolhida, professorEscolhido;


        System.out.print("Insira o nome do curso: ");
        this.nome = input.next();
        System.out.print("Insira quantas disciplinas terá o curso: ");
        duracao = input.nextInt();
        this.disciplinaCurso = new ArrayList<>(duracao);

        
        System.out.println("Quais das seguintes disciplinas pretende adicionar ao curso: ");
        for (Disciplina disciplina: escola.getDisciplinas()) {
            System.out.println(disciplina.getNome());
        }
        disciplinaEscolhida = input.next();

        System.out.println("Escolha um dos seguintes professor para lecionar a disciplina: ");
        for (Disciplina disciplina: escola.getDisciplinas()) {
            if (disciplinaEscolhida.equalsIgnoreCase(disciplina.getNome())){
                for (Professor professor: escola.getProfessores()) {
                    if (professor.getAreaFormacao().contains(AreaFormacao.valueOf(disciplinaEscolhida.toUpperCase()))){
                        System.out.println(professor.getNome());
                    }
                }
            }
        }
        professorEscolhido = input.next();

        for (Disciplina disciplina: escola.getDisciplinas()) {
            if (disciplinaEscolhida.equalsIgnoreCase(disciplina.getNome())){
                Disciplina disciplinaFinal = new Disciplina(disciplina.getNome(), disciplina.getArea(), disciplina.getDuracaoHoras());
                for (Professor professor: escola.getProfessores()) {
                    if (professor.getNome().equalsIgnoreCase(professorEscolhido)){
                        DisciplinaCurso disciplinaCurso1 = new DisciplinaCurso(disciplinaFinal, professor);
                        disciplinaCurso.add(disciplinaCurso1);
                    }
                }
            }
        }

        this.longaDuracao = duracao > 100;
    }

}
