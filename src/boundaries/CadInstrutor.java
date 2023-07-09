package boundaries;

import control.CtrlInstrutor;
import entities.Instrutor;

import java.util.Scanner;
import java.util.ArrayList;

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
        System.out.println("Remover ");
        Scanner in = new Scanner(System.in);
        System.out.println("nome: ");
        String nome = in.nextLine();
        CtrlInstrutor.removerInstrutor(nome);
    }

    public static void mostraTela(String mensagem){
        System.out.println(mensagem);
    }

    public static void mostraDadosLista(ArrayList<Instrutor> lista){
        System.out.println("LISTA DE INSTRUTORES: ");
        for (Instrutor instrutor : lista) {
            System.out.println(instrutor);
        }
    }

    public static void mostraDados(Instrutor instrutor){
      System.out.println(instrutor);
    }

    public static Instrutor atualizaDados(){
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

    public static void atInst(){
        System.out.println("Atualizar ");
        Scanner in = new Scanner(System.in);
        System.out.println("nome: ");
        String nome = in.nextLine();
        CtrlInstrutor.AtualizarInstrutor(nome);
    }
    
    public static void ListaInstrutor(){
        CtrlInstrutor.ListarInstrutor();
    }
}
