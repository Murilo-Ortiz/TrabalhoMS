package entities;

public class ExameFisico {
    private Aluno aluno;
    private String data;
    private float peso;
    private float altura;
    private float imc;
    private float porcentagemMM;
    private float porcentagemGD;

    public ExameFisico(Aluno aluno, String data, float peso, float altura, float imc, float porcentagemMM, float porcentagemGD;) {
        this.aluno = aluno;
        this.data = data;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.porcentagemMM = porcentagemMM;
        this.porcentagemGD = porcentagemGD;
    }

    //Setters
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setAltura(float altura) {
        this.peso = peso;
    }
    public void setIMC(float imc) {
        this.peso = peso;
    }
    public void setMM(float MM){
        this.porcentagemMM = MM;
    }
    public void setGD(float GD){
        this.porcentagemGD = GD;
    }

    //GETTERS
    public Aluno getAluno(){
        return this.aluno;
    }
    public String getData(){
        return this.data;
    }
    public float getPeso(){
        return this.peso;
    }
    public float getAltura(){
        return this.altura;
    }
    public float getIMC(){
        return this.imc;
    }
    public float getMM(){
        return this.porcentagemMM
    }
    public float getGD(){
        return this.porcentagemGD;
    }

    @Override
    public String toString() {
        return "ExameFisico{" +
                "Aluno='" + this.aluno.toString() + '\'' +
                ", Data='" + this.data + '\'' +
                ", peso='" + this.peso + '\'' +
                ", altura=" + this.altura +
                ", IMC=" + this.imc +
                ", Massa Magra=" + this.porcentagemMM +
                ", Gordura=" + this.porcentagemGD +
                '}';
    }
}