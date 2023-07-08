package boundaries;

import control.CtrlAluno;

import java.util.Scanner;

public class CadAluno {

    public static void cadastrarAluno(){
        Scanner in = new Scanner(System.in);

        String nome = in.nextLine();
        String CPF = in.nextLine();
        int idade = in.nextInt();

        CtrlAluno.cadastrarAluno(nome, CPF, idade);
    }

    public static void mostraTela(String mensagem){
        System.out.println(mensagem);
    }
}
