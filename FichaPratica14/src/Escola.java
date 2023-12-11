import java.util.ArrayList;
import java.util.Scanner;

public class Escola {

    private String nome;

    private String localizacao;

    private int lotacaoMaxima;

    private ArrayList<Professor> professores;

    private ArrayList<Disciplina> disciplinas;

    private ArrayList<Curso> cursos;

    private ArrayList<Aluno> alunos;

    public Escola(String nome, String localizacao, int lotacaoMaxima) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void addProfessor(Professor professor){
        professores.add(professor);
    }
    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void addCurso(Curso curso){
        cursos.add(curso);
    }
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
}
