package abril.classes.em_andamento;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;
    private int numeroTurma;

    public Turma(int numero){
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
        this.numeroTurma = numero;
    }

    public int getNumero() {
        return this.numeroTurma;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }
}
