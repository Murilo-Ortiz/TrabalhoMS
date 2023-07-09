package boundaries;

import control.CtrlAluno;
import control.CtrlInstrutor;
import entities.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        System.out.println("Remover ");
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        CtrlAluno.removerAluno(CPF);
    }

    public static void listarAlunos(){
        CtrlAluno.listarAlunos();
    }

    public static void buscarAluno(){
        Scanner in = new Scanner(System.in);
        Aluno aluno;

        System.out.println("Buscar ");
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        if((aluno = CtrlAluno.buscarAluno(CPF)) != null) {
            System.out.println(aluno);
        }else{
            System.out.println(CPF + " não cadastrado.");
        }
    }

    public static void mostraTela(String mensagem){
        System.out.println(mensagem);
    }

    public static void mostraDadosLista(ArrayList<Aluno> lista) {
        System.out.println("Lista de alunos: ");
        System.out.println(lista);
    }

    public static void mostraDados(Aluno aluno) {
        System.out.println(aluno);
    }

    public static Aluno atualizaDados() {
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
}
