package boundaries;

import entities.Exercicio;
import entities.Sgbd;

import java.util.ArrayList;

public class DAOExercicio {

    public static void cadastrarExercicio(Exercicio exe){
        Sgbd.gravar(exe);
    }

    public static boolean existeNome(String nome){ return Sgbd.buscarExercicio(nome) != null; }

    public static void removeExercicio(String nome){
        Sgbd.removerExercicio(nome);
    }

    public static ArrayList<Exercicio> getList(){ return Sgbd.getExercicios(); }

    public static Exercicio getExercicio(String nome){ return Sgbd.buscarExercicio(nome); }

    public static void atualizaDados(Exercicio exe1, Exercicio exe2) {
        Sgbd.alterar(exe1, exe2);
    }
}
