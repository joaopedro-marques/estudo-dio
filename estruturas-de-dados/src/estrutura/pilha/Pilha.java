package estrutura.pilha;
public class Pilha {
  private No refNoEntradaPilha;

  public Pilha(){
    this.refNoEntradaPilha = null;
  }

  public boolean isEmpty(){
    return refNoEntradaPilha == null ? true : false;
  }

  public No top(){
    return refNoEntradaPilha;
  }

  public void push(No novoNo){
    No refAuxiliar = refNoEntradaPilha;
    refNoEntradaPilha = novoNo;
    refNoEntradaPilha.setReNo(refAuxiliar);
  }

  public No pop(){
    if(!this.isEmpty()){
      No noPoped = refNoEntradaPilha;
      refNoEntradaPilha = refNoEntradaPilha.getReNo();
      return noPoped;
    }
    return null;
  }

  @Override
  public String toString() {
    System.out.println("--------------------------\n");
    System.out.println("Pilha\n");
    System.out.println("--------------------------\n");
    return "String";
  }

  
}
