package control;

import java.util.ArrayList;
import boundaries.CadExameFisico;
import boundaries.DAOExameFisico;
import entities.ExameFisico;

public class CtrlExameFisico {
  public static void cadastrarExameFisico(String CPF, String data, float peso, float altura, float imc, float MM, float GD){
        try {
            if(DAOAluno.existeNome(CPF)){
                Aluno aluno = DAOAluno.getAluno(CPF)
                ExameFisico exa = new ExameFisico(aluno, data, peso, altura, imc, MM, GD);
                DAOExameFisico.cadastrarExameFisico(exa);
                CadExameFisico.mostraTela(exa + "cadastrado.");
            }
            else{
                CadExameFisico.mostraTela("aluno não existe");
            }
        }catch (Exception erro){
            CadExameFisico.mostraTela("ERRO: " + erro);
        }
    }

  public static void removerExameFisico(String CPF, String data){
      try {
          if (DAOAluno.existeNome(CPF) && DAOExameFisico.existeNome(CPF, data)) {
                DAOExameFisico.removeExameFisico(CPF, data);
                CadExameFisico.mostraTela("exame removido.");
          } else {
                CadExameFisico.mostraTela("exame não cadastrado.");
          }
      }catch (Exception erro){
            CadExameFisico.mostraTela("ERRO: " + erro);
      }
  }

  public static void ListarExameFisico(){
      ArrayList<ExameFisico> lista;
      try {
            lista = DAOExameFisico.getList();
            CadExameFisico.mostraDadosLista(lista);
      }catch (Exception erro){
            CadExameFisico.mostraTela("ERRO: " + erro);
      }
  }

  public static void AtualizarExameFisico(String CPF, String data){
      ExameFisico exa1, exa2;

      try {
            if (DAOAluno.existeNome(CPF) && DAOExameFisico.existeNome(CPF, data) ) {
                exa1 = DAOExameFisico.getExameFisico(CPF, data);
                CadExameFisico.mostraDados(exa1);
                exa2 = CadExameFisico.atualizaDados(exa1.getAluno());
                DAOExameFisico.atualizaDados(exa1, exa2);
                CadExameFisico.mostraTela("exame atualizado");
            } else {
                CadExameFisico.mostraTela(" exame não cadastrado.");
            }
        }catch (Exception erro){
            CadExameFisico.mostraTela("ERRO: " + erro);
        }
  }
}
