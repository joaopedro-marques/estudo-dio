import java.util.ArrayList;

public class Banco {
  private String nome;
  protected ArrayList<Conta> contas;
  

  public Banco() {
    this.nome = "Banco do João";
    this.contas = new ArrayList<Conta>();
  }

  protected String getNome() {
    return nome;
  }

  protected void exibirListaContas(){
    for (Conta conta : contas){
      System.out.println(conta.getNumero());
    }
  }

}
