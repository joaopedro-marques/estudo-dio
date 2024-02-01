import Fila.Fila;

public class App {
    public static void main(String[] args) throws Exception {
        Fila minhaFila = new Fila();
        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");
        System.out.println(minhaFila);
    }
}
