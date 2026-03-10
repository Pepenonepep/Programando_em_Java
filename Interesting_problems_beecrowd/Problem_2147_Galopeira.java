/*
🇺🇸 English

One day, the brothers Little Chitão and Xor Or Oh, great typists, made ​​a challenge to see who was the best in typing. For this, they obtained a computer that does not process keystrokes, ie, if it is to enter the same letter twice in a row, to press the button twice, as, press for longer, no use. They also measured the time down a key, which was exactly 1/100 second. The challenge would be who typed the word "Galopeira" consisting of letters and more, but both were very good, and arrived at a point that it was not possible to count how many letters had been typed. Then asked your help to write a program that checks the typed word and see how much time was spent typing.

Write a program that, given a typed word, tell how much time was spent to be entered.

Input
An integer C will be informed, which is the amount of test cases. Each case has a word of at least 9 and at most 10,000 letters.

Output
For each test case, print a T number, which is the time spent, in seconds, to enter the word of their test case, with precision of two decimal digits.

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Certo dia, os irmãos Little Chitão e Xor Or Oh, exímios digitadores, fizeram um desafio, para ver quem era o melhor na digitação. Para isto, conseguiram um computador que não processa teclas pressionadas, ou seja, se for para digitar a mesma letra duas vezes seguidas, precisa pressionar a tecla duas vezes, visto que, pressionar a tecla por mais tempo, não adianta. Também mediram o tempo de uma tecla pressionada, que foi de, exatamente, um centésimo de segundo. O desafio seria quem digitasse a palavra “galopeira”, formada por mais letras e, mas ambos eram muito bons, e chegava num ponto que não era possível contar quantas letras haviam sido digitadas. Então, pediram a sua ajuda para escrever um programa que verifique a palavra digitada e veja quanto tempo foi gasto para a digitação.

Escreva um programa que, dada uma palavra digitada, informe quanto tempo foi gasto para ser digitada.

Entrada
Um número inteiro C será informado, que será a quantidade de casos de teste. Cada caso tem uma palavra, de, no mínimo, 9 e, no máximo 10000 letras.

Saída
Para cada caso de teste, imprima um número T, que é o tempo gasto, em segundos, para digitar a palavra do respectivo caso de teste, com aproximação de duas casas decimais.

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2147_Galopeira{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String palavra = sc.next();
            double tamanho= palavra.length()/100.0;
            System.out.println(String.format("%.2f",tamanho));
        }


        sc.close();
    }
    
}