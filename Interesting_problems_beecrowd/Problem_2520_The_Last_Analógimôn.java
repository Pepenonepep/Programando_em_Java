/*
🇺🇸 English

Analógimôn Go! is a very popular game. During his quest, the player travels across many cities capturing virtual little monsters called analógimôns. You just entered a city that contains the very last analógimôn you still don’t have!

The city can be described as a grid with N rows and M columns. You are at a given position in the city, while the last analógimôn is at another position in the same city. In one second, you can move (exactly) one position to the north, to the south, to the west or to the east. Considering that the analógimôn does not move at all, you task is to determine the minimum amount of time you need to reach it.

The following figure shows the first sample input, and shows a path that can be made in 5 seconds. There are other paths that can be used that take the same amount of time, but there is no path that takes less time than this one.



Input
The input contains several test cases. The first line of each test case contains two integers N and M (2 ≤ N, M ≤ 100), the number of rows and columns, respectively. Next N lines contains M integers each, describing the city. Integer 0 indicates an empty position; integer 1 indicates your position; and integer 2 indicates the analógimôn’s position. It is guaranteed that there is exactly one integer 1 and exactly one integer 2 in the test case, and that all other integers are equal to 0.

The input ends with end-of-file (EOF).

Output
For each test case, print a line containing the minimum time needed to reach the last analógimôn, in seconds.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Analógimôn Go! é um jogo bastante popular. Em sua jornada, o jogador percorre diversas cidades capturando pequenos monstrinhos virtuais, chamados analógimôns. Você acabou de chegar em uma cidade que contém o último analógimôn que falta para sua coleção!

A cidade pode ser descrita como um grid de N linhas e M colunas. Você está em uma dada posição da cidade, enquanto o último analógimôn está em outra posição da mesma cidade. A cada segundo, você pode se mover (exatamente) uma posição ao norte, ao sul, a leste ou a oeste. Considerando que o analógimôn não se move, sua tarefa é determinar o menor tempo necessário para ir até a posição do monstrinho.

A figura abaixo descreve o exemplo da entrada, e apresenta um caminho percorrido em 5 segundos. Outros caminhos percorridos no mesmo tempo são possíveis, mas não há outro caminho que pode ser percorrido em um tempo menor.



Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém dois inteiros N e M (2 ≤ N, M ≤ 100), o número de linhas e de colunas na cidade, respectivamente. As próximas N linhas contém M inteiros cada, descrevendo a cidade. O inteiro 0 indica uma posição em branco; o inteiro 1 indica a sua posição na cidade; o inteiro 2 indica a posição do analógimôn na cidade. É garantido que haverá exatamente um inteiro 1 e exatamente um inteiro 2 na descrição da cidade, e que os demais inteiros serão iguais a 0.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma linha contendo o menor tempo necessário para ir até o monstrinho, em segundos.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2520_The_Last_Analógimôn
{
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
	    
	    while(sc.hasNextInt()){
	        int N=sc.nextInt();
	        int M=sc.nextInt();
	        if(N<2 || M>100){
                sc.close();
	            continue;
	        }
	        int posicaoDaLinhado1 = 0;
	        int posicaoDaColuna1 = 0;
	        int posicaoDaLinhado2=0;
	        int posicaoDaColuna2=0;
	        int contUm=0,contDois=0;
	        int[][] vet = new int[N][M];
	        for(int l=0;l<N;l++){
	            for(int c=0;c<M;c++){
	                vet[l][c]=sc.nextInt();
	                if(vet[l][c]==1 && contUm!=1){
	                    posicaoDaLinhado1 = l;
	                    posicaoDaColuna1 = c;
	                    contUm++;
	                }
	                if(vet[l][c]==2&& contDois!=1){
	                    posicaoDaLinhado2=l;
	                    posicaoDaColuna2=c;
	                    contDois++;
	                }
	            }
	            if(contUm>1 || contDois>1){
                    sc.close();
	                return;
	            }
	        }
	        if(contUm==0 || contDois==0){
                sc.close();
	            return;
	        }
	     int distancia = Math.abs(posicaoDaLinhado1-posicaoDaLinhado2)+Math.abs(posicaoDaColuna1-posicaoDaColuna2);
         System.out.println(distancia);
	    }//fim while
	}
}