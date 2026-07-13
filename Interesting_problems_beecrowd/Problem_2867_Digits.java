/*
🇺🇸 English

Given two integers, n and m, how many digits have nm?

Examples:

2 and 10 - 210 = 1024 - 4 digits

3 and 9 - 39 = 19683 - 5 digits

Input
The input is composed of several test cases. The first line has an integer C, representing the number of test cases. The following C lines contain two integers N and M (1 <= N, M <= 100).

Output
For each input test case of your program, you must print an integer containing the number of digits of the result of the calculated power in the respective test case.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Dados dois números inteiros, n e m, quantos dígitos tem nm ?

Exemplos:

2 e 10 - 210 = 1024 - 4 dígitos

3 e 9 - 39 = 19683 - 5 dígitos

Entrada
A entrada é composta por vários casos de teste. A primeira linha tem um número inteiro C, representando a quantidade de casos de teste. As C linhas seguintes contém dois números inteiros N e M (1 <= N, M <= 100).

Saída
Para cada caso de teste de entrada do seu programa, você deve imprimir um número inteiro contendo a quantidade de dígitos do resultado da potência calculada no respectivo caso de teste.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.math.BigInteger;
import java.io.IOException;

public class Problem_2867_Digits {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                double N = sc.nextDouble();
                double M = sc.nextDouble();

                BigInteger base = BigInteger.valueOf((long) N);
                BigInteger potenciaG = base.pow((int) M);

                String potenciaString = potenciaG.toString();

                int tam = potenciaString.length();
                System.out.println(tam);

            }
        }

        sc.close();

    }
}