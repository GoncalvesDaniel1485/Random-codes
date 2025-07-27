public class Sistema {
    public static void main(String[] args) {
        Cliente c = new Cliente("Gonho", "102.192.199-52");
        Cliente cd = new Cliente("Iago", "130.142.456-22");
        Cliente ce = new Cliente("Pedro", "120.910.183-21");
        Conta c1 = new Conta(1, 2000, c);
        Conta c2 = new Conta(2, 3000, cd);
         Conta c3 = new Conta(3, 5000, ce);
        Banco b = new Banco();
        
        //Adicionar contas
        b.adicionarConta(c1); b.adicionarConta(c2); b.adicionarConta(c3);

        //mostrar conta específica
        //É necessário declarar uma variável para poder imprimir.
        Conta conta = b.buscarContaPorNumero(1);
        if(conta != null){
            System.out.println(conta);
        }else{
            System.out.println("Conta não existe");
        }
        System.out.println("\nMostrar todas as contas");
    
    
        b.mostrarTodasAsContas();
}
    
    }