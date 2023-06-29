package colecoes;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        // Set<String> lista = new HashSet<String>(); --> até o Java 7 era feito desta forma, especificar o tipo de dado 2 vezes
        // Set<String> listaAprovados = new HashSet<>(); // com o "operador diamond(<>)" não precisa
        // Set<String> listaAprovados = new TreeSet<>(); // ordenado
        // TreeSet<String> listaAprovados = new TreeSet<>(); // ordenado
        SortedSet<String> listaAprovados = new TreeSet<>(); // ordenado
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        // FOREACH
        for(String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        // OUTRO Exemplo
        Set<Integer> nums = new HashSet<>(); // ordenado
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n: nums) {
            System.out.println(n);
        }
    }
}
