public class contaBancaria {
    public String cliente;
    public int num_conta;
    public float saldo;
    
    public contaBancaria(String cliente, int num_conta, float saldoInicial) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldoInicial;
    }
    
    public boolean sacar(float valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente!");
            return false;
        }
    }
    
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}