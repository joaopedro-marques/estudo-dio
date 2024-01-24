public class Chapter5 {
  char[] q;
  int putloc, getloc;
  
  

  Chapter5 (int size){
    q = new char[size];
    putloc = getloc = 0;
  }
 
  public static void main(String[] args) {
    int size = 10;
    int nums[] = {25,85,14,25,61,84,25,35,10,85};
    int t;
  
    for(int a=1; a< size; a++){
      for(int b=size-1; b>=a; b--){
        if(nums [b-1] > nums[b]){
          t = nums [b-1];
          nums[b-1] = nums [b];
          nums[b] = t;
        }
      }
    }

    for (int i = 0; i < nums.length; i++){
      System.out.println(nums[i]);
    }

    //Classificando rarray de strings
    int tamanho = 10;
    String words[] = {"Hoje", "Eu", "Sò", "Quero", "Que", "o", "dia", "termine", "bem", "!"};
    String c;
  
    for(int a=1; a< tamanho; a++){
      for(int b=tamanho-1; b>=a; b--){
        if(words[b-1].length() > words[b].length()){
          c = words[b-1];
          words[b-1] = words[b];
          words[b] = c;
        }
      }
    }

    for (int i = 0; i < words.length; i++){
      System.out.println(words[i]);
    }

    //ilike Java
    String eugosto = "I like Java";
    System.out.println(eugosto.length());
    System.out.println(eugosto.charAt(2));

    //Operdor ternário
    int x = 2;
    int y = x < 0 ? 10 : 20;

    //encontrando méida de valores[]
    double sum = 0;
    double[] media = {1,6,85,6258,3214,25,159,65,352,24};
    for (int i = 1 ; i < media.length; i++){
      sum = media[i] + sum;
      System.out.println(sum);
     }
    System.out.println(sum/media.length);
 
  }

  void put(char ch){
    if(putloc==q.length){
      System.out.println("- Queue is full");
      return;
    }
    q[putloc++] = ch;
  }

  char get(){
    if(getloc == putloc){
      System.out.println(" == Queue is empty. ==");
      return (char) 0;
    }
    return q[getloc++];
  }
}
