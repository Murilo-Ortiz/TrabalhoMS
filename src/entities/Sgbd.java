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

    //Métodos para retornar a lista completa
    public static ArrayList<Instrutor> getInstrutoresList(){
        return instrutores;
    }

    //Métodos para alterar dados
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
}
