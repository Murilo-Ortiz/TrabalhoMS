import boundaries.CadTreino;
import control.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        CtrlAluno.cadastrarAluno("Jonas","111.111.111-11", 1);
        in.nextLine();
        CtrlAluno.cadastrarAluno("Murilo", "222.222.222-22", 2);
        in.nextLine();
        CtrlAluno.listarAlunos();
        in.nextLine();
        CtrlAluno.AtualizarAluno("222.222.222-22");
        in.nextLine();
        CtrlAluno.listarAlunos();
        in.nextLine();
        CtrlAluno.removerAluno("111.111.111-11");
        in.nextLine();
        CtrlAluno.listarAlunos();
        in.nextLine();
        CtrlAluno.cadastrarAluno("Erick", "444.444.444-44", 4);
        in.nextLine();
        CtrlAluno.listarAlunos();
        in.nextLine();

        CtrlInstrutor.cadastrarInstrutor("Erick", "444.444.444-44", "4:44", 4);
        in.nextLine();
        CtrlInstrutor.cadastrarInstrutor("PedroFT", "555.555.555-55", "5:55", 5);
        in.nextLine();
        CtrlInstrutor.listarInstrutores();
        in.nextLine();
        CtrlInstrutor.AtualizarInstrutor("555.555.555-55");
        in.nextLine();
        CtrlInstrutor.listarInstrutores();
        in.nextLine();
        CtrlInstrutor.removerInstrutor("444.444.444-44");
        in.nextLine();
        CtrlInstrutor.listarInstrutores();
        in.nextLine();
        CtrlInstrutor.cadastrarInstrutor("Jonas", "111.111.111-11", "1:11", 1);
        in.nextLine();
        CtrlInstrutor.listarInstrutores();
        in.nextLine();

        CtrlExercicio.cadastrarExercicio("Voador", "Voador");
        in.nextLine();
        CtrlExercicio.cadastrarExercicio("Voador invertido", "Voador");
        in.nextLine();
        CtrlExercicio.ListarExercicio();
        in.nextLine();
        CtrlExercicio.AtualizarExercicio("Voador");
        in.nextLine();
        CtrlExercicio.ListarExercicio();
        in.nextLine();
        CtrlExercicio.removerExercicio("Voador invertido");
        in.nextLine();
        CtrlExercicio.ListarExercicio();
        in.nextLine();
        CtrlExercicio.cadastrarExercicio("Leg press", "Leg press");
        in.nextLine();
        CtrlExercicio.ListarExercicio();
        in.nextLine();

        CtrlExameFisico.cadastrarExameFisico("444.444.444-44", "4/4/444", (float)44.4, (float)44.4, 1, (float)88.8, (float)44.4);
        in.nextLine();
        CtrlExameFisico.cadastrarExameFisico("444.444.444-44", "4/4/445", (float)44.4, (float)44.4, 1, (float)88.8, (float)44.4);
        in.nextLine();
        CtrlExameFisico.cadastrarExameFisico("222.222.222-22","2/2/222", 22, 22, 1, 44, 22);
        in.nextLine();
        CtrlExameFisico.ListarExameFisico();
        in.nextLine();
        CtrlExameFisico.AtualizarExameFisico("222.222.222-22", "2/2/222");
        in.nextLine();
        CtrlExameFisico.ListarExameFisico();
        in.nextLine();
        CtrlExameFisico.removerExameFisico("444.444.444-44", "4/4/444");
        in.nextLine();
        CtrlExameFisico.ListarExameFisico();
        in.nextLine();
    }
}
