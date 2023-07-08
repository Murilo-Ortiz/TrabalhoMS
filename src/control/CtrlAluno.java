package control;

import boundaries.DAOAluno;
import entities.Aluno;

public class CtrlAluno {
    public static void cadAluno(String nome, String CPF, int idade){
        Aluno novoAluno = new Aluno(nome, CPF, idade);
        DAOAluno.verificarAluno(novoAluno.getNome());
    }
}
