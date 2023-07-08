package boundaries;

import java.util.Scanner;

public class CadExameFisico {

    public static void mostraTelaCadastro(){
        Scanner in = new Scanner(System.in);

        String nome = in.nextLine();
        DAOAluno.verificarAluno(nome);
    }
}
