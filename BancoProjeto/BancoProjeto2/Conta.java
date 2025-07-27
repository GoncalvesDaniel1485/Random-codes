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

    public void sacar(double valor) {
    if (valor <= saldo){
        saldo -= valor;
    }else{
        System.out.println("Saque inválido. Saldo insuficiente.");
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
    public int getNumeroConta(){
    return numero_conta;
}
public double getSaldo(){
    return saldo;
}
}