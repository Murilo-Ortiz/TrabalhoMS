package boundaries;

import entities.ExameFisico;
import entities.Sgbd;

import java.util.ArrayList;

public class DAOExameFisico {

    public static void cadastrarExameFisico(ExameFisico exa){
        Sgbd.gravar(exa);
    }

    public static boolean existeNome(String CPF, String data){ return Sgbd.buscarExameFisico(CPF, data) != null; }

    public static void removeExameFisico(String CPF, String data){
        Sgbd.removerExameFisico(CPF, data);
    }

    public static ArrayList<ExameFisico> getList(){ return Sgbd.getExames(); }

    public static ExameFisico getExameFisico(String CPF, String data){ return Sgbd.buscarExameFisico(CPF, data); }

    public static void atualizaDados(ExameFisico velho, ExameFisico novo) {
        Sgbd.alterar(velho, novo);
    }
}
