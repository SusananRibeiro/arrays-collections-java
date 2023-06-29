package colecoes.lista;
import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        //ArrayList<Usuario> lista = new ArrayList<>(); --> não precisa ser exatamente dessa forma
        List<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Lia")); // aceita objetos duplicados

        // System.out.println(lista.get(3).nome); // acessar pelo índice, ".nome" é usado quando não tem o método "toString"
        System.out.println(lista.get(3)); // acessar pelo índice, já com o toString"

        // lista.remove(1); // remover pelo índice
        // lista.remove(new Usuario("Manu")); // remover a partir de um objeto
        System.out.println(">>>> " + lista.remove(1));           // >>>> Meu nome � Carlos. --> mostra o que vai ser excluído
        System.out.println(lista.remove(new Usuario("Manu")));    // true --> diz se vai ser excluído ou não
        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));

        for(Usuario u: lista) {
            //System.out.println(u.nome); //.nome é usado quando não tem o método "toString" declarado
            System.out.println(u); // já com o "toString"
        }

    }
}
