public abstract class Conta implements IConta{

    protected   static int AGENCIA_PADRAO = 1;
    private  static int SEQUENCIAL = 1;

    protected   int agencia;
    protected   int conta;
    protected   double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void despositar(double valor) {

    }

    @Override
    public void transferir(Conta Contadestino, double valor) {

    }
}
