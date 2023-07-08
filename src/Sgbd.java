Import entities.Aluno;
Import entities.Instrutor;
Import entities.ExameFisico;
Import entities.Treino;
Import entities.Exercicio;

public static class Sgbd{
    ArrayList<Aluno> alunos = new ArrayList<Aluno>;
    ArrayList<Instrutor> instrutores = new ArrayList<Instrutor>;
    ArrayList<ExameFisicor> exames = new ArrayList<ExameFisico>;
    ArrayList<Treino> treinos = new ArrayList<Treino>;
    ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>;

    //gravar
    public static void gravar(Aluno aluno){
        alunos.add(aluno);
    }
    public static void gravar(Instrutor instrutor){
        instrutores.add(instrutor);
    }
    public static void gravar(ExameFisico exame){
        exames.add(exame);
    }
    public static void gravar(Treino treino){
        treinos.add(treino);
    }
    public static void gravar(Exercicio exercicio){
        exercicios.add(exercicio);
    }
    //remover
    public static void remover(Aluno aluno){
        alunos.remove(aluno);
    }
    public static void remover(Instrutor instrutor){
        instrutores.remove(instrutor);
    }
    public static void remover(ExameFisico exame){
        exames.remove(exame);
    }
    public static void remover(Treino treino){
        treinos.remove(treino);
    }
    public static void remover(Exercicio exercicio){
        exercicios.remove(exercicio);
    }
    //buscas com retorno
    public static Aluno buscarAluno(String CPF){
        Aluno aluno;
        for(int i=0; i<alunos.size();i++){
            aluno = alunos.get(i);
            if(aluno.getCPF.equals(CPF)){
                return aluno;
            }
        }
        if (i == alunos.size()){
            return new Aluno(-1);
        }
    }
    public static Instrutor buscarInstrutor(String nome){
        Instrutor instrutor;
        for(int i=0; i<instrutores.size();i++){
            instrutor = instrutores.get(i);
            if(instrutor.getNome.equals(nome)){
                return instrutor;
            }
        }
        if (i == instrutores.size()){
            return new Instrutor(-1);
        }
    }
}
