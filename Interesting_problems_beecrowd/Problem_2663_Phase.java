/*
🇺🇸 English

In some academic competitions, such as the Brazilian Computer Science Olympiad (OBI), a certain number of contestants qualify from one phase to the next, guaranteeing one of the available spots. However, this number is usually variable, because given a certain minimum number of classified contestants, it is common for there to be a tie for the last place. In this case, it is common for all the contestants tied for last place to qualify.

Your task is to help calculate the number of contestants that will qualify to the next round. You will be given a list of the contestants' scores and the minimum number of places for the next round, and you must decide how many contestants will actually qualify.

Input
The first line of the entry will contain an integer N, 1 ≤ N ≤ 1000, representing the number of contestants. The second line will contain an integer K, 1 ≤ K ≤ N, indicating the minimum number of contestants that must qualify for the next round. Then N lines will each contain a number between 1 and 1000, inclusively, corresponding to a contestant's score.

Output
Your program should print one line, containing the number of qualifiers for the next phase.

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Em diversas competições acadêmicas, como a Olimpíada Brasileira de Informática (OBI), uma certa quantidade de competidores se classifica de uma fase para a fase seguinte, garantindo uma das vagas disponíveis. Entretanto, normalmente essa quantidade é variável, pois dada uma certa quantidade mínima de classificados, é frequente que haja empate na última vaga de classificação. Neste caso, é comum que todos os competidores empatados na última colocação se classifiquem.

Sua tarefa é ajudar a calcular o número de competidores classificados para a próxima fase. Você receberá uma lista de pontuações obtidas pelos competidores e o número mínimo de vagas para a fase seguinte e você deve decidir quantos competidores de fato vão se classificar.

Entrada
A primeira linha da entrada contém um número inteiro N, 1 ≤ N ≤ 1000, representando o número de competidores. A segunda linha conterá um inteiro K, 1 ≤ K ≤ N, indicando o número mínimo de competidores que devem se classificar para a próxima fase. Em seguida, N linhas conterão, cada uma um número entre 1 e 1000, inclusive, correspondente á pontuação de um competidor.

Saída
Seu programa deve imprimir uma linha, contendo o número de classificados para a próxima fase.

/*O nome da classe deve ser "Main" para que a sua solução execute */


package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.util.Arrays;

public class Problem_2663_Phase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        Arrays.sort(scores);
        int cutoff = scores[n - k];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] >= cutoff) {
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}