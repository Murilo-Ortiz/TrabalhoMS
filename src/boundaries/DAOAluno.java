package boundaries;

import entities.Aluno;

public class DAOAluno {

    public static String  verificarAluno(String nome){
        boolean existe = false;
        try{
            if(existe){
                return "Aluno já cadastrado anteriormente.";
            }else{
                return "Aluno cadastrado.";
            }
        }catch (Exception e){
            return "ERRO: "+e;
        }
    }
}
