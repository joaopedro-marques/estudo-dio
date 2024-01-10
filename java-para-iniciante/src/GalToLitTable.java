class GalToLitTable {

public static void main(String args[]) {
  double polegadas, metros;
  int counter;
  counter = 0;
  for(polegadas=1;polegadas<=120;polegadas++){
    metros = polegadas * 0.0254; // converte para litros
    System.out.println(polegadas + " polegadas is " +
    metros + " metros.");
    counter++;	 // a cada décima linha, exibe uma linha em branco
    if(counter == 12) { 
      System.out.println(); counter = 0; // zera o contador de linhas
    }
}
}
}
