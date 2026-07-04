/*
🇺🇸 English

Umil Bolt is an excellent runner. His specialty is the 100-meter race. Every day, he makes a battery of attempts to run this test in an ever faster time. It can be seen that, depending on the number of attempts, its performance improves or worsens. About this, he asks for your help to calculate the fastest attempt of each daily battery.

Input
The input is composed of several test cases. The first line of each test case contains an integer T (2 <= T <= 99) relative to the number of trials of a day. The following T lines contain a real number Ti (9 <= Ti <= 11) relative to the time, in seconds, of the ith battery attempt. The entry ends with end of file.

Output
For each test case of your program entry, you must print a real number containing the time of the fastest attempt of each battery.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Umil Bolt é um excelente corredor. Sua especialidade é a prova dos 100 metros rasos. Todos os dias, ele faz uma bateria de tentativas de correr esta prova em um tempo cada vez menor. Pode se perceber que, dependendo da quantidade de tentativas, o seu desempenho melhora ou piora. Sobre isso, ele pede a sua ajuda para calcular a tentativa mais rápida de cada bateria diária.

Entrada
A entrada é composta por vários casos de teste. A primeira linha de cada caso de teste contém um número inteiro T (2 <= T <= 99) relativo ao número de tentativas de um dia. As T linhas seguintes contêm um número real Ti (9 <= Ti <= 11) relativo ao tempo, em segundos, da i-ésima tentativa da bateria. A entrada termina com fim de arquivo.

Saída
Para cada caso de teste de entrada do seu programa, você deve imprimir um número real contendo o tempo da tentativa mais rápida de cada bateria.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class Problem_2863_Umil_Bolt {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<Double> listaDeTempo = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                listaDeTempo.add(sc.nextDouble());
            }
            Double menor = listaDeTempo.get(0);
            for (Double j : listaDeTempo) {
                if (j < menor) {
                    menor = j;
                }
            }
            System.out.println(menor);
        }

        sc.close();
    }
}
