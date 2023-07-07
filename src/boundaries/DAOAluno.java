package boundaries;

import entities.Aluno;

public class DAOAluno {

    public static void verificarAluno(Aluno aluno){
        boolean existe = false;
        try{
            if(existe){
                CadAluno.mostraTelaCadastro("Aluno já cadastrado anteriormente.");
            }else{
                CadAluno.mostraTelaCadastro("Aluno cadastrado.");
            }
        }catch (Exception e){
            CadAluno.mostraTelaCadastro("ERRO: "+e);
        }
    }
}
