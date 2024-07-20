class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double limite) {
        super(titular);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            // Aqui, você deve adicionar lógica para atualizar o saldo
            System.out.println("Saque de " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
