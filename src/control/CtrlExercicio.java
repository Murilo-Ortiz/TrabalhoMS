package control;

import java.util.ArrayList;
import boundaries.CadExercicio;
import boundaries.DAOExercicio;
import entities.Aluno;
import entities.Exercicio;

public class CtrlExercicio {
    public static void cadastrarExercicio(String nome, String maquina){
        try {
            if (DAOExercicio.existeNome(nome)) {
                CadExercicio.mostraTela("exercicio:  " + nome + "já cadastrado.");
            } else {
                Exercicio exe = new Exercicio(nome, maquina);
                DAOExercicio.cadastrarExercicio(exe);
                CadExercicio.mostraTela(exe + "cadastrado.");
            }
        }catch (Exception erro){
            CadExercicio.mostraTela("ERRO: " + erro);
        }
    }

    public static void removerExercicio(String nome){
        try {
            if (DAOExercicio.existeNome(nome)) {
                DAOExercicio.removeExercicio(nome);
                CadExercicio.mostraTela("nome:  " + nome + " removido.");
            } else {
                CadExercicio.mostraTela(nome + " não cadastrado.");
            }
        }catch (Exception erro){
            CadExercicio.mostraTela("ERRO: " + erro);
        }
    }

    public static void ListarExercicio(){
        ArrayList<Exercicio> lista;
        try {
            lista = DAOExercicio.getList();
            CadExercicio.mostraDadosLista(lista);
        }catch (Exception erro){
            CadExercicio.mostraTela("ERRO: " + erro);
        }
    }

    public static void AtualizarExercicio(String nome){
        Exercicio exe1, exe2;

        try {
            if (DAOExercicio.existeNome(nome)) {
                exe1 = DAOExercicio.getExercicio(nome);
                CadExercicio.mostraDados(exe1);
                exe2 = CadExercicio.atualizaDados();
                DAOExercicio.atualizaDados(exe1, exe2);
                CadExercicio.mostraTela("exercicio atualizado");
            } else {
                CadExercicio.mostraTela(nome + " não cadastrado.");
            }
        }catch (Exception erro){
            CadExercicio.mostraTela("ERRO: " + erro);
        }
    }
}
