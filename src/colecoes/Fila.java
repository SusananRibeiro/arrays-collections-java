package colecoes;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia
        fila.add("Ana"); // .add() lançará uma exceção caso a fila esteja cheia.
        fila.offer("Bia"); // .offer() retorna falso caso a fila esteja cheia. É usado quando a fila tem um tamanho máximo pré-definido.
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obter o próximo elemento da fila (sem remover)
        // Diferença é o comportamento quando a fila está vazia
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());

        // Poll e Remove -> obter o próximo elemento da fila e remover
        // Diferença é o comportamento quando a fila está vazia
        System.out.println(fila.poll()); // pegar o primeiro elemento da fila já removendo
        System.out.println(fila.remove()); // pegar o primeiro elemento da fila já removendo

        // fila.size(); // tamanho da fila
        // fila.clear(); // limpar a fila
        // fila.isEmpty(); // saber se a fila está vazia
        // fila.contains(); // saber se elemento contem na fila

    }
}
