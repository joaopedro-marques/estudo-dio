public class Telefone extends IPhone{
  final int numero = 31954423;
  String contato;

  @Override
  public boolean ligar(String contato){
    boolean eftuarLigacaoa = contato == this.contato ? true : false;
    return eftuarLigacaoa;
  }
}
