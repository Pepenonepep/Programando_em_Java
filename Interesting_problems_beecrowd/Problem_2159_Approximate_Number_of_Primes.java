/*
🇺🇸 English

Schoenfeld and Rosser published a paper in 1962 describing a minimum and a maximum value to the quantity of prime numbers up to n, for n ≥ 17. This quantity is represented by the function (n) and the inequality is shown below.


Your task is, given a natural number n, to compute the interval's minimum and maximum values to the approximate number of primes up to n.

Input
The input is a natural number n (17 ≤ n ≤ 109).

Output
The output is given as two values P and M with 1 decimal place each, such that P < (n) < M according to the given inequality above. These two values have one blank space between them.


/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Schoenfeld e Rosser publicaram em 1962 um artigo descrevendo um valor mínimo e máximo para a quantidade de números primos até n, para n ≥ 17. Esta quantidade é representada pela função (n) e a fórmula é mostrada abaixo.


Sua tarefa é, dado um natural n, calcular o mínimo e máximo do intervalo para o número aproximado de primos até n.

Entrada
A entrada é um número natural n (17 ≤ n ≤ 109).

Saída
A saída são dois valores P e M com 1 casa decimal cada, tal que P < (n) < M, de acordo com a fórmula dada acima. Os valores devem ser separados por um espaço em branco.

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2159_Approximate_Number_of_Primes{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        if(n>=17 && n<=Math.pow(10,9)){
            double min=n/Math.log(n);
            double max=1.25506*n/Math.log(n);

            System.out.println(String.format("%.1f %.1f",min,max));

        }

        sc.close();
    }
}