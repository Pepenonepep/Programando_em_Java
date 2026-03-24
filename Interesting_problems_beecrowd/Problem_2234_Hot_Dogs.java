/*
🇺🇸 English

In 2012 it was achieved a new world record in the famous Competition Hot Dogs Nathan: the champion, Joey Chestnut devoured 68 hot dogs in ten minutes, an increase amazing compared to 62 sandwiches devoured by the same Chestnut in 2011.

Nathan's Famous Corporation restaurant, located in Brooklyn, NY, is responsible for the competition. They produce delicious hot dogs, world famous, but when it comes math is they are not as good. They wish to be listed in the Guinness Book of Records, but they should fill out a form describing the basic facts of the competition. In particular, they must inform the average number of hot dogs consumed by participants during the competition.

You can help them? They promised to pay it with one of their tasty hot dogs. Given the total of hot dogs consumed and the total of participants in the competition, you should write a program to determine the average number of hot dogs consumed by participants.

Input
The input consists of a single line containing two integers H and P (1 ≤ H, P ≤ 1000) indicating respectively the total number of consumed hot dogs and the total number of participants in the competition.

Output
Your program should produce a single line with a rational number representing the average hot dogs consumed by the participants. The result should be written as a rational number with exactly two digits after the decimal point, rounded if necessary.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Em 2012 foi alcançado um novo recorde mundial na famosa Competição de Cachorros-Quentes do Nathan: o campeão, Joey Chestnut, devorou 68 cachorros-quentes em dez minutos, um aumento incrível em relação aos 62 sanduíches devorados pelo mesmo Chestnut em 2011.

O restaurante Nathan’s Famous Corporation, localizado no Brooklyn, NY, é o responsável pela competição. Eles produzem deliciosos cachorros-quentes, mundialmente famosos, mas quando o assunto é matemática eles não são tão bons. Eles desejam ser listados no Livro de Recordes do Guinness, mas para isso devem preencher um formulário descrevendo os fatos básicos da competição. Em particular, eles devem informar o número médio de cachorros-quentes consumidos pelos participantes durante a competição.

Você pode ajudá-los? Eles prometeram pagá-lo com um dos seus saborosos cachorros-quentes. Dados o número total de cachorros-quentes consumidos e o número total de participantes na competição, você deve escrever um programa para determinar o número médio de cachorros-quentes consumidos pelos participantes.

Entrada
A entrada consiste de uma única linha que contém dois inteiros H e P (1 ≤ H, P ≤ 1000) indicando respectivamente o número total de cachorros-quentes consumidos e o número total de participantes na competição.

Saída
Seu programa deve produzir uma única linha com um número racional representando o número médio de cachorros-quentes consumidos pelos participantes. O resultado deve ser escrito como um número racional com exatamente dois dígitos após o ponto decimal, arredondado se necessário.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;


public class Problem_2234_Hot_Dogs{
    public static void main(String[] args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double H = sc.nextDouble();if(H<1){sc.close();return;}
        double P = sc.nextDouble();if(P>1000){sc.close();return;}
        System.out.println(String.format("%.2f", H/P));

        sc.close();

    }
}
