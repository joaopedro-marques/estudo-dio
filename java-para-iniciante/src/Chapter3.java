import java.io.IOException;

public class Chapter3 {
  public static void main(String[] args) throws IOException {
    char input;
    do {
     input = (char) System.in.read();
     if(Character.isLowerCase(input)){
      char converted =  (char) ((char) input - 32) ;
      System.out.println(converted);
    } else {
      char converted = (char) ((char) input + 32);
      System.out.println(converted);
    }
    } while (input != '.');
    
  System.out.println("Você encontrou o caractere especial!");

  // for(int i = 1000; i != 0 ; i--){
  //   if (i %2 == 0) 
  //     System.out.println(i);
  // }
  
}
}
