package colecoes;
import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        // Obter
        System.out.println(livros.peek()); // O Hobbit -> foi o último adicionado
        System.out.println(livros.element()); // O Hobbit -> foi o último adicionado

        // Percorrer a pilha
        for(String livro: livros) {
            System.out.println(livro);
        }

        // Remover
        System.out.println(livros.poll()); // O Hobbit -> foi o último adicionado
        System.out.println(livros.poll()); // Don Quixote -> se tornou o último da pilha
        System.out.println(livros.poll()); // O Pequeno Pr�ncipe -> se tornou o último da pilha
        System.out.println(livros.poll()); // null -> a pilha está vazia
        //System.out.println(livros.pop()); // Exception java.util.NoSuchElementException -> a pilha está vazia
        //System.out.println(livros.remove()); // Exception java.util.NoSuchElementException -> a pilha está vazia

        // livros.size(); // tamanho da pilha
        // livros.clear(); // limpar a pilha
        // livros.contains(); // saber se contém um elemento na pilha
        // livros.isEmpty(); // saber se a pilha está vazia


    }
}
