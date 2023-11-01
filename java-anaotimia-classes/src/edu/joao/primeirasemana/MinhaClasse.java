package edu.joao.primeirasemana;

public class MinhaClasse {
  public static void main(String[] args) {
    System.out.println( "Olá turma, sejam bem vindos!");
    String primeiroNome = "João Pedro";
    String segundoNome = "Marques Mourão";
    int anoFabricacao = 2023;
    boolean verdadeira = true;

    anoFabricacao = 2012;

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

  }

  public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome + " " + segundoNome;
  }
}