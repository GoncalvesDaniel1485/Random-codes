import java.util.ArrayList;

public class Banco{
    private ArrayList<Conta> contas;

    public Banco(){
        contas = new ArrayList<>();
    }

      public void adicionarConta(Conta c){
        contas.add(c);
    }

    //método para buscar conta específica. Realiza apenas a busca. Retorna valor null, caso não haja.
    //Mas para imprimir é necessário chamar no main.
    public Conta buscarContaPorNumero(int numero){
        for (Conta c : contas) {
            if (c.getNumeroConta() == numero){
                return c;
            }
        }
        return null; // se não encontrar
    }

    public void mostrarTodasAsContas(){
        for (Conta c : contas){
            System.out.println(c);
            System.out.println("-----------");
        }
    }
}   