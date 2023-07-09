package control;

import boundaries.CadAluno;
import boundaries.CadInstrutor;
import boundaries.DAOAluno;
import boundaries.DAOInstrutor;
import entities.Aluno;
import entities.Instrutor;

public class CtrlAluno {
    public static void cadastrarAluno(String nome, String CPF, int idade){
        try {
            if (DAOAluno.existeAluno(CPF)) {
                CadAluno.mostraTela("nome:  " + nome + "já cadastrado.");
            } else {
                Aluno aluno = new Aluno(nome, CPF, idade);
                DAOAluno.cadastrarAluno(aluno);
                CadAluno.mostraTela(aluno + "cadastrado.");
            }
        }catch (Exception erro){
            CadAluno.mostraTela("ERRO: " + erro);
        }
    }

    public static void removerAluno(String CPF){
        Aluno aluno;
        try {
            if ((aluno = DAOAluno.getAluno(CPF)) != null) {
                DAOAluno.removeAluno(aluno);
                CadAluno.mostraTela("nome:  " + aluno.getNome() + " removido.");
            } else {
                CadAluno.mostraTela(CPF + " não cadastrado.");
            }
        } catch (Exception erro){
            CadAluno.mostraTela("ERRO: " + erro);
        }
    }

    public static void ListarAluno(){
        try {
            CadAluno.mostraDadosLista(DAOAluno.getList());
        }catch (Exception erro){
            CadAluno.mostraTela("ERRO: " + erro);
        }
    }

    public static void AtualizarAluno(String CPF){
        Aluno velho, novo;

        try {
            if (DAOAluno.existeAluno(CPF)) {
                velho = DAOAluno.getAluno(CPF);
                CadAluno.mostraDados(velho);
                novo = CadAluno.atualizaDados();
                DAOAluno.atualizaDados(velho, novo);
                CadAluno.mostraTela("instrutor atualizado");
            } else {
                CadAluno.mostraTela(CPF + " não cadastrado.");
            }
        }catch (Exception erro){
            CadAluno.mostraTela("ERRO: " + erro);
        }
    }
}
