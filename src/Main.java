import boundaries.CadTreino;
import control.*;

public class Main {
    public static void main(String[] args) {
        CtrlAluno.cadastrarAluno("Jonas","111.111.111-11", 1);
        CtrlAluno.cadastrarAluno("Murilo", "222.222.222-22", 2);
        CtrlAluno.listarAlunos();
        CtrlAluno.AtualizarAluno("222.222.222-22");
        CtrlAluno.listarAlunos();
        CtrlAluno.removerAluno("111.111.111-11");
        CtrlAluno.listarAlunos();
        CtrlAluno.cadastrarAluno("Erick", "444.444.444-44", 4);
        CtrlAluno.listarAlunos();

        CtrlInstrutor.cadastrarInstrutor("Erick", "444.444.444-44", "4:44", 4);
        CtrlInstrutor.cadastrarInstrutor("PedroFT", "555.555.555-55", "5:55", 5);
        CtrlInstrutor.listarInstrutores();
        CtrlInstrutor.AtualizarInstrutor("555.555.555-55");
        CtrlInstrutor.listarInstrutores();
        CtrlInstrutor.removerInstrutor("444.444.444-44");
        CtrlInstrutor.listarInstrutores();
        CtrlInstrutor.cadastrarInstrutor("Jonas", "111.111.111-11", "1:11", 1);
        CtrlInstrutor.listarInstrutores();

        CtrlExercicio.cadastrarExercicio("Voador", "Voador");
        CtrlExercicio.cadastrarExercicio("Voador invertido", "Voador");
        CtrlExercicio.ListarExercicio();
        CtrlExercicio.AtualizarExercicio("Voador");
        CtrlExercicio.ListarExercicio();
        CtrlExercicio.removerExercicio("Voador invertido");
        CtrlExercicio.ListarExercicio();
        CtrlExercicio.cadastrarExercicio("Leg press", "Leg press");
        CtrlExercicio.ListarExercicio();

        CtrlExameFisico.cadastrarExameFisico("444.444.444-44", "4/4/444", (float)44.4, (float)44.4, 1, (float)88.8, (float)44.4);
        CtrlExameFisico.cadastrarExameFisico("444.444.444-44", "4/4/445", (float)44.4, (float)44.4, 1, (float)88.8, (float)44.4);
        CtrlExameFisico.cadastrarExameFisico("222.222.222-22","2/2/222", 22, 22, 1, 44, 22);
        CtrlExameFisico.ListarExameFisico();
        CtrlExameFisico.AtualizarExameFisico("222.222.222-22", "2/2/222");
        CtrlExameFisico.ListarExameFisico();
        CtrlExameFisico.removerExameFisico("444.444.444-44", "4/4/444");
        CtrlExameFisico.ListarExameFisico();
    }
}
