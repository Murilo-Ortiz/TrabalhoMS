package boundaries;

import entities.Instrutor;
import entities.Sgbd;

import java.util.ArrayList;

public class DAOInstrutor {
    public static void cadastrarInstrutor(Instrutor instrutor){
        Sgbd.gravar(instrutor);
    }

    public static boolean existeInstrutor(String CPF){
        return Sgbd.buscarInstrutor(CPF) != null;
    }

    public static void removeInstrutor(Instrutor instrutor){
        Sgbd.removerInstrutor(instrutor.getNome());
    }

    public static ArrayList<Instrutor> getList(){
        return Sgbd.getInstrutores();
    }

    public static Instrutor getInstrutor(String CPF){
        return Sgbd.buscarInstrutor(CPF);
    }

    public static void atualizaDados(Instrutor velho, Instrutor novo) {
        Sgbd.alterar(velho, novo);
    }
}
