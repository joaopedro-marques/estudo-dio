package QuickSorte;
class QSDemo {
   public static void main(String[] args) {
    char[] a = {'a','b','c','q','u','m','j','l','k'};
    System.out.println("Array desordenado:");
    for(int i = 0; i < a.length; i++){
      System.out.println(a[i]);
    }

    System.out.println("----------------------");
    System.out.println("Array ordenado:");
  
    Quicksort.qsort(a);

    for(int i = 0; i < a.length; i++){
      System.out.println(a[i]);
    }
    
  }  
}
