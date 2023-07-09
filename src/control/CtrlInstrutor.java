package control;

import boundaries.CadInstrutor;
import boundaries.DAOInstrutor;
import entities.Instrutor;

public class CtrlInstrutor {
    public static void cadastrarInstrutor(String nome, String CPF, String horario, int idade){
        try {
            if (DAOInstrutor.existeInstrutor(CPF)) {
                CadInstrutor.mostraTela("CPF:  " + CPF + "já cadastrado.");
            } else {
                Instrutor instrutor = new Instrutor(nome, CPF, horario, idade);
                DAOInstrutor.cadastrarInstrutor(instrutor);
                CadInstrutor.mostraTela(instrutor + "cadastrado.");
            }
        }catch (Exception erro){
            CadInstrutor.mostraTela("ERRO: " + erro);
        }
    }

    public static void removerInstrutor(String CPF){
        Instrutor instrutor;
        try {
            if ((instrutor = DAOInstrutor.getInstrutor(CPF)) != null) {
                DAOInstrutor.removeInstrutor(instrutor);
                CadInstrutor.mostraTela("nome:  " + instrutor.getNome() + " removido.");
            } else {
                CadInstrutor.mostraTela(CPF + " não cadastrado.");
            }
        } catch (Exception erro){
            CadInstrutor.mostraTela("ERRO: " + erro);
        }
    }

    public static void ListarInstrutor(){
        try {
            CadInstrutor.mostraDadosLista(DAOInstrutor.getList());
        }catch (Exception erro){
            CadInstrutor.mostraTela("ERRO: " + erro);
        }
    }

    public static void AtualizarInstrutor(String CPF){
        Instrutor velho, novo;

        try {
            if (DAOInstrutor.existeInstrutor(CPF)) {
                velho = DAOInstrutor.getInstrutor(CPF);
                CadInstrutor.mostraDados(velho);
                novo = CadInstrutor.atualizaDados();
                DAOInstrutor.atualizaDados(velho, novo);
                CadInstrutor.mostraTela("instrutor atualizado");
            } else {
                CadInstrutor.mostraTela(CPF + " não cadastrado.");
            }
        }catch (Exception erro){
            CadInstrutor.mostraTela("ERRO: " + erro);
        }
    }
}
