public abstract class IPhone {
  int dados;
  boolean rede;
  public String tocar(int dados){
    return "Tocando musica...";
  };

  public String acessarInternet(){
    return "Você abriu a internet";
  }

  public String passarMusica(){
    return "abc";
  }

  public int aumentarVolume(){
    return 6;
  }
  public int diminuitVolume(){
    return -5;
  }

  public boolean ligar(String contato){
    boolean eftuarLigacaoa = true;
    return eftuarLigacaoa;
  }
}
