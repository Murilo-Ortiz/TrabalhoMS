package entities;

public class Exercicio {
    private String nome;
    private String maquina;

    public Exercicio(String nome, String maquina){
        this.nome = nome;
        this.maquina = maquina;
    }
    //setters 
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMaquina(String maquina){
        this.maquina = maquina;
    }
    // getters
    public String getNome(){
        return this.nome;
    }
    public String getMaquina(){
        return this.maquina;
    }

    @Override
    public String toString(){
        return("Exercicio:\n nome: " + this.nome +"\n maquina: "+ maquina);
    }

}
