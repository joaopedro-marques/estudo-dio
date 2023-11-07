package edu.joao.primeirasemana;

import java.util.Scanner;

public class TesteHackerRank {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int qnt;
        double price;
        String name;
        /* Read and save an integer, double, and String to your variables.*/
        System.out.println("Escreva um preço:");
        price = scan.nextDouble();
        System.out.println("Escreva um número: ");
        qnt = scan.nextInt();  
        System.out.println("Escreva um nome: ");      
        name = scan.next();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(qnt + i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(price + d);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println( s + name);

        scan.close();
    }
}