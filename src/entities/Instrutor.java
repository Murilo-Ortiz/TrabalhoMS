package entities;

public class Instrutor {
    private String nome;
    private String CPF;
    private String horario;
    private int idade;

    //Construtor

    public Instrutor(String nome, String CPF, String horario, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.horario = horario;
        this.idade = idade;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Getters

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getHorario() {
        return horario;
    }

    public int getIdade() {
        return idade;
    }

    //toString

    @Override
    public String toString() {
        return "Isntrutor{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", horario='" + horario + '\'' +
                ", idade=" + idade +
                '}';
    }
}
