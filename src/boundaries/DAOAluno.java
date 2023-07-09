package boundaries;

import entities.Aluno;
import entities.Sgbd;

import java.util.ArrayList;

public class DAOAluno {
    public static void cadastrarAluno(Aluno aluno){
        Sgbd.gravar(aluno);
    }

    public static boolean existeAluno(String CPF){
        return Sgbd.buscarAluno(CPF) != null;
    }

    public static void removeAluno(Aluno aluno){
        Sgbd.remover(aluno);
    }

    public static ArrayList<Aluno> getList(){
        return Sgbd.getAlunos();
    }

    public static Aluno getAluno(String CPF){
        return Sgbd.buscarAluno(CPF);
    }

    public static void atualizaDados(Aluno velho, Aluno novo) {
        Sgbd.alterar(velho, novo);
    }
}
