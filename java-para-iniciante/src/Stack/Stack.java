package Stack;

import java.util.Arrays;

public class Stack {
  private char[] q;
  
  public Stack(int size) {
    this.q =  new char[size];
  }

  public void push(char a){
    for (int i = 0; i< q.length ; i++){
      if(this.q[i] == 0){
        this.q[i] = a;
        break;
      }
    }
  }

  public void pop(){
    char[] arrayTemporario = new char[this.q.length-1];
    for (int i = 1; i<this.q.length; i++){
      if(arrayTemporario.length < i){
        break;
      }
      arrayTemporario[i-1] = this.q[i];
    }
    this.q = arrayTemporario;
  }

  @Override
  public String toString() {
    return "Stack [q=" + Arrays.toString(q) + "]";
  }

  
}
