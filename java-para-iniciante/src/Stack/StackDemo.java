package Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack demonstracao = new Stack(5);

    demonstracao.push('B');
    demonstracao.push('A');
    demonstracao.push('C');
    demonstracao.push('D');
    demonstracao.push('F');

    System.out.println("NOVO ARRAY:");

    System.out.println(demonstracao.toString());

    demonstracao.pop();

    System.out.println("Array removido:");

    System.out.println(demonstracao.toString());
    
  }
}
