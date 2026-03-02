/*🇺🇸 English

Bino and Cino are close friends. Bino likes to create mathematical challenges to Cino. This time, Bino created a list of numbers and asked to Cino: How many numbers are multiples of 2, 3, 4 and 5?

This challenge looks simple, but when the list contains many numbers, Cino makes some miscalculations. To help Cino, make a program to solve the Bino's Challenge.

Input
The first line of input consists of an integer N (1 ≤ N ≤1000), representing the amount of numbers in the Bino's list.

The second line contains N integers Li (1 ≤ Li ≤ 100), representing the numbers of the Bino's list.

Output
Print the amount of multiples of 2, 3, 4 and 5 in the list. Note the formatting of the output in the output sample, because it must be followed strictly. "Multiplo(s)" means "Multiple(s)" in English, but you must print the message in Portuguese. */

/* Class name must be "Main" for your solution to execute */

/* 🇧🇷 Portugues 

Bino e Cino são colegas inseparáveis. Bino gosta de criar desafios matemáticos para Cino resolver. Desta vez, Bino gerou uma lista de números e perguntou ao Cino quantos números da lista são múltiplos de 2, 3, 4 e 5.

Esse desafio pode parecer simples, porém, quando a lista contém muitos números, Cino se confunde e acaba errando alguns cálculos. Para ajudar Cino, faça um programa para resolver o desafio de Bino.

Entrada
A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando a quantidade de números na lista de Bino.

A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números da lista de Bino.

Saída
Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. Observe a formatação da saída nos exemplos, pois ela deve ser seguida rigorosamente. */

/* O nome da classe deve ser "Main" para que a sua solução execute */


package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2060_Bino_is_Challenge{
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<0 || N>1000){
            sc.close();
            return;
        }
        int[] vet = new int[N];
        int m2=0,m3=0,m4=0,m5=0;
        for(int i=0;i<N;i++){
            vet[i]=sc.nextInt();
            if(vet[i]%2==0){
                m2++;
            }
            if(vet[i]%3==0){
                m3++;
            }
            if(vet[i]%4==0){
                m4++;
            }
            if(vet[i]%5==0){
                m5++;
            }
        }
        System.out.println(m2+" Multiplo(s) de 2");
        System.out.println(m3+" Multiplo(s) de 3");
        System.out.println(m4+" Multiplo(s) de 4");
        System.out.println(m5+" Multiplo(s) de 5");


        sc.close();
    }

}