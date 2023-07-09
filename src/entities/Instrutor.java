package entities;

public class Instrutor {
    private String nome;
    private String CPF;
    private String horario;
    private int idade;

    public Instrutor(String nome, String CPF, String horario, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.horario = horario;
        this.idade = idade;
    }

    public Instrutor(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", horario='" + horario + '\'' +
                ", idade=" + idade +
                '}';
    }
}
