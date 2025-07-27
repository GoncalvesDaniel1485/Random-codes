public class Conta{
    private int numero_conta;
    private double saldo;
    private Cliente titular;

    public Conta(int numero_conta, double saldo, Cliente titular){
        this.numero_conta = numero_conta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String toString(){
        return String.format("Conta: %d"
        + "\nSaldo: %.2f"
        + "\n%s", numero_conta, saldo, titular);
    }

    public void deposito(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
        if(saldo < 0){
            System.out.println("Saque inválido."); 
            saldo = 0;
        }
    }

    public void transferir(Conta destino, double valor){
        if(saldo >= valor){
        this.saldo -= valor;
        destino.deposito(valor);
    }
    else{
        System.out.println("Valor excede o total da conta. Transferência cancelada.");
        }
}
}