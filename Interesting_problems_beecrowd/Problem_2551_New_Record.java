/*
🇺🇸 English

The great Curitiban street marathon will occur in the next few days! Many athletes are training for the big day! Flávio is one of these athletes. He trains daily, hoping to be well placed in the marathon. He runs every morning on the streets near to his house.

His trainings are monitored by an app installed on his smartphone. After each training, Flávio knows both the duration and the distance he ran. With these information, he can determine his average speed in the training.

Flávio is really concerned about the evolution of his performance in his trainings, and, in particular, about the records of his average speed. Such record is beaten in some training when the average speed of that training is greater than all average speeds of the previous trainings. Help Flávio to determine in which trainings he beat his record.

Input
The input contains several test cases. The first line of each test case contains an integer N (1 ≤ N ≤ 30), the number of trainings. Consider that the trainings were done in days 1, 2,...,N. The next N lines describe the trainings. Line i (1 ≤ i ≤ N) contains two integers Ti and Di (1 ≤ Ti, Di ≤ 100), the duration of the training (in minutes) and the distance ran during it (in kilometers).

The input ends with end-of-file (EOF).

Output
For each test case, print a list of integers indicating the days in which the record was beaten. Each day must be printed in a single line. Print them in ascending order. Please notice that day 1 must always be printed.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

A grande Maratona de Rua de Curitiba irá ocorrer nos próximos dias! Vários atletas estão treinando há dias para o grande dia da corrida. Flávio é um dos atletas que está treinando diariamente para se sair bem na corrida. Ele tem corrido todas as manhãs nas pistas próximas de sua casa.

Os treinos do garoto são monitorados por um aplicativo em seu celular. Após cada treino, Flávio sabe tanto a duração do treino quanto a distância total percorrida. Com essas informações, ele consegue determinar a velocidade média obtida em cada treino.

Flávio está muito preocupado com a evolução de seu desempenho nos treinos, e em particular com seu recorde de velocidade média. Tal recorde é batido em um dado treino quando a velocidade média para este treino é maior que todas as velocidades médias obtidas nos treinos anteriores. Ajude Flávio a determinar em quais treinos ele conseguiu bater seu recorde.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém um inteiro N (1 ≤ N ≤ 30), o número de treinos feitos. Considere que os treinos foram feitos nos dias 1, 2,...,N. As próximas N linhas descrevem os treinos. A linha i (1 ≤ i ≤ N) contém dois inteiros Ti e Di (1 ≤ Ti, Di ≤ 100), indicando, respectivamente, a duração do treino (em minutos) e a distância percorrida no treino (em quilômetros).

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma lista de inteiros indicando os dias nos quais o recorde foi batido. Cada dia deve ser impresso em uma linha. Imprima os dias em ordem crescente. Note que o dia 1 sempre deve ser impresso.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2551_New_Record {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            double recorde = -1.0;

            for (int i = 1; i <= N; i++) {
                double tempo = sc.nextDouble();
                double distancia = sc.nextDouble();
                double velocidadeAtual = distancia / tempo;

                if (i == 1) {
                    System.out.println(i);
                    recorde = velocidadeAtual;
                } else {
                    if (velocidadeAtual > recorde) {
                        System.out.println(i);
                        recorde = velocidadeAtual;
                    }
                }
            }
        }

        sc.close();
    }
}
