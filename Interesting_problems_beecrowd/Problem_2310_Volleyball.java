/*
🇺🇸 English

A volleyball coach would like to keep statistics about his team. In every game he keeps track of the number of services, blocks and attacks of each player, as well as how many of these services, blocks and attacks were successful (scored points). Your program must show, with two decimal points what is the total percentage of services, blocks and attacks by the whole team that were successful.

Input
Input starts with the number of players N (1 ≤ N ≤ 100), followed by the names of each of these players. Below the name of each player, two rows of integers are presented. In the first row, the numbers represent the service, blocks and attack attempts (0 ≤ S,B,A ≤ 10000) by the specific player. In the second row there is the number of these services, blocks and attacks (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) that were successful.

Output
The output must contain the total percentage of successful services, blocks and attacks by the whole team, with two digits after the decimal point, as shown in the example.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe. A cada jogo, seu auxiliar anota quantas tentativas de saques, bloqueios e ataques cada um de seus jogadores fez, bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos). Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todo tiveram sucesso.

Entrada
A entrada é dada pelo número de jogadores N (1 ≤ N ≤ 100), seguido pelo nome de cada um dos jogadores. Abaixo do nome de cada jogador, seguem duas linhas com três inteiros cada. Na primeira linha S, B e A (0 ≤ S,B,A ≤ 10000) representam a quantidade de tentativas de saques, bloqueios e ataques e na segunda linha, S1, B1 e A1 (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) com o número de saques, bloqueios e ataques deste jogador que tiveram sucesso.

Saída
A saída deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2310_Volleyball{
    public static void main(String[]args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        if(N<1 || N>100){sc.close();return;}
       double saquesTotais=0;
       double saquesComSucesso=0;
       double bloqueiosTotais=0;
       double bloqueiosComSucesso=0;
       double ataquesTotais=0;
       double ataquesComSucesso=0;
        for(int j=0;j<N;j=j+1){
            String nome = sc.next();
            if(nome.length()<1){sc.close();return;}
            double S=sc.nextDouble();
            double B=sc.nextDouble();
            double A=sc.nextDouble();
            if(S<0 || B<0 || A<0 || S>10000 || B>10000 || A>10000){sc.close();return;}
            saquesTotais += S;
            bloqueiosTotais += B;
            ataquesTotais += A;
            double S1 = sc.nextDouble();
            double B1 = sc.nextDouble();
            double A1 = sc.nextDouble();
            if(S1<0 || S1>S || B1<0 || B1>B || A1<0 || A1>A){sc.close();return;}
            saquesComSucesso += S1;
            bloqueiosComSucesso += B1;
            ataquesComSucesso += A1;
        }
        double pontosDeSaques = (saquesComSucesso*100)/saquesTotais;
        double pontosDeBloqueios = (bloqueiosComSucesso*100)/bloqueiosTotais;
        double pontosDeAtaques = (ataquesComSucesso*100)/ataquesTotais;
        System.out.println("Pontos de Saque: "+String.format("%.2f",pontosDeSaques)+ " %.");
        System.out.println("Pontos de Bloqueio: "+String.format("%.2f",pontosDeBloqueios)+" %.");
        System.out.println("Pontos de Ataque: "+String.format("%.2f",pontosDeAtaques)+" %.");
        sc.close();
    }
}