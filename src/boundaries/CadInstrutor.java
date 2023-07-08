package boundaries;

import control.CtrlInstrutor;
import java.util.Scanner;
import java.util.ArrayList;

public class CadInstrutor {
    public static void cadastrarInstrutor(){
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

    public static void mostraTela(String mensagem){
        System.out.println(mensagem);
    }

    public static void mostraDadosLista(Array<Instrutor> lista){
        System.out.println("LISTA DE INSTRUTORES: ");
        for (int i=0; i<lista.size(); i++){
          System.out.println(lista.get(i);
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
  
}
