package boundaries;

import entities.Instrutor;
import entities.Sgbd;

import java.util.ArrayList;

public class DAOInstrutor {

  public static void cadastrarInstrutor(Instrutor instrutor){
    Sgbd.gravar(instrutor);
  }

  public static boolean existeNome(String nome){ return Sgbd.buscarInstrutor(nome) != null; }

  public static void removeInstrutor(Instrutor instrutor){
    Sgbd.remover(instrutor);
  }

  public static ArrayList<Instrutor> getList(){ return Sgbd.getInstrutoresList(); }

  public static Instrutor getInstrutor(String nome){ return Sgbd.buscarInstrutor(nome); }

  public static void atualizaDados(Instrutor instrutor1, Instrutor instrutor2) {
    Sgbd.alterarInstrutor(instrutor1, instrutor2);
  }
}
