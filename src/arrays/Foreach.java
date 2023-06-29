package arrays;
public class Foreach {

    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2, 9.4};

        // FOR tradicional
        for(int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " "); // 9.9 8.7 7.2 9.4
        }
        System.out.println();
        // FOREACH
        for(double nota: notas) {
            System.out.print(nota + " "); // 9.9 8.7 7.2 9.4
        }
    }
}
