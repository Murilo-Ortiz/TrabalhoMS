package boundaries;

import control.CtrlInstrutor;
import entities.Instrutor;

import java.util.ArrayList;
import java.util.Scanner;

public class CadInstrutor {
    public static void cadastrarInstrutor(){
        System.out.println("Cadastrar ");
        Scanner in = new Scanner(System.in);
        System.out.println("nome:");
        String nome = in.nextLine();
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        System.out.println("horário: ");
        String horario = in.nextLine();
        System.out.println("Idade: ");
        int idade = in.nextInt();

        CtrlInstrutor.cadastrarInstrutor(nome, CPF, horario, idade);
    }

    public static void removerInstrutor(){
        Scanner in = new Scanner(System.in);
        System.out.println("Remover ");
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        CtrlInstrutor.removerInstrutor(CPF);
    }

    public static void mostraTela(String mensagem){
        System.out.println(mensagem);
    }

    public static void mostraDadosLista(ArrayList<Instrutor> lista) {
        System.out.println("Lista de instrutores: ");
        System.out.println(lista);
    }

    public static void mostraDados(Instrutor instrutor) {
        System.out.println(instrutor);
    }

    public static Instrutor atualizaDados() {
        System.out.println("Digite os dados: ");
        Scanner in = new Scanner(System.in);
        System.out.println("nome:");
        String nome = in.nextLine();
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        System.out.println("horário: ");
        String horario = in.nextLine();
        System.out.println("Idade: ");
        int idade = in.nextInt();
        return new Instrutor (nome, CPF, horario, idade);
    }
}
