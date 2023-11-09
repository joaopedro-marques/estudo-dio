package edu.joao.primeirasemana.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class HakerRank8 {
  public static void main(String[] args) {
    //English to Spanish Dictionary
    Map<String,String> engliSpanDictionary = new HashMap<String,String>();    
    engliSpanDictionary.put("Monday","Lunes");
    engliSpanDictionary.put("Tuesday","Martes");
    engliSpanDictionary.put("Wednesday","Miercoles");
    engliSpanDictionary.put("Thursday","Jueves");
    engliSpanDictionary.put("Friday","Viernes");
    engliSpanDictionary.put("Saturday","Sábado");
    engliSpanDictionary.put("Sunday","Domingo");

    System.out.println(engliSpanDictionary.get("Monday"));
    System.out.println(engliSpanDictionary.get("Tuesday"));
    System.out.println(engliSpanDictionary.get("Wednesday"));
    System.out.println(engliSpanDictionary.get("Thursday"));
    System.out.println(engliSpanDictionary.get("Friday"));

    System.out.println(engliSpanDictionary.keySet());
    System.out.println(engliSpanDictionary.values());
    System.out.println("The size of our Disctionary is: " + engliSpanDictionary.size());

    //Shopping list
    Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
    //put some stuff in the disctionary
    shoppingList.put("Ham", Boolean.TRUE);
    shoppingList.put("Bread", Boolean.TRUE);
    shoppingList.put("Oreos", Boolean.FALSE);
    shoppingList.put("Sugar", Boolean.FALSE);
    //Retrieve items
    System.out.println(shoppingList.get("Ham"));
    System.out.println(shoppingList.get("Oreos"));
    //remove things
    shoppingList.remove("Oreos");
    //Replace values
    shoppingList.replace("Bread", Boolean.FALSE);
    //Key-value pairs Print Out
    System.out.println(shoppingList.toString());
    shoppingList.clear();
    System.out.println(shoppingList.toString());
    //isEMpty?
    System.out.println(shoppingList.isEmpty());

  }
}
