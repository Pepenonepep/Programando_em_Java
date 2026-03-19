/*
🇺🇸 English

The popularity of WiFi networks increased the loss rate of data being transferred, as several environment factors can easily compromise the data during traffic. The main goal of URI, Unity of Recovery of Information, is to identify and correct errors in messages being sent through WiFi networks.

The technique used by URI to identify errors is the parity test, which can be described as follows: Be S a message that is going to be sent from one device to another. Before S is sent, an extra bit B is added to the end of the binary representation of S. If S has an even number of bits of value 1, the extra bit B will have value 0. Otherwise, if S has an odd number of bits of value 1, B will have value 1. In this way, after the insertion of the bit B, the message S will have an even number of bits of value 1.

When the receiver gets the message S he counts how many bits of value 1 the message has. If the quantity is even, it means that the message was transferred succesfully. Otherwise, it means that the message had a modification and is not correct.

Your task is to write an algorithm that makes the insertion of the extra bit B in the message S, ensuring that after the insertion the message S has an even number of bits of value 1.

Input
Each test case consists of one line containing the message S, which has at least 1 and at most 100 bits.

Output
Print one line containing the message S with the extra bit B.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

A popularização das redes WiFi aumentou a taxa de perda de informações sendo transferidas, uma vez que diversos fatores do meio ambiente podem facilmente comprometer os dados durante o tráfego. A URI, Unidade de Recuperação de Informações, tem como principal objetivo identificar e corrigir erros em mensagens enviadas via redes WiFi.

A técnica utilizada pela URI para identificação de erros é o teste de paridade, o qual pode ser descrito da seguinte forma: Seja S uma mensagem que será enviada de um dispositivo para outro. Antes de S ser enviada, um bit extra B é adicionado no final da representação binária de S. Se a mensagem S tiver um número par de bits de valor 1, o bit extra B terá valor 0. Caso contrário, se S tiver um número ímpar de bits de valor 1, B terá valor 1. Desta forma, após a inserção do bit B, a mensagem S terá um número par de bits de valor 1.

Quando o destinatário recebe a mensagem S ele faz a contagem de bits de valor 1. Se a quantidade for par, significa que a mensagem chegou com sucesso. Caso contrário, significa que a mensagem sofreu uma alteração e não está correta.

Sua tarefa é escrever um algoritmo que faça a inserção do bit B na mensagem S, de forma que após a inserção a mensagem S tenha um número par de bits de valor 1.

Entrada
Cada caso de teste consiste em uma linha contendo a mensagem S, a qual consiste em no mínimo 1 e no máximo 100 bits.

Saída
Imprima uma linha contendo a mensagem S adicionada do bit extra B.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2176_Parity{
    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String S=sc.next();
        if(S.length()<1 || S.length()>100){
            sc.close();
            return;
        }
        String semZeros = S.replace("0","");
        int quantidadeDeI = semZeros.length();
        if(quantidadeDeI%2==0){
            System.out.println(S+"0");
        }
        else{
            System.out.println(S+"1");
        }

        sc.close();
    }
}