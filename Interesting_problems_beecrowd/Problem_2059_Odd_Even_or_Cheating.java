/*🇺🇸 English

A new game called Odd, Even or Cheating is currently (OEC) is now one of the most popular games in the world. This game was created when some friends had no internet connection, no cellphone, no computer, and pretty much nothing to do. The game is so popular that is going to happen the mundial championship of OEC and each country of the world will choose a representant to compete in this championship.

The game works like this: it's a two players game, the player 1 chooses between odd or even, then each player chooses a positive integer, if the sum of these number is even and player 1 chose even, then player 1 wins, if the sum is odd and player 2 chose odd, then player 2 wins. If player 1 chooses odd he/she wins when the sum is odd, and player 2 wins when the sum is even. Nothing new, right?

But now there are two more possible moves, player 1 can cheat to make sure that he/she wins independently of the result of the conventional odd or even game, and player 2 can accuse player 1 of cheating. With these additions in the game if player 1 cheats and player 2 accuses him/her of cheating player 2 wins, if player 2 don't accuse and player 1 is cheating then player 1 wins, if player 2 accuses the cheat, but player 1 is not cheating then player 1 wins, if player 1 isn't cheating and player 2 doesn't accuse player 1 then the game will be played as described previously.

You were hired by OECIO (Odd, Even or Cheating International Organization) to develop a program that given an OEC match it determines the winner.

Input
The input consists of one line with 5 integers: p, j1, j2, r, a. ( 0 ≤ p, r, a ≤ 1 e 1 ≤ j1, j2 ≤ 100).

p is the player 1 choice (if p = 1 then player 1 chooses even, if p = 0 then player 1 chooses odd). j1, j2, represents respectively the numbers that player 1 chose and the number that player 2 chose. r represents if player 1 cheated (if r = 1 then player 1 cheated, if r = 0 then he/she did not), a represents if player 2 accused player 1 of cheating (if a = 1 then he/she did, if a = 0 then he/she did not).

Output
Print "Jogador 1 ganha!" if player 1 won or "Jogador 2 ganha!" if player 2 won (no quotation marks).

/* Class name must be "Main" for your solution to execute */

/* 🇧🇷 Portugues 

Um novo jogo chamado Ímpar, Par ou Roubo (IPR) está se tornando muito popular. Esse jogo surgiu quando alguns amigos estavam sem conexão com a internet, sem celular, sem computador e bastante desocupados. O jogo está tão popular que irá acontecer um campeonato mundial de IPR e cada país do mundo irá escolher um representante para competir.

O jogo funciona da seguinte forma: dois jogadores participam, o jogador 1 escolhe entre par ou ímpar, então cada jogador escolhe um inteiro positivo, se a soma desses números for par e o jogador 1 tiver escolhido par então o jogador 1 ganha, se a soma for ímpar o jogador 2 ganha. Caso o jogador 1 tivesse escolhido ímpar ele ganharia se a soma fosse ímpar, caso a soma fosse par o jogador 2 ganharia. Nada de diferente de um jogo de par ou ímpar convencional, correto?

A diferença do jogo é que o jogador 1 pode roubar e assim assegurar sua vitória independentemente do resultado do jogo de ímpar ou par convencional, já o jogador 2 pode ou não acusar o jogador 1 de roubo. Com essas adições no jogo se o jogador 1 roubar e o jogador 2 acusar o roubo então o jogador 2 ganha, caso o jogador 2 não acuse o roubo e o jogador 1 roubar então o jogador 1 ganha, caso o jogador 2 acuse o roubo, mas o jogador 1 não tiver roubado então o jogador 1 ganha, se o jogador 1 não roubar e o jogador 2 não acusar o roubo o jogo segue como descrito anteriormente.

Você foi contratado pela OIIPR (Organização Internacional de Ímpar, Par ou Roubo) para desenvolver um programa que dada a escolha do jogador 1 entre par ou ímpar, os números escolhidos como jogada e as ações dos jogadores (roubo/acusação) mostre quem foi o vencedor.

Entrada
A entrada consite de uma única linha contendo 5 inteiros: p, j1, j2, r, a. ( 0 ≤ p, r, a ≤ 1 e 1 ≤ j1, j2 ≤ 100).

p representa a escolha do jogador 1 (se p = 1 então o jogador 1 escolheu par, se p = 0 então o jogador 1 escolheu ímpar). Os valores j1, j2, representam respectivamente o número escolhido pelo jogador 1 e pelo jogador 2. r representa se o jogador 1 roubou (se r = 1 então o jogador 1 roubou, se r = 0 então o jogador 1 não roubou), a representa se o jogador 2 acusou o roubo (se a = 1 então o jogador 2 acusou o jogador 1 de roubo, se a = 0 então ele não acusou o jogador 1 de roubo).

Saída
Imprima "Jogador 1 ganha!" se o jogador 1 ganhou ou "Jogador 2 ganha!" se o jogador 2 ganhou (sem as aspas).

/* O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2059_Odd_Even_or_Cheating{
    public static void main(String[] args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt(), j1=sc.nextInt(), j2=sc.nextInt(), r=sc.nextInt(), a=sc.nextInt();
        if( p < 0 || a < 0 || r<0 || p>1 || a > 1 || p>1 || j1<1 || j2>100){
            sc.close();
            return;
        }
        else{
            if(p==1){
                if(r==0 && a==0){
                    int soma = j1+j2;
                    if(soma%2==0){
                        System.out.println("Jogador 1 ganha!");
                    }
                    else{
                        System.out.println("Jogador 2 ganha!");
                    }
                }
                else if((r==1 && a==0) || (r==0 && a==1)){
                    System.out.println("Jogador 1 ganha!");
                }
                else{
                    System.out.println("Jogador 2 ganha!");
                }
            }
            else{
                if(r==0 && a==0){
                    int soma = j1+j2;
                    if(soma%2==0){
                        System.out.println("Jogador 2 ganha!");
                    }
                    else{
                        System.out.println("Jogador 1 ganha!");
                    }
                }
                else if((r==1 && a==0) || (r==0 && a==1)){
                    System.out.println("Jogador 1 ganha!");
                }
                 else{
                    System.out.println("Jogador 2 ganha!");
                }
            }
        }


        sc.close();
    }
}