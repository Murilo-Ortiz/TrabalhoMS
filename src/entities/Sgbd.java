package entities;

import java.util.ArrayList;

public class Sgbd {
    //Utilizando ArrayLists para simular sgbd
    static ArrayList<Aluno> alunos = new ArrayList<>();
    static ArrayList<Instrutor> instrutores = new ArrayList<>();
    static ArrayList<ExameFisico> exames = new ArrayList<>();
    static ArrayList<Treino> treinos = new ArrayList<>();
    static ArrayList<Exercicio> exercicios = new ArrayList<>();

    //Getters


    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public static ArrayList<Instrutor> getInstrutores() {
        return instrutores;
    }

    public static ArrayList<ExameFisico> getExames() {
        return exames;
    }

    public static ArrayList<Treino> getTreinos() {
        return treinos;
    }

    public static ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    //Métodos para gravar objetos
    public static void gravar(Aluno aluno){ alunos.add(aluno); }
    public static void gravar(Instrutor instrutor){
        instrutores.add(instrutor);
    }
    public static void gravar(ExameFisico exame){ exames.add(exame); }

    //Métodos para remover objetos
    public static void removerAluno(String CPF) {
        Aluno alun;
        for (int i = 0; i < alunos.size(); i++) {
            alun = alunos.get(i);
            if (alun.getCPF().equals(CPF)) {
                alunos.remove(i);
            }
        }
    }

    public static void removerInstrutor(String nome) {
        Instrutor instr;
        for (int i = 0; i < instrutores.size(); i++) {
            instr = instrutores.get(i);
            if (instr.getNome().equals(nome)) {
                instrutores.remove(i);
            }
        }
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

    //Métodos para buscar objetos
    public static Aluno buscarAluno(String CPF){
        for(Aluno aluno : alunos){
            if(aluno.getCPF().equals(CPF)){
                return aluno;
            }
        }
        return null;
    }

    public static Instrutor buscarInstrutor(String CPF){
        for(Instrutor instrutor : instrutores){
            if(instrutor.getCPF().equals(CPF)){
                return instrutor;
            }
        }
        return null;
    }

    public static ExameFisico buscarExameFisico(String CPF, String data){
        for(ExameFisico exame : exames){
            if(exame.getAluno().getCPF().equals(CPF) && exame.getData().equals(data)){
                return exame;
            }
        }
        return null;
    }

    //Métodos para alterar
    public static void alterar(Instrutor velho, Instrutor novo){
        for (Instrutor instrutor : instrutores){
            if(instrutor.getCPF().equals(velho.getCPF())){
                instrutor.setNome(novo.getNome());
                instrutor.setCPF(novo.getCPF());
                instrutor.setHorario(novo.getHorario());
                instrutor.setIdade(novo.getIdade());
            }
        }
    }

    public static void alterar(Aluno velho, Aluno novo){
        for (Aluno aluno : alunos){
            if(aluno.getCPF().equals(velho.getCPF())){
                aluno.setNome(novo.getNome());
                aluno.setCPF(novo.getCPF());
                aluno.setIdade(novo.getIdade());
            }
        }
    }

    public static void alterar(ExameFisico velho, ExameFisico novo){
        for (ExameFisico exame : exames) {
            if (exame.getData().equals(velho.getData()) && exame.getAluno().getCPF().equals(velho.getAluno().getCPF())) {
                exame.setAltura(novo.getAltura());
                exame.setData(novo.getData());
                exame.setMassaGorda(novo.getMassaGorda());
                exame.setMassaMagra(novo.getMassaMagra());
                exame.setIMC(novo.getIMC());
                exame.setPeso(novo.getPeso());
            }
        }
    }
}
