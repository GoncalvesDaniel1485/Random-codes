public class Banco{
    public static void main(String[] args){
        Cliente c = new Cliente("Roberto", "164.941.844-21");
        Cliente d = new Cliente("Alberto", "194.164.244-81");
        Conta co = new Conta(10, 2468, c);
        Conta cd = new Conta(20, 2500, d);
        
        System.out.println("Teste 1: --------------------------------------------\n");
        co.deposito(50.76);
        System.out.println(co);
        System.out.println(cd); 

        System.out.println("Teste 2: --------------------------------------------\n");
        co.transferir(cd, 608);
        co.sacar(0.76);

        System.out.println(co);
        System.out.println(cd); 

        System.out.println("Teste 3: --------------------------------------------\n");
        cd.transferir(co, 5000);
        System.out.println(co);
        System.out.println(cd); 
        
        
    }   
}