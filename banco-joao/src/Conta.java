public abstract class Conta extends Banco implements IConta{
  protected static int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;
  protected Banco banco;
  
  
  public Conta(Cliente cliente, Banco banco){
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
    this.banco = banco;
    this.banco.contas.add(this);
  }

  public int getagencia() {
    return agencia;
  }  

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  @Override
  public void sacar(double valor){
    saldo -= valor;
  }

  @Override
  public void depositar(double valor){
    saldo += valor;
  }
  @Override
  public void transferir(double valor, Conta contaDestino){
      this.sacar(valor);
      contaDestino.depositar(valor);
  }

  protected void imprimirInformacoesComuns() {
    System.out.println(String.format("Titular: %s", this.banco.getNome()));
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.numero));
    System.out.println(String.format("Saldo: %2f", this.saldo));
  }
}
