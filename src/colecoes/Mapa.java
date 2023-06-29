package colecoes;
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); // para adicionar uma chave e valor, não tem o método ".add()"
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        // usuarios.put(1, "Ricardo"); // também substitui um valor

        System.out.println(usuarios.size()); // tamanho do Map
        System.out.println(usuarios.isEmpty()); // saber se o Map está vazio

        System.out.println(usuarios.keySet()); // [1, 2, 3, 4] -> o conjunto da chave
        System.out.println(usuarios.values()); // [Roberto, Ricardo, Rafaela, Rebeca] -> o conjunto dos valores
        System.out.println(usuarios.entrySet()); // [1=Roberto, 2=Ricardo, 3=Rafaela, 4=Rebeca] -> o conjunto das chaves e valores
        System.out.println(usuarios.containsKey(1)); // true -> saber se contém a chave
        System.out.println(usuarios.containsValue("Rebeca")); // true -> saber se contém o valor
        System.out.println(usuarios.get(3)); // Rafaela -> saber o valor a partir da chave
        System.out.println(usuarios.remove(1)); // Roberto -> significa que foi removido a partir da chave
        System.out.println(usuarios.remove(2, "Gui")); // false -> não excluiu, pois o valor não existe com essa chave

        // Percoorer o MAP pela CHAVE
        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        // Percoorer o MAP pelo VALOR
        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        // Percoorer o MAP pela CHAVE e VALOR
        for(Entry<Integer, String> registro: usuarios.entrySet()) {
            //System.out.println(registro); // Uma forma de mostrar as chaves e valores
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
    }
}
