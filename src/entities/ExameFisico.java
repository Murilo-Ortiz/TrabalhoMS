package entities;

public class ExameFisico {
    private Aluno aluno;
    private String data;
    private float peso;
    private float altura;
    private float IMC;
    private float massaMagra;
    private float massaGorda;

    public ExameFisico(Aluno aluno, String data, float peso, float altura, float IMC, float massaMagra, float massaGorda) {
        this.aluno = aluno;
        this.data = data;
        this.peso = peso;
        this.altura = altura;
        this.IMC = IMC;
        this.massaMagra = massaMagra;
        this.massaGorda = massaGorda;
    }

    public ExameFisico(){

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public float getMassaMagra() {
        return massaMagra;
    }

    public void setMassaMagra(float massaMagra) {
        this.massaMagra = massaMagra;
    }

    public float getMassaGorda() {
        return massaGorda;
    }

    public void setMassaGorda(float massaGorda) {
        this.massaGorda = massaGorda;
    }

    @Override
    public String toString() {
        return "ExameFisico{" +
                "aluno=" + aluno +
                ", data='" + data + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", IMC=" + IMC +
                ", massaMagra=" + massaMagra +
                ", massaGorda=" + massaGorda +
                '}';
    }


}
