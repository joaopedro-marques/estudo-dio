class Recursion {

  static int multiplicacao(int a, int b){
    if (a == 1){
      return b;
    }
    return multiplicacao( a-1, b) + b;
  }

  static int maximoElementoVetor(int[] a, int tamanho, int indice){
    if(tamanho == 0){
      return a[indice];
    } else{
        if(a[tamanho-1]> a[indice]){
          return maximoElementoVetor( a, tamanho -1, tamanho - 1);

        } else {
          return maximoElementoVetor(a, tamanho -1, indice);
        }

    }
  }
}