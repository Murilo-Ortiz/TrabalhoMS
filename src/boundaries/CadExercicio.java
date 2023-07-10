package boundaries;

import control.CtrlExercicio;
import entities.Exercicio;

import java.util.Scanner;
import java.util.ArrayList;

public class CadExercicio {
    public static void cadastrarExercicio(){
        System.out.println("Cadastrar ");
        Scanner in = new Scanner(System.in);
        System.out.println("nome:");
        String nome = in.nextLine();
        System.out.println("maquina: ");
        String maquina = in.nextLine();

        CtrlExercicio.cadastrarExercicio(nome, maquina);
    }

    public static void removerExercicio(){
        System.out.println("Remover ");
        Scanner in = new Scanner(System.in);
        System.out.println("nome: ");
        String nome = in.nextLine();
        CtrlExercicio.removerExercicio(nome);
    }

    public static void mostraTela(String mensagem){
        System.out.println(mensagem);
    }

    public static void mostraDadosLista(ArrayList<Exercicio> lista){
        System.out.println("LISTA DE Exercicios: ");
        for (Exercicio exe : lista) {
            System.out.println(exe);
        }
    }

    public static void mostraDados(Exercicio exe){
        System.out.println(exe);
    }

    public static Exercicio atualizaDados(){
        System.out.println("Digite os dados: ");
        Scanner in = new Scanner(System.in);
        System.out.println("nome:");
        String nome = in.nextLine();
        System.out.println("maquina: ");
        String maquina = in.nextLine();
        return new Exercicio (nome, maquina);
    }

    public static void atInst(){
        System.out.println("Atualizar ");
        Scanner in = new Scanner(System.in);
        System.out.println("nome: ");
        String nome = in.nextLine();
        CtrlExercicio.AtualizarExercicio(nome);
    }

}
