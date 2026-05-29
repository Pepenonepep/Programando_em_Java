/*
🇺🇸 English



/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 



/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2715_Splitting_Assignments {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            long[] vetor = new long[N];
            long somaGu = 0;
            for (int i = 0; i < N; i++) {
                vetor[i] = sc.nextInt();
                somaGu += vetor[i];
            }
            long[] vetorDiferencas = new long[N - 1];
            long somaRa = 0;
            for (int i = 0; i < N - 1; i++) {
                somaRa += vetor[i];
                somaGu -= vetor[i];
                vetorDiferencas[i] = Math.abs(somaRa - somaGu);
            }
            long menorDiferenca = vetorDiferencas[0];
            for (int i = 1; i < N - 1; i++) {
                if (vetorDiferencas[i] < menorDiferenca) {
                    menorDiferenca = vetorDiferencas[i];
                }
            }
            System.out.printf("%d\n", menorDiferenca);
        }

        sc.close();
    }
}