package colecoes;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({ "rawtypes", "unchecked" }) // para tirar as advertências
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // converte o double -> Double, que é uma classe
        conjunto.add(true); // converte o boolean -> Boolean, que é uma classe
        conjunto.add("Teste");
        conjunto.add(1); // converte o int -> Integer, que é uma classe
        conjunto.add('x'); // converte o char -> Character, que é uma classe

        System.out.println("Tamanho é " + conjunto.size()); // 5 --> saber o tamanho do conjunto

        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println("Foi excluido? " + conjunto.remove("teste")); // false --> porque não existe esse valor dentro do conjunto
        System.out.println("Foi excluido? " + conjunto.remove("Teste")); // true --> porque existe esse valor dentro do conjunto
        System.out.println("Foi excluido? " + conjunto.remove('x')); // true
        System.out.println("Tamanho é " + conjunto.size()); // 3

        System.out.println("Contém? " + conjunto.contains('x')); // false --> porque não existe esse valor dentro do conjunto
        System.out.println("Contém? " + conjunto.contains(1)); // true --> porque existe esse valor dentro do conjunto

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums); // [1, 2, 3]
        System.out.println(conjunto); // [1.2, 1, true]

        // conjunto.addAll(nums); // União entre os conjuntos
        // System.out.println(conjunto); // [1.2, 1, 2, 3, true] --> com a união dos conjuntos

        conjunto.retainAll(nums); // interseção entre os conjuntos
        System.out.println(conjunto); // [1] --> com a interseção entre os conjuntos

        conjunto.clear(); // limpar os elementos do conjunto
        System.out.println(conjunto); // [] --> vazio

    }

}
