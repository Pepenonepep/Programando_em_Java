/*
🇺🇸 English

In a given diving competition, each dive has a degree of difficulty and is evaluated by seven judges. After each jump, the judges, who don't communicate with each other, show their scores. A dive is evaluated between zero and ten by each judge. After the scores are presented, the highest and the lowest scores are discarded. The remaining scores are added and the sum is multiplied by the degree of difficulty of the dive, which is a number between 1.2 and 3.8 defined before the dive. So, for example, assuming a diver's jump has difficulty 2.0 and his scores are 6,0, 5,0, 5,0, 5,0, 5,0, 5,0 and 4,0. Discarding the highest and lowest scores, we get to a result of 25.0. This result is then multiplied by the degree of difficulty 2.0 for a final score of 50.0. You program must display the results of a competition following these rules.

Input
The first row of input has the number of diversN (0 ≤ N ≤ 100). Next, the name of each competitor is followed by the degree of difficulty D (1.2 ≤ D ≤ 3.8) of the dive and, in the next line, the seven scores S1 to S7 (0 ≤ S1 to S7 ≤ 10)given by the judges.

Output
The output must show the results of the competition, with the name of each diver followed by the final score, in the order in which the data was input.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Em uma determinada competição de saltos ornamentais, cada salto recebe um grau de dificuldade e é avaliado por sete juízes. Após cada salto, os juízes, que não se comunicam uns com os outros, mostram suas notas. Um salto é cotado entre zero e dez pontos. Depois de apresentadas as notas, a mais alta e a mais baixa são descartadas. O restante é somado e multiplicado pelo grau de dificuldade do salto, que gira entre 1,2 e 3,8, definido sempre antes do início da apresentação do atleta. O julgamento então é feito da seguinte forma: supondo que um saltador tenha sua nota de partida (seu grau de dificuldade de movimento) avaliada em 2,0 e tire notas 6,0, 5,0, 5,0, 5,0, 5,0, 5,0, 4,0 em sua execução. Disso, retira-se a nota mais baixa e a mais alta, o que gera um resultado parcial de 25,0. Então, pega-se a nota de execução e multiplica-a pela nota de partida para se chegar ao resultado final, que neste exemplo é de 50,0. Seu programa deve apresentar o resultado de uma competição de acordo com estas regras.

Entrada
A primeira linha de entrada contém o número de competidoresN (0 ≤ N ≤ 100). A seguir são mostrados os nomes de cada um dos competidores seguidos pelo grau de dificuldade dos seus saltos GD (1.2 ≤ GD ≤ 3.8) e, a seguir, na linha seguinte, as 7 notas recebidas N1 a N7 (0 ≤ N1 a N7 ≤ 10).

Saída
A saída deve apresentar o resultado da competição, com o nome dos competidores seguido de seu resultado, na ordem em que os dados foram lidos.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2311_Diving{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();
        if (N < 0 || N > 100) {
            sc.close();
            return;
        }
        double[] notas = new double[7];
        for (int c = 0; c < N; c++) {
            String nome = sc.next();
            double GD = sc.nextDouble();
            if (GD < 1.2 || GD > 3.8) {
                sc.close();
                return;
            }
            for (int i = 0; i < 7; i++) {
                notas[i] = sc.nextDouble();
            }
            double maiorNota = notas[0];
            double menorNota = notas[0];
            double soma = 0.0;
            for (int i = 0; i < 7; i++) {
                if (notas[i] > maiorNota) maiorNota = notas[i];
                if (notas[i] < menorNota) menorNota = notas[i];
                soma += notas[i];
            }
            soma = soma - maiorNota - menorNota;
            double resultado = soma * GD;
            System.out.println(String.format("%s %.2f", nome, resultado));
        }
        sc.close();
    }
}