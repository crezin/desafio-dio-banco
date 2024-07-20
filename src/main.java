public class main {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente("Alice", 500);
        Conta conta2 = new ContaPoupanca("Bob");

        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.transferir(300, conta2);
    }
}
