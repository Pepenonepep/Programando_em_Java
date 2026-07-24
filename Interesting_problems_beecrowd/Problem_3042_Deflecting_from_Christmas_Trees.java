/*
🇺🇸 English

Santa Claus loves mobile games, especially if they have a Christmas theme. Santa has just installed a new game for his smartphone. The game is basically a character running endlessly on a track consisting of three lanes, having to change lanes to deflect obstacles (Christmas trees) appearing on the way. The character always starts a game on the middle lane. Santa needs tapping once on the left side of the smartphone screen so the character moves a lane to the left, or a touch on the right side to move a lane to the right. That is, if the character is on the leftmost lane, he needs 2 touches on the right side of the screen to get to the rightmost lane.
Although it sounds easy, Santa is having a hard time staying alive for a long time. One thing he noticed during the game is that whenever there are obstacles, only one track is free to cross, while the other two have Christmas trees blocking paths. As you guys are great friends, he asked you to write a program that minimizes the number of touches on the smartphone, so that he can walk M meters through the game.

Input
The input consists of several test cases. The first line of a test case contains an integer M (0 ≤ M < 10000), representing the distance, in meters, that Santa wants to play. The next M lines contain 3 integers L, C, R each, representing the left, center and right lane, respectively where 0 ≤ L,C,R ≤ 1. The lanes contain only the number 0, if there is no obstacle, and the number 1, if there is a Christmas tree on the lane. It is guaranteed at least one lane will be free for crossing. Assume Santa can always play fast enough to go left to right, or right to left from one entrance to the next. The end of the input is indicated by a line containing only one zero.

Output
For each test case, your program should print a single line containing the fewest touches on the smartphone Santa must make to travel the desired distance by deflecting all obstacles.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Papai Noel adora jogos de celular, especialmente se forem com temas natalinos. Ele acaba de instalar um novo jogo para seu celular. O jogo consiste em um personagem correndo infinitamente em um caminho composto de três pistas, tendo que trocar de pista para desviar de obstáculos (árvores de natal) que aparecem no caminho. O personagem sempre começa um jogo na pista do meio, sendo necessário que Papai Noel toque uma vez do lado esquerdo da tela do celular para o personagem se deslocar uma pista para a esquerda e um toque do lado direito da tela para se deslocar uma pista para o lado direito. Ou seja, se o personagem estiver na pista mais à esquerda, precisará de 2 toques do lado direito para chegar até a pista mais à direita.
Apesar de parecer simples, Papai Noel está tendo dificuldades em permanecer vivo por muito tempo. Uma coisa que ele notou durante o jogo é que, sempre que há obstáculos, somente uma das pistas está livre para atravessar, enquanto que as outras duas possuem árvores de natal bloqueando os caminhos. Como vocês são grandes amigos, ele pediu sua ajuda para escrever um programa que minimize o número de toques necessários na tela para que ele consiga percorrer M metros no jogo.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de um caso de teste contém um inteiro M (0 ≤ M < 10000), representando a distância, em metros, que Papai Noel deseja jogar. As próxima M linhas contém, cada uma, 3 inteiros L,C,R representando a pista da esquerda, centro e direita, respectivamente (0 ≤ L,C,R ≤ 1). As pistas contém apenas o número 0, caso não tenha nenhum obstáculo, e o número 1, caso haja uma árvore de natal na pista. É garantido que ao menos uma pista sempre estará livre para o personagem passar. Assuma que Papai Noel sempre consegue tocar rápido o suficiente na tela para sair da esquerda até a direita, ou da direita até a esquerda de uma entrada até a outra. O final da entrada é indicado por uma linha que contém apenas um zero.

Saída
Para cada caso de teste, seu programa deve imprimir uma única linha contendo o menor número de toques na tela que Papai Noel deve fazer para percorrer a distância desejada desviando de todos os obstáculos.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_3042_Deflecting_from_Christmas_Trees{
    public static String mudancaDePosicao(String posNoel, int resultado){
       if (posNoel.equals("mid")) {
            if (resultado == 0) return "mid";
            if (resultado == 21) return "left"; 
            return "right";
        } else if (posNoel.equals("left")) {
            if (resultado == 0) return "left";
            if (resultado == 1) return "mid";
            return "right";
        } else { 
            if (resultado == 0) return "right";
            if (resultado == 1) return "mid";
            return "left";
        }
    }
    public static int resultado(String posNoel,int l, int c, int r){
       if (posNoel.equals("mid")) {
            if (c == 0) return 0;
            if (l == 0) return 21; 
            return 1;              
        }
        if (posNoel.equals("left")) {
            if (l == 0) return 0;
            if (c == 0) return 1;
            return 21;  
        }
        if (r == 0) return 0;
        if (c == 0) return 1;
        return 22;
    }
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
		    int soma=0;
		    String posNoel = "mid"; 
		    int M=sc.nextInt();
		    if(M==0){
		        break;
		    }
		    for(int i=0;i<M;i++){
		        int l=sc.nextInt();
		        int c=sc.nextInt();
		        int r=sc.nextInt();
		        
		       int res = resultado(posNoel, l, c, r);
                if (res == 21 || res == 22) {
                    if (posNoel.equals("mid")) {
                        soma += 1;
                    } else {
                        soma += 2;
                    }
                } else {
                    soma += res;
                }

                posNoel = mudancaDePosicao(posNoel, res);
		    }
		    System.out.println(soma);
		}
		sc.close();
	}
}