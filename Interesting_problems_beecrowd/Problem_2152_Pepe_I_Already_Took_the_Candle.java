/*
🇺🇸 English

One day, the great hero Chapolout helped a scientist who has created many inventions. One of these inventions is a system that opens the door secret laboratory. The system consists of removing a side door of the candlestick candle, that it opens, and to put the candle back to the chandelier, the door closes. But Chapolout found that the sail was just a pretend. In fact, the scientist assistant, called Pepe, that opened the lab door, inside. A while later, the system was modified to also run the initial project. A pressure sensor placed below the chandelier candle, so that the removal of the active sail system. This system issues a log report for every time the door opened or closed, but the log is quite confusing. Every record, three whole numbers are registered, and the hour and the minute the event occurred and a value that represents the door opened or closed at the time. Pepe asks for your help to convert the log data more readable data to it.

Write a program that, given a log record, this is converted into more readable texts.

Input
The first line contains the number of test cases. Each line of a test case has three integers H, M and O, the time being, the minutes of the occurrence, and the instance itself (zero if the door closed or the door opened).

Output
For each test case, print the time of the occurrence, in due form, followed by a space, a hyphen and a space, and the phrase "A porta abriu!" or "A porta fechou!" as the occurrence recorded.


/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Um dia, o grande herói Chapolout foi ajudar um cientista, que criou muitas invenções. Uma destas invenções é um sistema que abre a porta secreta do laboratório. O sistema consiste em retirar uma vela do candelabro do lado da porta, que a mesma se abre, e, ao colocar a vela de volta ao candelabro, a porta se fecha. Porém, Chapolout descobriu que a vela era só uma desculpa. Na verdade, o assistente do cientista, chamado Pepe, é que abria a porta do laboratório, por dentro. Um tempo depois, o sistema foi modificado, para funcionar igualmente ao projeto inicial. Colocaram um sensor de pressão embaixo da vela do candelabro, de modo que a retirada da vela ativa o sistema. Este sistema emite um relatório de log por cada vez que a porta abriu ou fechou, mas o log está bem confuso. A cada registro, três números inteiros são cadastrados, sendo a hora e o minuto que o evento ocorreu e um valor que representa se a porta abriu ou fechou naquele momento. Pepe pede a sua ajuda para converter os dados do log em dados mais legíveis para ele.

Escreva um programa que, dado um registro de log, este seja convertido em textos mais legíveis.

Entrada
A primeira linha contém a quantidade de casos de teste. Cada linha de um caso de teste possui três inteiros H, M e O, sendo a hora, o minuto da ocorrência, e a própria ocorrência (zero se a porta fechou ou um se a porta abriu).

Saída
Para cada caso de teste, imprima o horário da ocorrência, no devido formato, seguido de um espaço, um hífen e um espaço, e da frase “A porta abriu!” ou “A porta fechou!”, conforme a ocorrência registrada.

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2152_Pepe_I_Already_Took_the_Candle{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int H=sc.nextInt();
            if(H>=0 && H<=24){
            int M=sc.nextInt();
            if(M==60){
                    H++;
                    M=0;
                }
            int O=sc.nextInt();
            if(O==1){
              System.out.println(String.format("%02d:%02d - A porta abriu!",H,M));
            }
            else{
                 System.out.println(String.format("%02d:%02d - A porta fechou!",H,M));
            }    
        }
    }
        sc.close();
    }
    
}