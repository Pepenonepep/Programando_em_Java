/*
🇺🇸 English

Analógimôn Go! is a very popular game. The players of this game are divided in three teams: Team Valor, Team Instinct and Team Mystic, which are led by their leaders, Kandera, Esparky and Blanque, respectively. Of course, you belong to one of these teams!

The leader of your team is being accused of cheating by incorrectly managing the candies the team receives from the Professor. This fact created a big controversy among the players in the team: some players state that the leader really cheated, must suffer an impeachment and must leave his position as a leader, while other players state that he did not cheat, that the accusation is false and he must keep leading the team.

To solve this situation, a poll will be held with all N players in your team. Each player must vote if the impeachment must or must not occur. If the number of votes for the impeachment is greater than or equal to 2/3 (two thirds) of the total number of players in the team, the leader will lost his position. Otherwise, the accusation will be filed and he will keep leading the team.

Given the votes of all players, determine the result of the poll.

Input
The input contains several test cases. The first line of each test case contains the integer N (1 ≤ N ≤ 105), the number of players in your team. Next line contains N integers v1, ..., vN (vi = 0 or 1), indicating the votes of each player. The value 1 indicates a vote for the impeachment, while value 0 indicates a vote against it.

The input ends with end-of-file (EOF).

Output
For each test case, print a single line containing the word impeachment if the leader must leave his position, or acusacao arquivada otherwise.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Analógimôn Go! é um jogo bastante popular. Os jogadores de Analógimôn Go! são divididos em três grandes times: Time Valor, Time Instinto e Time Místico, que são liderados pelos seus líderes Kandera, Esparky e Blanque, respectivamente. Naturalmente, você faz parte de um desses times!

O líder do seu time está sendo acusado de infringir as regras do jogo por gerenciar incorretamente os doces recebidos do Professor que são destinados ao time. Isto criou uma grande polêmica dentro da equipe: alguns jogadores defendem que o líder realmente agiu incorretamente e deve sofrer um impeachment e ser afastado de seu cargo, enquanto outros defendem que ele não infringiu as regras, que a acusação é inverídica e que ele deve continuar no cargo.

Para resolver a situação, uma votação será realizada entre todos os N jogadores do seu time. Cada jogador deverá votar se o impeachment deve ou não ocorrer. Se o número de votos favoráveis ao impeachment foi maior ou igual a 2/3 (dois terços) do total de jogadores, o líder será afastado. Caso contrário, a acusação é arquivada e ele continuará no cargo.

Dados os votos de todos os jogadores, determine o resultado da votação.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém o inteiro N (1 ≤ N ≤ 105), o número de jogadores em seu time. A próxima linha contém N inteiros v1, ..., vN (vi = 0 ou 1), indicando os votos dos jogadores. O valor 1 indica um voto favorável ao impeachment, enquanto o valor 0 indica um voto contrário ao mesmo.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma linha contendo a palavra impeachment se o líder deve ser afastado de seu cargo, ou acusacao arquivada caso contrário.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2540_Leader_is_Impeachment{
    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int N=sc.nextInt();
            if(N<1 || N>Math.pow(10,5)){
                sc.close();
                return;
            }
            int soma=0;
            for(int i=0;i<N;i++){
                int x=sc.nextInt();
                if(x!=1 && x!=0){
                    break;
                }
                soma+=x;
            } 
            double jt= (N*2.0)/3.0;
            if(soma>=jt){
            System.out.println("impeachment");
        }
        else{
            System.out.println("acusacao arquivada");
        }
        
    }
       
        sc.close();
}
}  