package boundaries;

import control.CtrlExameFisico;
import entities.Aluno;
import entities.ExameFisico;

import java.util.Scanner;
import java.util.ArrayList;

public class CadExameFisico {
    public static void cadastrarExameFisico(){
        System.out.println("Cadastrar ");
        Scanner in = new Scanner(System.in);
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        System.out.println("Data: ");
        String data = in.nextLine();
        System.out.println("peso: ");
        float peso = in.nextFloat();
        System.out.println("altura: ");
        float altura = in.nextFloat();
        System.out.println("IMC: ");
        float imc = in.nextFloat();
        System.out.println("porcentagem de massa magra: ");
        float MM = in.nextFloat();
        System.out.println("porcentagem de gordura: ");
        float GD = in.nextFloat();

        CtrlExameFisico.cadastrarExameFisico(CPF, data, peso, altura, imc, MM, GD);
    }

    public static void removerExameFisico(){
        System.out.println("Remover ");
        Scanner in = new Scanner(System.in);
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        System.out.println("Data: ");
        String data = in.nextLine();
        CtrlExameFisico.removerExameFisico(CPF, data);
    }

    public static void mostraTela(String mensagem){
        System.out.println(mensagem);
    }

    public static void mostraDadosLista(ArrayList<ExameFisico> lista){
        System.out.println("LISTA DE EXAMES NO SISTEMA: ");
        for (ExameFisico exa : lista) {
            System.out.println(exa);
        }
    }

    public static void mostraDados(ExameFisico exa){
        System.out.println(exa);
    }

    public static ExameFisico atualizaDados(Aluno aluno){
        System.out.println("Digite os dados: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Data: ");
        String data = in.nextLine();
        System.out.println("peso: ");
        float peso = in.nextFloat();
        System.out.println("altura: ");
        float altura = in.nextFloat();
        System.out.println("IMC: ");
        float imc = in.nextFloat();
        System.out.println("porcentagem de massa magra: ");
        float MM = in.nextFloat();
        System.out.println("porcentagem de gordura: ");
        float GD = in.nextFloat();

        return new ExameFisico(aluno, data, peso, altura, imc, MM, GD);
    }

    public static void atInst(){
        System.out.println("Atualizar ");
        Scanner in = new Scanner(System.in);
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        System.out.println("Data: ");
        String data = in.nextLine();
        CtrlExameFisico.AtualizarExameFisico(CPF, data);
    }

}
