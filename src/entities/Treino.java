package entities;

public class Treino {
    private int id;
    private Aluno aluno;
    private Instrutor instrutor;
    private ArrayList<Exercicio> exes;
    private ArrayList<Float> pesos;

    public Treino(int id, Aluno aluno, Instrutor instrutor, ArrayList<Exercicio> exes, ArrayList<Float> pesos){
        this.aluno = aluno;
        this.instrutor = instrutor;
        this.id = id 
        this.exes = exes;
        this.pesos = pesos;
    }

    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
    public void setInstrutor(Instrutor inst){
        this.instrutor = inst;
    }
    public void setExes(ArrayList<Exercicio> exe){
        exercicios.clear();
        for (Exercicio exec: exe){
            exercicios.add(exec);
        }      
        }
    }
    public void setPesos(ArrayList<Float> wei){
        pesos.clear();
        for (float pes: wei){
            pesos.add(pes);
        }      
    }
    
    //getters
    public int getId(){
        return this.id;
    }
    public Aluno getAluno(){
        return this.aluno;
    }
    public Instrutor getInstrutor(){
        return this.instrutor;
    }
    public ArrayList<Exercicio> getExercicioList(){
        return this.exes;
    }
    public ArrayList<Float> getPesos(){
        return this.pesos;
    }

    @Override
    public String toString(){
        ArrayList<String> array;
        for (i=0; i<exes.size(); i++){
            array.add(exes(i) + ",\n" + pesos(i));
        }
        return ("TREINO: \n
            aluno: " + this.aluno.getNome() + "\n 
            Instrutor: " + this.instrutor.getNome() + "\n
            EXERCICIOS: \n" + array);
    }
}

