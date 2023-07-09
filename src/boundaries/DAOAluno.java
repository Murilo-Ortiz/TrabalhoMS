package boundaries;

import entities.Aluno;
import entities.Sgbd;

import java.util.ArrayList;

public class DAOAluno {

  public static void cadastrarAluno(Aluno aluno){
    Sgbd.gravar(aluno);
  }

  public static boolean existeNome(String CPF){ return Sgbd.buscarAluno(CPF) != null; }

  public static void removeAluno(String CPF){
    Sgbd.removerAluno(CPF);
  }

  public static ArrayList<Aluno> getList(){ return Sgbd.getAlunosList(); }

  public static Aluno getAluno(String CPF){ return Sgbd.buscarAluno(CPF); }

  public static void atualizaDados(Aluno alun1, Aluno alun2) {
    Sgbd.alterarAluno(alun1, alun2);
  }
}
