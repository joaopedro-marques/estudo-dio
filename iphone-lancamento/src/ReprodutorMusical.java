public class ReprodutorMusical extends IPhone{
  String musica;
  int volume = 100;

  @Override
  public String tocar(int dados){
    if (dados> 0 ){
      return "Tocando musica!";
    }
    return "Sem dados!";
  }

  @Override
  public String passarMusica(){
    return "abc";

  }
  @Override
  public int aumentarVolume(){
    this.volume = volume < 100 ?  volume + 6:  100;
    return this.volume;
  }

  @Override
  public int diminuitVolume(){
    return -5;
  }

}
