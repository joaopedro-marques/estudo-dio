public class Main{
  public static void main(String[] args){
    Cliente joao = new Cliente();
    Banco novo = new Banco();
    joao.setNome("João");
    Conta cc = new ContaCorrente(joao, novo);
    Conta poupanca = new ContaPoupanca(joao, novo);
    cc.depositar(100);
    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
    novo.exibirListaContas();
    System.out.println();
  }
}