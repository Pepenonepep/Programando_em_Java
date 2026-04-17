/*
🇺🇸 English

Iu-di-oh! is a card game really popular among kids! Every Iu-di-oh! player has his own deck containing many cards. Each card contains N attributes (such as power, speed, smartness, etc.). Attributes are numbered from 1 to N and are given as positive integers.

A match of Iu-di-oh! is always played by two players. At the beginning of the match, each player chooses exactly one card from his deck. Then, an attribute is randomly chosen. The player whose the chosen attribute is greater in the card he choose wins the match. If the such attribute is equal in both cards, there is a tie.

Marcos and Leonardo are in the big final of the Brazilian Iu-di-oh! championship. The great prize is a Dainavision (that is almost as good as a Plaisteition 2!). Given the deck of both players, the card each one chooses and the chosen attribute, determine the winner!

Input
The input contains several test cases. The first line of each test case contains an integer N (1 ≤ N ≤ 100), the number of attributes each card contains. The second line contains two integers M and L (1 ≤ M, L ≤ 100), the number of cards in Marcos’ and Leonardo’s deck, respectively.

Next M lines describe Marcos’ deck. His cards are numbered from 1 to M, and i-th line describes the i-th card. Each line contains N integers ai,1,ai,2,..., ai,N (1 ≤ ai,j ≤ 109). Integer ai,j indicates the j-th attribute of the i-th card.

Next L lines describe Leonardo’s deck. His cards are numbered from 1 to L and are described in the same way as Marcos’ deck.

Next line contains two integers CM and CL (1 ≤ CM ≤ M, 1 ≤ CL ≤ L), the cards chosen by Marcos and Leonardo, respectively. Finally, the last line contains an integer A (1 ≤ A ≤ N) indicating the chosen attribute.

The input ends with end-of-file (EOF).

Output
For each test case, print a line containing “Marcos” if Marcos wins the match, “Leonardo” if Leonardo wins the match, or “Empate” in the case of a tie (without quotes).

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Iu-di-oh! é um jogo de cartas que virou uma verdadeira febre entre os jovens! Todo jogador de Iu-di-oh! tem seu próprio baralho, contendo várias cartas do jogo. Cada carta contém N atributos (como força, velocidade, inteligência, etc.). Os atributos são numerados de 1 a N e são dados por inteiros positivos.

Uma partida de Iu-di-oh! é sempre jogada por dois jogadores. Ao iniciar a partida, cada jogador escolhe exatamente uma carta de seu baralho. Após as escolhas, um atributo é sorteado. Vence o jogador cujo atributo sorteado em sua carta escolhida é maior que na carta escolhida pelo adversário. Caso os atributos sejam iguais, a partida empata.

Marcos e Leonardo estão na grande final do campeonato brasileiro de Iu-di-oh!, cujo prêmio é um Dainavision (que é quase um Plaisteition 2!). Dados os baralhos de ambos, a carta escolhida por cada um e o atributo sorteado, determine o vencedor!

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém um inteiro N (1 ≤ N ≤ 100), o número de atributos de cada carta. A segunda linha contém dois inteiros M e L (1 ≤ M, L ≤ 100), o número de cartas no baralho de Marcos e de Leonardo, respectivamente.

As próximas M linhas descrevem o baralho de Marcos. As cartas são numeradas de 1 a M, e a i-ésima linha descreve a i-ésima carta. Cada linha contém N inteiros ai,1,ai,2,..., ai,N (1 ≤ ai,j ≤ 109). O inteiro ai,j indica o atributo j da carta i. As próximas L linhas descrevem o baralho de Leonardo. As cartas são numeradas de 1 e L e são descritas de maneira análoga.

A próxima linha contém dois inteiros CM e CL (1 ≤ CM ≤ M, 1 ≤ CL ≤ L), as cartas escolhidas por Marcos e Leonardo, respectivamente. Por fim, a última linha contém um inteiro A (1 ≤ A ≤ N) indicando o atributo sorteado.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma linha contendo “Marcos” se Marcos é o vencedor, “Leonardo” se Leonardo é o vencedor, ou “Empate” caso contrário (sem aspas).

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */
package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2542_IuDiOh{
    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int N=sc.nextInt();
            if(N<1 || N>100){
                sc.close();
                return;
            }
            int M=sc.nextInt();
            int L=sc.nextInt();
            if(M<1 || L>100){
                sc.close();
                return;
            }
        int[][] Marcosvetor=new int[M][N];
        int[][] Leonardovetor=new int[L][N];
        for(int l=0;l<M;l++){
            for(int c=0;c<N;c++){
                Marcosvetor[l][c] = sc.nextInt();
            }
        }
        for(int l=0;l<L;l++){
            for(int c=0;c<N;c++){
                Leonardovetor[l][c] = sc.nextInt();
            }
        }
        int Cm=sc.nextInt();
        int Cl=sc.nextInt();
        if(Cm<1 || Cm>M || Cl<1 || Cl>L){
            sc.close();
            return;
        }
        int A=sc.nextInt();
        int cartaDeMarcos = Marcosvetor[Cm-1][A-1];
        int cartaDeLeonardo= Leonardovetor[Cl-1][A-1];
        if(cartaDeMarcos>cartaDeLeonardo){
            System.out.println("Marcos");
        }
        else if(cartaDeMarcos<cartaDeLeonardo){
            System.out.println("Leonardo");
        }
         else {
            System.out.println("Empate");
        }
        }
       
        sc.close();
    }
}