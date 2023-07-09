package control;

import java.util.ArrayList;
import boundaries.CadTreino;
import boundaries.DAOTreino;
import entities.Treino;

public class CtrlTreino {
  public static void cadastrarTreino(String CPF, String nome, ArrayList<Exercicio> exes, ArrayList<int> pesos){
        try {
            if(DAOAluno.existeNome(CPF) && DAOInstrutor.existeNome(nome)){
                Aluno aluno = DAOAluno.getAluno(CPF)
                Instrutor instrutor = DAOInstrutor.getInstrutor(nome);
                id = DAOTreino.getNewId(CPF);
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
          if (DAOTreino.existeTreino(CPF, id) && DAOAluno.existeNome(CPF)) {
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
            CadTreino.mostraDadosLista(lista);
      }catch (Exception erro){
            CadTreino.mostraTela("ERRO: " + erro);
      }
  }

  public static void AtualizarTreino(String CPF, int id){
      Treino t1, t2;

      try {
            if (DAOAluno.existeNome(CPF) && DAOTreino.existeTreino(CPF, id) ) {
                t1 = DAOTreino.getTreino(CPF, id);
                CadTreino.mostraDados(t1);
                t2 = CadTreino.atualizaDados(t1.getAluno());
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
