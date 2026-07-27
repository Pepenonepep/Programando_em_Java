/*
🇺🇸 English

The spread of computers is mainly due to their ability to behave like other machines, replacing many of them. This flexibility is possible because we can change the functionality of a computer so that it operates in the way we want: this is the basis of what we call programming.

Your task is to write a program that makes the computer operate as a simple calculator. Your program must read arithmetic expressions and produce as output the value of these expressions, as a calculator would. The program must implement only a reduced subset of the operations available in a calculator: additions and subtractions.
 

Input
The input consists of several test sets. The first line of a test set contains an integer m (1 ≤ m ≤ 100), indicating the number of operands in the expression to be evaluated. The second line of a test set contains the arithmetic expression to be evaluated, in the following format:

X1 s1 X2 s2 ... Xm-1 sm-1 Xm

where

• Xi, 1 ≤ i ≤ m, is an operand (0 ≤ Xi ≤ 100);

• sj, 1 ≤ j < m, is an operator, represented by the symbols ‘+’ or ‘–’;

• there are no blank spaces between operands and operators. The end of the input is indicated by the value m = 0.

Output
For each test set in the input, your program must produce three lines. The first line must contain an expression identifier, in the format “Teste n”, where n is numbered starting from 1. On the second line, the result found by your program must appear. The third line must be left blank. The spelling shown in the Output Example below must be followed strictly.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

A disseminação dos computadores se deve principalmente à capacidade de eles se comportarem como outras máquinas, vindo a substituir muitas destas. Esta flexibilidade é possível porque podemos alterar a funcionalidade de um computador, de modo que ele opere da forma que desejarmos: essa é a base do que chamamos programação.

Sua tarefa é escrever um programa que faça com que o computador opere como uma calculadora simples. O seu programa deve ler expressões aritméticas e produzir como saída o valor dessas expressões, como uma calculadora faria. O programa deve implementar apenas um subconjunto reduzido das operações disponíveis em uma calculadora: somas e subtrações.
 

Entrada
A entrada é composta de vários conjuntos de testes. A primeira linha de um conjunto de testes contém um número inteiro m (1 ≤ m ≤ 100), indicando o número de operandos da expressão a ser avaliada. A segunda linha de um conjunto de testes contém a expressão aritmética a ser avaliada, no seguinte formato:

X1 s1 X2 s2 ... Xm-1 sm-1 Xm

onde

• Xi, 1 ≤ i ≤ m, é um operando (0 ≤ Xi ≤ 100);

• sj, 1 ≤ j < m, é um operador, representado pelos símbolos ‘+’ ou ‘–’;

• não há espaços em branco entre operandos e operadores. O final da entrada é indicado pelo valor m = 0.

Saída
Para cada conjunto de testes da entrada seu programa deve produzir três linhas. A primeira linha deve conter um identificador da expressão, no formato “Teste n”, onde n é numerado a partir de 1. Na segunda linha deve aparecer o resultado encontrado pelo seu programa. A terceira linha deve ser deixada em branco. A grafia mostrada no Exemplo de Saída, abaixo, deve ser seguida rigorosamente

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Problem_3065_Calculating {

    public static void attVectorNumbers(String expression, int[] vector, int n) {
        String[] parts = expression.split("[+\\-]");
        for (int i = 0; i < parts.length && i < n; i++) {
            vector[i] = Integer.parseInt(parts[i].trim());
        }
    }

    public static void attVectorOperators(String expression, char[] vector, int n) {
        int j = 0;
        for (int i = 0; i < expression.length() && j < n; i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-') {
                vector[j] = c;
                j++;
            }
        }
    }

    public static int calculating(int[] vectorNumbers, char[] vectorOperators) {
        int resultado = vectorNumbers[0];
        for (int i = 0; i < vectorOperators.length; i++) {
            if (vectorOperators[i] == '+') {
                resultado += vectorNumbers[i + 1];

            } else if (vectorOperators[i] == '-') {
                resultado -= vectorNumbers[i + 1];
            }
        }
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int vz = 1;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int[] vectorNumbers = new int[n];
            char[] vectorOperators = new char[n - 1];
            sc.nextLine();
            String expression = sc.nextLine();
            attVectorNumbers(expression, vectorNumbers, n);
            attVectorOperators(expression, vectorOperators, n - 1);
            System.out.println("Teste " + vz);
            System.out.println(calculating(vectorNumbers, vectorOperators));
            System.out.println();
            vz++;
        }

        sc.close();
    }

}
