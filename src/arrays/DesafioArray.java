package arrays;

import java.util.Scanner;
public class DesafioArray {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantas notas você quer informar? ");
        int qtdeNotas = ler.nextInt();
        double[] notas = new double[qtdeNotas];

        for(int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = ler.nextDouble();;

        }
        // System.out.println(Arrays.toString(notas)); --> imprimir o array

        double total = 0;
        for(double nota : notas) {
            total += nota; // somando as notas
        }
        double media = total / notas.length;
        System.out.println("A media e " + media); // mostrar a nota

        ler.close();

    }
}
