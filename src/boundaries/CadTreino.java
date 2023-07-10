package boundaries;

import control.CtrlExercicio;
import control.CtrlTreino;
import entities.Aluno;
import entities.Exercicio;
import entities.Instrutor;
import entities.Treino;

import java.util.Scanner;
import java.util.ArrayList;

public class CadTreino {
    public static void cadastrarTreino(){
        System.out.println("Cadastrar ");
        Scanner in = new Scanner(System.in);
        System.out.println("CPF DO ALUNO: ");
        String CPF = in.nextLine();
        System.out.println("NOME DO INSTRUTOR: ");
        String nome = in.nextLine();
        CtrlExercicio.ListarExercicio();
        String saida;
        ArrayList<Exercicio> exes = null;
        ArrayList<Float> pesos = null;
        do{
            System.out.println("insira o nome do exercicio a ser adicionado: ");
            String exer = in.nextLine();
            if(DAOExercicio.existeNome(exer)){
                exes.add(DAOExercicio.getExercicio(exer));
                System.out.println("insira o PESO: ");
                float peso = in.nextFloat();
                pesos.add(peso);
            }
            else{
                System.out.println("nome invalido");
            }
            System.out.println("DESEJA PARAR? (SIM/NAO): ");
            saida = in.nextLine();
        }while(!(saida.equals("SIM")));

        CtrlTreino.cadastrarTreino(CPF, nome, exes, pesos);
    }

    public static void removerTreino(){
        System.out.println("Remover ");
        Scanner in = new Scanner(System.in);
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        System.out.println("ID DO TREINO: ");
        int id = in.nextInt();
        CtrlTreino.removerTreino(CPF, id);
    }

    public static void mostraTela(String mensagem){
        System.out.println(mensagem);
    }

    public static void mostraTreino(ArrayList<Treino> lista){
        System.out.println("LISTA DE Treinos NO SISTEMA: ");
        for (Treino exa : lista) {
            System.out.println(exa);
        }
    }

    public static void mostraDados(Treino exa){
        System.out.println(exa);
    }

    public static Treino atualizaDados(Aluno aluno, Instrutor instrutor, int id){
        System.out.println("Digite os dados: ");
        Scanner in = new Scanner(System.in);
        String saida;
        ArrayList<Exercicio> exes = null;
        ArrayList<Float> pesos = null;
        do{
            System.out.println("insira o nome do exercicio: ");
            String exer = in.nextLine();
            if(DAOExercicio.existeNome(exer)){
                exes.add(DAOExercicio.getExercicio(exer));
                System.out.println("insira o PESO: ");
                float peso = in.nextFloat();
                pesos.add(peso);
            }
            else{
                System.out.println("nome invalido");
            }
            System.out.println("DESEJA PARAR? (SIM/NAO): ");
            saida = in.nextLine();
        }while(!(saida.equals("SIM")));

        return new Treino(id, aluno, instrutor, exes, pesos);
    }

    public static void atInst(){
        System.out.println("Atualizar ");
        Scanner in = new Scanner(System.in);
        System.out.println("CPF: ");
        String CPF = in.nextLine();
        System.out.println("id: ");
        int id = in.nextInt();
        CtrlTreino.AtualizarTreino(CPF, id);
    }

}
