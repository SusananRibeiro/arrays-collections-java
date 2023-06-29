package arrays;
import java.util.Arrays;

public class ExercicioArray {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA)); // [0.0, 0.0, 0.0] --> como está o array está vazio, vai retornar o valor padrão do tipo double que é 0.0
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA)); // [7.9, 8.0, 6.7] --> já com os valores atribuídos
        System.out.println(notasAlunoA[0]); // primeira nota --> 7.9
        System.out.println(notasAlunoA[notasAlunoA.length - 1]); // última nota --> 9.7

        double totalAlunoA = 0;
        // para percorrer o array
        for(int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length); // 8.075 --> média do Aluno A

        // Declarar e já inicializar o Array
        final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
        double totalAlunoB = 0;
        for(int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length); // 7.925000000000001 --> média do Aluno B
    }

}
