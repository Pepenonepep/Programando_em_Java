/*
🇺🇸 English

Mrs. Ricota is a meticulous lady. As Christmas is coming she wants to distribute pairs of gifts to her family.

During her last trip, Mrs. Ricota bought 2n gifts for her n grandchildren. Each gift cost xi reais (1 ≤ i ≤ 2n) and, to avoid conflicts, she plans to organize the pairs of gift in a way that minimizes the difference between the total value of the most expensive pair of gifts and the total value of the cheapest pair.

As you are a kind person, Mrs. Ricota decided to ask your help to organize the gifts.

Input
The input consists of several test cases. The first line of a test case has an integer n (2 ≤ n ≤ 104), the number of grandchildren. The second line has 2n integers xi (1 ≤ xi ≤ 108, where 1 ≤ i ≤ 2n) in descending order and separated for exactly one whitespace. Each integer xi represents the value of the i-th gift bought by Mrs. Ricota.

The first line of the last test case contains n = 0 and must not be processed.

Output
For each test case print a line with the total price of the most expensive pair of gifts and the total price of the cheapest pair of gifts separated by a blank space.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Dona Ricota é uma senhora muito meticulosa. Como o natal está se aproximando ela quer distribuir pares de presentes para seus familiares.

Durante sua última viagem, Dona Ricota comprou 2n presentes para seus n netos. Cada presente custou xi reais (1 ≤ i ≤ 2n) e, para evitar conflitos, ela planeja formar os pares de presentes de modo a minimizar a diferença entre o valor total do par de presentes mais caro e o valor total do par mais barato.

Como você é uma pessoa gentil, Dona Ricota resolveu pedir sua ajuda para organizar os presentes.

Entrada
A entrada consiste em vários casos de teste. A primeira linha de um caso de teste possui um inteiro n (2 ≤ n ≤ 104), a quantidade de netos. A segunda linha possui 2n inteiros xi (1 ≤ xi ≤ 108, em que 1 ≤ i ≤ 2n) em ordem decrescente e separados por exatamente um espaço em branco. Cada inteiro xi representa o valor do i-ésimo presente comprado por Dona Ricota.

A primeira linha do último caso de teste contém n = 0 e não deve ser processada.

Saída
Para cada caso de teste imprima uma linha com o preço total do par de presentes mais caro e o preço total do par de presentes mais barato separados por um espaço em branco.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class Problem_3089_Christmas_Gifts {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n * 2; i++) {
                list.add(sc.nextInt());
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int sum = list.get(i) + list.get((n * 2) - 1 - i);

                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
            System.out.println(max + " " + min);
        }
        sc.close();
    }
}
