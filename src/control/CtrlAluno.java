package control;

import java.util.ArrayList;
import boundaries.CadAluno;
import boundaries.DAOAluno;
import entities.Aluno;

public class CtrlAluno {
  public static void cadastrarAluno(String nome, String CPF, int idade){
        try {
            if (DAOAluno.existeNome(CPF)) {
                CadAluno.mostraTela("CPF:  " + CPF + "já cadastrado.");
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
      try {
          if (DAOAluno.existeNome(CPF)) {
                DAOAluno.removeAluno(CPF);
                CadAluno.mostraTela("CPF:  " +  CPF + " removido.");
          } else {
                CadAluno.mostraTela(CPF + " não cadastrado.");
          }
      }catch (Exception erro){
            CadAluno.mostraTela("ERRO: " + erro);
      }
  }

  public static void ListarAluno(){
      ArrayList<Aluno> lista;
      try {
            lista = DAOAluno.getList();
            CadAluno.mostraDadosLista(lista);
      }catch (Exception erro){
            CadAluno.mostraTela("ERRO: " + erro);
      }
  }

  public static void AtualizarAluno(String CPF){
      Aluno alun1, alun2;

      try {
            if (DAOAluno.existeNome(CPF)) {
                alun1 = DAOAluno.getAluno(CPF);
                CadAluno.mostraDados(alun1);
                alun2 = CadAluno.atualizaDados();
                DAOAluno.atualizaDados(alun1, alun2);
                CadAluno.mostraTela("aluno atualizado");
            } else {
                CadAluno.mostraTela(CPF + " não cadastrado.");
            }
        }catch (Exception erro){
            CadAluno.mostraTela("ERRO: " + erro);
        }
  }
}
