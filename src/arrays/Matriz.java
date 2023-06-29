package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt(); // quantidade de alunos

        System.out.print("Quantas notas por aluno? ");
        int qtdeNotas = entrada.nextInt(); // quantidade de notas

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas]; // matriz de 2 dimensão, o array externo vem primeiro ex: "qtdeAlunos", os internos vem depois ex: "qtdeNotas"
        double total = 0;

        // Array externo "Alunos"
        for(int a = 0; a < notasDaTurma.length; a++) {
            // Array interno "Notas"
            for(int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", (n + 1), (a + 1));
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double mediaDaTurma = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Media da turma é " + mediaDaTurma);

        for(double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno)); // mostrar a matriz
        }


        entrada.close();

    }

}
