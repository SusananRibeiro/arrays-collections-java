package colecoes.hash;
import java.util.Objects;

public class UsuarioHash {

    String nome;

    UsuarioHash(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UsuarioHash other = (UsuarioHash) obj;
        return Objects.equals(nome, other.nome);
    }

}
