package control;

import java.util.ArrayList;
import boundaries.CadTreino;
import boundaries.DAOAluno;
import boundaries.DAOInstrutor;
import boundaries.DAOTreino;
import entities.Aluno;
import entities.Exercicio;
import entities.Instrutor;
import entities.Treino;

public class CtrlTreino {
    public static void cadastrarTreino(String CPF, String nome, ArrayList<Exercicio> exes, ArrayList<Float> pesos){
        try {
            if(DAOAluno.existeAluno(CPF) && DAOInstrutor.existeInstrutor(nome)){
                Aluno aluno = DAOAluno.getAluno(CPF);
                Instrutor instrutor = DAOInstrutor.getInstrutor(nome);
                int id = DAOTreino.getNewId(CPF);
                Treino treino = new Treino(id, aluno, instrutor, exes, pesos);
                DAOTreino.cadastrarTreino(treino);
                CadTreino.mostraTela(treino + "cadastrado\n ID: "+ id);
            }
            else{
                CadTreino.mostraTela("ERRO, DADOS INVALIDOS");
            }
        }catch (Exception erro){
            CadTreino.mostraTela("ERRO: " + erro);
        }
    }

    public static void removerTreino(String CPF, int id){
        try {
            if (DAOTreino.existeTreino(CPF, id) && DAOAluno.existeAluno(CPF)) {
                DAOTreino.removeTreino(CPF, id);
                CadTreino.mostraTela("treino removido.");
            } else {
                CadTreino.mostraTela("dados invalidos");
            }
        }catch (Exception erro){
            CadTreino.mostraTela("ERRO: " + erro);
        }
    }

    public static void ListarTreino(){
        ArrayList<Treino> lista;
        try {
            lista = DAOTreino.getList();
            CadTreino.mostraTreino(lista);
        }catch (Exception erro){
            CadTreino.mostraTela("ERRO: " + erro);
        }
    }

    public static void AtualizarTreino(String CPF, int id){
        Treino t1, t2;

        try {
            if (DAOAluno.existeAluno(CPF) && DAOTreino.existeTreino(CPF, id) ) {
                t1 = DAOTreino.getTreino(CPF, id);
                CadTreino.mostraDados(t1);
                t2 = CadTreino.atualizaDados(t1.getAluno(), t1.getInstrutor(), id);
                DAOTreino.atualizaDados(t1, t2);
                CadTreino.mostraTela("Treino atualizado");
            } else {
                CadTreino.mostraTela("Treino não cadastrado.");
            }
        }catch (Exception erro){
            CadTreino.mostraTela("ERRO: " + erro);
        }
    }
}
