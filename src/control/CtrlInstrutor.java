package control;

import java.util.ArrayList;
import boundaries.CadInstrutor;
import boundaries.DAOInstrutor;
import entities.Instrutor;

public class CtrlInstrutor {
  public static void cadastrarInstrutor(String nome, String CPF, String horario, int idade){
        try {
            if (DAOInstrutor.existeNome(nome)) {
                CadInstrutor.mostraTela("nome:  " + nome + "já cadastrado.");
            } else {
                Instrutor instrutor = new Instrutor(nome, CPF, horario, idade);
                DAOInstrutor.cadastrarInstrutor(instrutor);
                CadInstrutor.mostraTela(instrutor + "cadastrado.");
            }
        }catch (Exception erro){
            CadInstrutor.mostraTela("ERRO: " + erro);
        }
    }

  public static void removerInstrutor(String nome){
      try {
          if (DAOInstrutor.existeNome(nome)) {
                DAOInstrutor.removeInstrutor(nome);
                CadInstrutor.mostraTela("nome:  " + nome + " removido.");
          } else {
                CadInstrutor.mostraTela(nome + " não cadastrado.");
          }
      }catch (Exception erro){
            CadInstrutor.mostraTela("ERRO: " + erro);
      }
  }

  public static void ListarInstrutor(){
      ArrayList<Instrutor> lista;
      try {
            lista = DAOInstrutor.getList();
            CadInstrutor.mostraDadosLista(lista);
      }catch (Exception erro){
            CadInstrutor.mostraTela("ERRO: " + erro);
      }
  }

  public static void AtualizarInstrutor(String nome){
      Instrutor instrutor1, instrutor2;

      try {
            if (DAOInstrutor.existeNome(nome)) {
                instrutor1 = DAOInstrutor.getInstrutor(nome);
                CadInstrutor.mostraDados(instrutor1);
                instrutor2 = CadInstrutor.atualizaDados();
                DAOInstrutor.atualizaDados(instrutor1, instrutor2);
                CadInstrutor.mostraTela("instrutor atualizado");
            } else {
                CadInstrutor.mostraTela(nome + " não cadastrado.");
            }
        }catch (Exception erro){
            CadInstrutor.mostraTela("ERRO: " + erro);
        }
  }
}
