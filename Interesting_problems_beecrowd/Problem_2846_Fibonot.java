/*
🇺🇸 English

The Fibonacci sequence is one of the most famous sequences in the world. The Fibonacci terms are always equal to the sum of the two terms preceding them in the sequence and the first two terms are 1. That is:

1 , 1, 2, 3, 5, 8, 13, 21, 34 ...

However, we are not interested in finding the terms of the Fibonacci sequence, but the terms of the Fibonot sequence!

The Fibonot sequence is composed of numbers that do not belong to the Fibonacci sequence. More specifically, non-zero positive integers. In ascending order!

Here are the first terms of Fibonot:

4, 6, 7, 9, 10, 11, 12, 14, 15 ...

Your task is to find the K-th Fibonot number.

Input
The entry consists of a single integer K (1 ≤ K ≤ 105) specifying the index of the element of the desired Fibonot sequence.

Output
A single integer representing the K-th term of the Fibonot sequence.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

A sequência de Fibonacci é uma das sequências mais famosas do mundo. Os termos de Fibonacci são sempre iguais à soma dos dois termos anteriores a eles na sequência, e os dois primeiros termos são 1. Ou seja:

1 , 1, 2, 3, 5, 8, 13, 21, 34 ...

Porém, não estamos interessados em achar os termos da sequência de Fibonacci, mas sim os termos da sequência de Fibonot!

A sequência de Fibonot é composta pelos números que não pertencem à sequência de Fibonacci. Mais especificamente, os números inteiros positivos não-nulos. Em ordem crescente!

Eis os primeiros termos de Fibonot:

4, 6, 7, 9, 10, 11, 12, 14, 15 ...

Sua tarefa é achar o K-ésimo número de Fibonot.

Entrada
A entrada consiste um único inteiro K (1 ≤ K ≤ 105) especificando o índice do elemento da sequência de Fibonot desejado.

Saída
Um único inteiro representando o K-ésimo termo da sequência de Fibonot.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2846_Fibonot {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;
        int b = 2;
        int count = 0;

        while (true) {
            for (int i = a + 1; i < b; i++) {
                count++;
                if (count == n) {
                    System.out.println(i);
                    sc.close();
                    return;
                }
            }

            int c = a + b;
            a = b;
            b = c;
        }
    }
}