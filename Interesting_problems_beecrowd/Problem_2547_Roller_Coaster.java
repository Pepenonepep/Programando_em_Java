/*
🇺🇸 English

Everyone in Nlogônia is really excited with the opening of Ricardo Barreiro World, the newest amusement park in the country. Its roller coaster, the fastest in the continent, is being widely advertised on TV and Radio. It’s the attraction everyone, from kids to grandmas, wants to ride.

Unfortunately, some restrictions were imposed by the government during the attraction’s homologation. For safety reasons, there is a minimum and a maximum height people must have to ride the roller coaster.

In the inauguration day, every guest filled a register in which they indicated their heights. In order to reduce lines and optimize the operation, you were hired to write a program that, given the number of guests, the minimum and maximum allowed height, and the height of every guest, determine how many guests are allowed to ride the roller coaster.

Input
The input contains several test cases. The first line of each test case contains three integers N (1 ≤ N ≤ 100), Amin and Amax (50 ≤ Amin ≤ Amax ≤ 250), the number of guests, the minimum and the maximum allowed height, respectively, in centimeters.

Each of the next N lines contains an integer (50 ≤ Ai ≤ 250), the height of the i-th guest, in centimeters.

The input ends with end-of-file (EOF).

Output
For each test case, print a single line containing the number of guests allowed to ride the roller coaster.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Todos os habitantes da Nlogônia estão super animados com a abertura do Ricardo Barreiro World, o mais novo parque de diversões do país. Na TV e no rádio só passam propagandas da montanha-russa do parque, a mais rápida do continente. É nela que todos, de crianças a idosos querem andar.

Infelizmente foram impostas algumas restrições no momento da homologação do brinquedo pelo governo. Por questões de segurança, há uma altura mínima e uma altura máxima que as pessoam devem ter para poder passear na montanha-russa.

Para o dia da inauguração do parque, todos os convidados realizaram um pré-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar a operação do parque no primeiro dia, você foi contratado para fazer um programa que dado o número de visitantes, altura mínima, altura máxima e as alturas de todos os visitantes, calcule quantas pessoas poderão andar na montanha-russa.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso consiste em três inteiros N (1 ≤ N ≤ 100), Amin e Amax (50 ≤ Amin ≤ Amax ≤ 250), o número de visitantes, a altura mínima e máxima em centímetros para andar na montanha-russa, respectivamente.

As N linhas seguintes contém, cada uma, um número inteiro Ai (50 ≤ Ai ≤ 250), a altura do i-ésimo visitante, em centímetros.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma única linha com o número visitantes que podem passear na montanha-russa.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2547_Roller_Coaster {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            if (N < 1 || N > 100)
                break;
            int aMin = sc.nextInt();
            int aMax = sc.nextInt();
            if (aMin < 50 || aMin > aMax || aMax > 250)
                break;
            int[] vetorAlturas = new int[N];
            for (int p = 0; p < N; p++) {
                vetorAlturas[p] = sc.nextInt();
            }
            int contQuePodem = 0;
            for (int p = 0; p < N; p++) {
                if (vetorAlturas[p] >= aMin && vetorAlturas[p] <= aMax) {
                    contQuePodem++;
                }
            }
            System.out.println(contQuePodem);
        }
        sc.close();
    }
}