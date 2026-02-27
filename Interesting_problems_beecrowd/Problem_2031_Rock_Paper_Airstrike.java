/*Rock, Paper, Airstrike is a very popular children’s game, in which two or more children form a circle and do hand gestures in an attempt to get the victory. The rules are surprisingly complex for a children’s game, but it’s still quite popular around the world.

The games are very simple. Players can choose between the sign of a Rock (fist), the sign of a paper (an open palm), and the signal to the Air Attack (like the paper, but with only the thumb and little finger extended).



A game with two players have the following rules to determine a winner:

Airstrike vs. Rock: In this case, the player with Airstrike defeats the player with Rock for obvious reasons.
Rock vs. Paper: In this case the player with Rock defeats the one with Paper, because Rock hurts more.
Paper vs. Airstrike: In here Airstrike wins because Airstrike always wins and Paper is pathetic.
Paper vs. Paper: In this variation both players win because Paper is useless and no one facing Paper can lose.
Rock vs. Rock: To this case there is no winner because it depends on what the players decide to do with the Rock and usually do nothing at the end.
Airstrike vs. Airstrike: When this happens all players lose due to Mutual Annihilation.
Your task is to write a program that given the choice of two players tell who won the game.

Input
The input consist of N (1 ≤ N ≤ 1000) test cases. N should be read in the first line of input. Each test case is composed of two lines each containing a string. The first string is the sign chosen by Player 1 and the second string is the sign chosen by the Player 2. These string can be:

“ataque”: to represents Airstrike
“pedra”: to represents Rock
“papel”: tp represents Paper
Output
The output must be contain:

“Jogador 1 venceu”: if Player 1 has won the game
“Jogador 2 venceu”: if Player 2 has won the game
“Ambos venceram”: if the both have won the game
“Sem ganhador”: if there is no winner
“Aniquilacao mutua”: if Mutual Annihilation occurs
Each output of a test case must be in one line.

*/

/*
Class name must be "Main" for your solution to execute
 */

/*
Pedra, Papel, Ataque Aéreo é um jogo infantil muito popular, em que duas ou mais crianças formam um círculo e fazem gestos com a mão na tentativa de obter a vitória. As regras são surpreendentemente complexas para um jogo de crianças, mas mesmo assim é bastante popular por todo o mundo.

As partidas são muito simples. Os jogadores podem escolher entre o sinal de uma Pedra (o punho), o sinal de um Papel (a palma aberta), e o sinal para o Ataque Aéreo (igual o do Papel, mas com apenas o polegar e o mindinho estendidos).



Uma partida, com dois jogadores, possuem as seguintes regras para se definir um vencedor:

Ataque Aéreo vs. Pedra: Neste caso, o jogador com o Ataque Aéreo derrota o jogador com a Pedra, por razões óbvias.
Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel, porque a Pedra machuca muito mais.
Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, porque Ataque Aéreo sempre ganha e o Papel é patético.
Papel vs. Papel: Nesta variação, ambos os jogadores ganham, porque o Papel é inútil e ninguém que enfrenta o Papel pode perder.
Pedra vs. Pedra: Para este caso não há ganhador, porque depende do que os jogadores decidem fazer com a Pedra e normalmente não fazem nada.
Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, todos os jogadores perdem, devido a Aniquilação Mútua.
Sua tarefa é escrever um programa que, dada as escolhas de dois jogadores, informe quem venceu o jogo.

Entrada
A entrada consiste de N (1 ≤ N ≤ 1000) casos de teste. N deve ser lido na primeira linha da entrada. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. A primeira string representa o sinal escolhido pelo jogador 1 e a segunda string representa o sinal escolhido pelo jogador 2. Essas strings podem ser:

“ataque”: para representar o Ataque Aéreo
“pedra”: para representar a Pedra
“papel”: para representar o Papel
Saída
A saída deve conter o seguinte:

“Jogador 1 venceu”: se o Jogador Um tiver vencido a partida
“Jogador 2 venceu”: se o Jogador Dois tiver vencido a partida
“Ambos venceram”: se os dois jogadores tiverem vencido a partida
“Sem ganhador”: se não houver ganhador
“Aniquilacao mutua”: se ocorrer Aniquilação Mútua
Cada saída de um caso de teste deve estar em uma linha.
 */

/*
 O nome da classe deve ser "Main" para que a sua solução execute
*/



package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2031_Rock_Paper_Airstrike {
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        if(N<1 || N>1000){
            sc.close();
            return;
        }
        for(int i=0;i<N;i++){
            String escolha1 = sc.next();
            if(!escolha1.equalsIgnoreCase("PEDRA") && !escolha1.equalsIgnoreCase("PAPEL") && !escolha1.equalsIgnoreCase("ATAQUE")){
            sc.close();    
            return;    
            }
            String escolha2 = sc.next();
            if(!escolha2.equalsIgnoreCase("PEDRA") && !escolha2.equalsIgnoreCase("PAPEL") && !escolha2.equalsIgnoreCase("ATAQUE")){
                sc.close();
                return;
            }
            if(escolha1.equalsIgnoreCase("ATAQUE")){
                if(escolha2.equalsIgnoreCase("PEDRA") || escolha2.equalsIgnoreCase("PAPEL")){
                    System.out.println("Jogador 1 venceu");
                }
                else{
                    System.out.println("Aniquilacao mutua");
                }
            }
           else if(escolha2.equalsIgnoreCase("ATAQUE")){
                if(escolha1.equalsIgnoreCase("PEDRA") || escolha1.equalsIgnoreCase("PAPEL")){
                    System.out.println("Jogador 2 venceu");
                }
                else{
                    System.out.println("Aniquilacao mutua");
                }
            }
            else if(escolha1.equalsIgnoreCase("PEDRA")){
                if(escolha2.equalsIgnoreCase("PAPEL")){
                    System.out.println("Jogador 1 venceu");
                }
                else if(escolha2.equalsIgnoreCase("ATAQUE")){
                    System.out.println("Jogador 2 venceu");
                }
                else {
                    System.out.println("Sem ganhador");
                }
            }
            else if(escolha2.equalsIgnoreCase("PEDRA")){
                if(escolha1.equalsIgnoreCase("PAPEL")){
                    System.out.println("Jogador 2 venceu");
                }
                else if(escolha1.equalsIgnoreCase("ATAQUE")){
                    System.out.println("Jogador 1 venceu");
                }
                else {
                    System.out.println("Sem ganhador");
                }
            }
            else if(escolha1.equalsIgnoreCase("PAPEL")){
                if(escolha2.equalsIgnoreCase("PEDRA") || escolha2.equalsIgnoreCase("ATAQUE")){
                    System.out.println("Jogador 2 venceu");
                }
                else {
                    System.out.println("Ambos venceram");
                }
            }
             else if(escolha2.equalsIgnoreCase("PAPEL")){
                if(escolha1.equalsIgnoreCase("PEDRA") || escolha1.equalsIgnoreCase("ATAQUE")){
                    System.out.println("Jogador 1 venceu");
                }
                else {
                    System.out.println("Ambos venceram");
                }
            }
            
        }
        
     sc.close();   
    }
}
