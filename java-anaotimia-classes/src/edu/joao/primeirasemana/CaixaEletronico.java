package edu.joao.primeirasemana;

public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 18.0;

    if (valorSolicitado < saldo){
      saldo = saldo - valorSolicitado;
      System.out.println("novo saldo:" + saldo);
    } else
      System.out.println("Saldo Insuficiente");

    System.out.println(saldo);
  }
}
