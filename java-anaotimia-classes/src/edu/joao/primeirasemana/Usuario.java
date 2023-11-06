package edu.joao.primeirasemana;

public class Usuario {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();
    System.out.println("Tv Ligada? " + smartTv.ligada);
    System.out.println("Canal Atual: " + smartTv.canal);
    System.out.println("volume Atual: " + smartTv.volume);
    smartTv.desligar();
    System.out.println("Tv Ligada? " + smartTv.ligada);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    System.out.println("volume Atual: " + smartTv.volume);

    smartTv.mudarCanal(13);
    System.out.println(" O Canal atual é : " + smartTv.canal);
    
  }
}
