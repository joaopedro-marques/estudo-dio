package edu.joao.primeirasemana;

public class Operadores {
 public static void main(String[] args) {
  int numero =  5;
  numero = - numero;
  System.out.println(numero);
  numero = --numero ;
  System.out.println(numero);
  numero = ++numero;
  System.out.println(numero);

  int a,b;
  a = 5;
  b = 6;
  String resultado = a == b ? "verdadeiro" : "falso";

  System.out.println(resultado);

  int numero1 = 1;
  int numero2 = 2;

  boolean simNao = numero1 == numero2;

  System.out.println("numero Um é igual a numeroDois? " + simNao);

  simNao = numero1 != numero2;

  System.out.println("numero Um é diferente do numeroDois? " + simNao);

  String nome = "João";
  String sobrenome = "Marques";

  System.out.println("Os textos são semelhantes? " + nome.equals(sobrenome));
 }
}
