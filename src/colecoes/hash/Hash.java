package colecoes.hash;
import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<UsuarioHash> usuarios = new HashSet<UsuarioHash>();
        usuarios.add(new UsuarioHash("Pedro"));
        usuarios.add(new UsuarioHash("Ana"));
        usuarios.add(new UsuarioHash("Guilherme"));

        boolean resultado = usuarios.contains(new UsuarioHash("Guilherme"));
        System.out.println(resultado); // true, mas para dar certo precisa implementar o "equals" e o "hashCode" na classe "UsuarioHash"

    }
}
