package Fila;

public class Fila {
  private No refNoEntradaFila;

  public Fila() {
    this.refNoEntradaFila = null;
  }

  public boolean isEmpty() {
    return refNoEntradaFila == null ? true : false;
  }

  public void enqueue(Object object) {
    No novoNo = new No();
    novoNo.setRefNo(refNoEntradaFila);
    refNoEntradaFila = novoNo;
  }

  public Object first() {
    if (!this.isEmpty()) {
      No primeiroNo = refNoEntradaFila;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          primeiroNo = primeiroNo.getRefNo();
        } else {
          break;
        }
      }
      return primeiroNo.getObject();
    }
    return null;
  }

  public Object dequeue() {
    if (!this.isEmpty()) {
      No noAuxilar = refNoEntradaFila;
      No primeiroNo = refNoEntradaFila;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          noAuxilar = primeiroNo;
          primeiroNo = primeiroNo.getRefNo();
        } else {
          noAuxilar.setRefNo(null);
          break;
        }
      }
      return primeiroNo.getObject();
    }
    return null;
  }

  @Override
  public String toString() {
    String stringRetorno = "";
    No noAuxiliar = refNoEntradaFila;
    if (refNoEntradaFila != null) {
      while ((true)) {
        stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + ")]---->";
        noAuxiliar = noAuxiliar.getRefNo();
        if (noAuxiliar.getRefNo() != null) {
          noAuxiliar = noAuxiliar.getRefNo();
        } else {
          stringRetorno += "null";
          break;
        }
      }

    }

    return stringRetorno;
  }

}
