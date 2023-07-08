package control;

import boundaries.CadAluno;
import boundaries.DAOAluno;
import entities.Aluno;

public class CtrlAluno {

    public static void cadastrarAluno(String nome, String CPF, int idade){
        try {
            if (DAOAluno.existeCPF(CPF)) {
                CadAluno.mostraTela("CPF " + CPF + "já cadastrado.");
            } else {
                Aluno aluno = new Aluno(nome, CPF, idade);
                DAOAluno.cadastrarAluno(aluno);
                CadAluno.mostraTela(aluno + "cadastrado.");
            }
        }catch (Exception erro){
            CadAluno.mostraTela("ERRO: " + erro);
        }
    }
}
