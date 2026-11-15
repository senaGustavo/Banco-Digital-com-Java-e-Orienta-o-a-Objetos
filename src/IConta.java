public interface IConta {

    void sacar(double valor);

    void despositar(double valor);

    void  transferir(Conta Contadestino,double valor);
}
