package boundaries;

import control.CtrlAluno;
import entities.Aluno;

import java.util.Scanner;
import java.util.ArrayList;

public class CadAluno {
    public static void cadastrarAluno(){
        System.out.println("Cadastrar ");
        Scanner in = new Scanner(System.in);
        System.out.println("nome:");
        String nome = in.nextLine();
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        System.out.println("Idade: ");
        int idade = in.nextInt();

        CtrlAluno.cadastrarAluno(nome, CPF, idade);
    }

    public static void removerAluno(){
        System.out.println("Remover ");
        Scanner in = new Scanner(System.in);
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        CtrlAluno.removerAluno(CPF);
    }

    public static void mostraTela(String mensagem){
        System.out.println(mensagem);
    }

    public static void mostraDadosLista(ArrayList<Aluno> lista){
        System.out.println("LISTA DE ALUNOS: ");
        for (Aluno aluno : lista) {
            System.out.println(aluno);
        }
    }

    public static void mostraDados(Aluno aluno){
      System.out.println(aluno);
    }

    public static Aluno atualizaDados(){
      System.out.println("Digite os dados: ");
      Scanner in = new Scanner(System.in);
      System.out.println("nome:");
      String nome = in.nextLine();
      System.out.println("CPF: ");
      String CPF = in.nextLine();
      System.out.println("Idade: ");
      int idade = in.nextInt();
      return new Aluno (nome, CPF, idade);
    }

    public static void atInst(){
        System.out.println("Atualizar ");
        Scanner in = new Scanner(System.in);
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        CtrlAluno.AtualizarAluno(CPF);
    }
    
    public static void ListaAluno(){
        CtrlAluno.ListarAluno();
    }
}
