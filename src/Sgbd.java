package entities;
import java.util.ArrayList;

public class Sgbd{
    //Arrays List para simular banco de dados
    static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    static ArrayList<Instrutor> instrutores = new ArrayList<Instrutor>();
    static ArrayList<ExameFisico> exames = new ArrayList<ExameFisico>();
    static ArrayList<Treino> treinos = new ArrayList<Treino>();
    static ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();

    //Métodos para gravar objetos
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

    //Métodos para remover objetos
    public static void removerAluno(String CPF){
        Aluno alun;
        for(int i=0; i<alunos.size();i++){
            alun = alunos.get(i);
            if(alun.getCPF().equals(CPF)){
                alunos.remove(i);
    }

    public static void removerInstrutor(String nome){
        Instrutor instr;
        for(int i=0; i<instrutores.size();i++){
            instr = instrutores.get(i);
            if(instr.getNome().equals(nome)){
                instrutores.remove(i);
    }

    public static void removerExameFisico(String CPF, String data){
        ExameFisico exame;
        for(int i=0; i<exames.size();i++){
            exame = exames.get(i);
            if(exame.getData().equals(data) && exame.getAluno().getCPF().equals(CPF)){
                exames.remove(i);
            }
        }
    }

    public static void removerTreino(String CPF, int id){
        Treino t;
        for(int i=0; i<treinos.size();i++){
            t = treinos.get(i);
            if(t.getId()== id && t.getAluno().getCPF().equals(CPF)){
                treinos.remove(i);
            }
        }
    }

    public static void removerExercicio(String nome){
        Exercicio exe;
        for(int i=0; i<exercicios.size();i++){
            exe = exercicios.get(i);
            if(exe.getNome().equals(nome)){
                exercicios.remove(i);
    }


    //Métodos para buscar objetos
    public static Aluno buscarAluno(String CPF){
        for (Aluno aluno : alunos) {
            if (aluno.getCPF().equals(CPF)) {
                return aluno;
            }
        }
        return null;
    }

    public static Instrutor buscarInstrutor(String nome){
        for (Instrutor instrutor : instrutores) {
            if (instrutor.getNome().equals(nome)) {
                return instrutor;
            }
        }
        return null;
    }

    public static Exercicio buscarExercicio(String nome){
        for (Exercicio exe : exercicios) {
            if (exe.getNome().equals(nome)) {
                return exe;
            }
        }
        return null;
    }

    public static Treino buscarTreino(String CPF, int id){
        for(Treino t : treinos){
          if (t.getId()== id && t.getAluno().getCPF().equals(CPF)){
            return t;
          }  
        }
        return null;
    }

    public static ExameFisico buscarExameFisico(String CPF, String data){
        for (ExameFisico exa : exames) {
            if (exame.getData().equals(data) && exame.getAluno().getCPF().equals(CPF)) {
                return exa;
            }
        }
        return null;
    }

    //Métodos para retornar a lista completa
    public static ArrayList<Aluno> getAlunosList(){
        return alunos;
    }
    public static ArrayList<Instrutor> getInstrutoresList(){
        return instrutores;
    }
    public static ArrayList<Exercicio> getExerciciosList(){
        return exercicios;
    }
    public static ArrayList<ExameFisico> getExamesFisicosList(){
        return exames;
    }
    public static ArrayList<Treino> getTreinosList(){
        return treinos;
    }

    //Métodos para alterar dados
    public static void alterarAluno(Aluno alun1, Aluno alun2){
        for (Aluno alun : alunos) {
            if (alun.getNome().equals(alun1.getNome())) {
                alun.setCPF(alun2.getCPF());
                alun.setNome(alun2.getNome());
                alun.setIdade(alun2.getIdade());
            }
        }
    }
    public static void alterarInstrutor(Instrutor instrutor1, Instrutor instrutor2){
        for (Instrutor instrutor : instrutores) {
            if (instrutor.getNome().equals(instrutor1.getNome())) {
                instrutor.setCPF(instrutor2.getCPF());
                instrutor.setHorario(instrutor2.getHorario());
                instrutor.setNome(instrutor2.getNome());
                instrutor.setIdade(instrutor2.getIdade());
            }
        }
    }
    public static void alterarExercicio(Exercicio exe1, Exercicio exe2){
        for (Exercicio exe : exercicios) {
            if (exe.getNome().equals(exe1.getNome())) {
                exe.setNome(exe2.getNome());
                exe.setMaquina(exe2.getMaquina());
            }
        }
    }
    public static void alterarTreino(Treino t1, Treino t2){
        for (Treino t: treinos){
            if(t.getId()== t1.getId() && t.getAluno().getCPF().equals(t1.getAluno().getCPF())){
                t.setExes(t2.getExerciciosList());
                t.setPesos(t2.getPesos());
            }
        }
    }
    public static void alterarExameFisico(ExameFisico exe1, ExameFisico exe2){
        for (ExameFisico exa : exames) {
            if (exame.getData().equals(data) && exame.getAluno().getCPF().equals(CPF)) {
                exa.setAltura(exa2.getNome());
                exa.setData(exa2.getData());
                exa.setGD(exa2.getGD());
                exa.setMM(exa2.getMM());
                exa.setIMC(exa2.getIMC());
                exa.setPeso(exa2.getPeso());
            }
        }
    }

    //new id for treino
    public static int getNewId(){
        sup = treinos.get(treinos.size()).getId();
        return sup+=1;
        }
    }

