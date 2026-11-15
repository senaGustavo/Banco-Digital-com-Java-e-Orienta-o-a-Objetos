public class ContaPoupanca extends  Conta{
    @Override
    public void ImprimirExtrato() {
        System.out.println("Extrato da conta corrente");
        super.ImprimirInformacoesComuns();

    }


}
