/*
🇺🇸 English

Binet's formula is a way to calculate Fibonacci numbers.



Your task is, given a natural number n, to compute the value of Fibonacci(n) using the formula above.

Input
The input is a natural number n (0 < n ≤ 50).

Output
The output is the value of Fibonacci(n) with 1 decimal place using the given Binet's formula.

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

A fórmula de Binet é uma forma de calcular números de Fibonacci.



Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.

Entrada
A entrada é um número natural n (0 < n ≤ 50).

Saída
A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;


public class Problem_2164_Fast_Fibonacci {
    public static void main(String[]args) throws IOException{
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n= sc.nextInt();
        double fibonacci=((Math.pow(((1+Math.sqrt(5))/2),n))-(Math.pow(((1-Math.sqrt(5))/2),n)))/Math.sqrt(5);
        System.out.println(String.format("%.1f",fibonacci));
        sc.close();
    }
}
