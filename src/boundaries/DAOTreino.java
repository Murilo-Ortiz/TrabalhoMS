package boundaries;

import entities.Treino;
import entities.Sgbd;

import java.util.ArrayList;

public class DAOTreino {

  public static void cadastrarTreino(Treino t){
    Sgbd.gravar(t);
  }

  public static boolean existeTreino(String CPF, int id){ return Sgbd.buscarTreino(CPF, id) != null; }

  public static void removeTreino(String CPF, int id){
    Sgbd.removerTreino(CPF, id);
  }

  public static ArrayList<Treino> getList(){ return Sgbd.getTreinosList(); }

  public static Treino getTreino(String CPF, int id){ return Sgbd.buscarTreino(CPF, id); }

  public static void atualizaDados(Treino t1, Treino t2) {
    Sgbd.alterarTreino(t1, t2);
  }

  public static int getNewId(){
    return Sgbd.getNewId();
  }
}
