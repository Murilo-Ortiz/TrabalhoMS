package boundaries;

public class DAOInstrutor {

  public static void cadastrarInstrutor(Instrutor instrutor){
    Sgbd.gravar(instrutor);
  }

  public static int existeNome(String nome){
    return Sgbd.existeAluno(nome);
  }

  public static void removeInstrutor(Instrutor instrutor){
    Sgbd.remover(instrutor);
  }

  public static ArrayList<Instrutor> getList(){
    ArrayList<Instrutor> lista;
    lista = Sgbd.getInstrutoresList();
    return lista;
  }
}
