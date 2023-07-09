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
    public static void gravar(Aluno aluno){
        alunos.add(aluno);
    }
    public static void gravar(Instrutor instrutor){
        instrutores.add(instrutor);
    }

    //Métodos para remover objetos
    public static void remover(Aluno aluno){
        alunos.remove(aluno);
    }
    public static void remover(Instrutor instrutor){
        instrutores.remove(instrutor);
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
}
