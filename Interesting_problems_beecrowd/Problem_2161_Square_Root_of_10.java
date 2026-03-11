/*
🇺🇸 English

The method of periodic continued fractions is one of the many ways to calculate the square root of a natural number. This method uses as denominator a repetition for fractions. This repetition can be done by a fixed number of times.

Your task is to calculate the approximate value of square root of 10 given the number N of repetitions.

Input
The input is a natural number N (0 ≤ N ≤ 100) that indicates the quantity of denominator repetitions in the continued fraction.

Output
The output is the approximate value of the square root with 10 decimal places.

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Uma das formas de calcular a raiz quadrada de um número natural é pelo método das frações periódicas continuadas. Esse método usa como denominador uma repetição de frações. Essa repetição pode ser feita uma quantidade específica de vezes.

Sua tarefa é, dado o número N de repetições, calcular o valor aproximado da raiz quadrada de 10.

Entrada
A entrada é um número natural N (0 ≤ N ≤ 100), que indica o número de repetições do denominador na fração continuada.

Saída
A saída é o valor aproximado da raiz quadrada com 10 casas decimais.

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2161_Square_Root_of_10{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        double resultado=0.0;
        double fracao = 0.0;
        if(N>=0 && N<=100){
            for (int i = 0; i < N; i++) {
                fracao = 1.0 / (6.0 + fracao);
            }
            resultado = 3.0+fracao;
            System.out.println(String.format("%.10f",resultado));
        }

        sc.close();
    }
}