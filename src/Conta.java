public abstract class Conta implements IConta{

    public  int agencia;
    public  int conta;
    public  double saldo;

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
