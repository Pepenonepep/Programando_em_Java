/* 
🇺🇸 English

Like many Computer Science students, you like to play the most popular electronic games nowadays: Liga of Legendas (LOL) and Contra-Strike (CS). Although you also play LOL, what you really like to do is to use all your skills to defeat the terrorist forces in Contra-Strike! You are so good at combating terror that you are often compared with the president of the USA who announced the capture of a famous real-life terrorist.

Since your skills are beyond compare, videos of your matches (your famous gameplays) appears often in UFPR Gaming, a webpage that publishes gameplays from the students of our university.

The page publishes many videos every day. Thus, it may be hard to find and count all your videos published already. However, since you are also a programmer, you decided to write a computer program to help you with this task. Given the list of gameplays published by the page, determine how many of them are videos of you playing Contra-Strike.

Input
The input contains several test cases. The first line of each test case contains two integers N and I (1 ≤ N ≤ 104, 1000 ≤ I ≤ 9999), the number of gameplays published by the page and your university ID, respectively.

The next N lines describe the published videos. Each gameplay is described by two integers i and j (1000 ≤ i ≤ 9999, j=0 or 1), where i is the author’s university ID and j=0 if the gameplay is a Contra-Strike one, or j=1 if it is a Liga of Legendas one.

The input ends with end-of-file (EOF).

Output
For each test case, print a single line containing a number indicating how many videos of you playing Contra-Strike were published by the page.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Assim como a maioria dos estudantes de computação, você vive jogando os jogos eletrônicos mais populares atualmente: Liga of Legendas (LOL) e Contra-Strike (CS). Embora você também jogue LOL, você gosta mais é de usar todas suas grandes habilidades para derrotar a equipe terrorista em Contra-Strike! Você é tão empenhado no combate ao terror que é frequentemente comparado com o presidente dos EUA que anunciou a captura e derrota de um grande terrorista da vida real.

Por ser bastante habilidoso, os vídeos de suas jogadas (seus famosos gameplays) vivem aparecendo na Jogatina UFPR, uma página na internet que publica gameplays de alunos da universidade.

A página publica muitos vídeos diariamente. Por isso, pode ser dificil encontrar e contar todos os seus vídeos na página. Entretanto, como você também é programador, você decidiu escrever um programa para auxiliá-lo nesta tarefa. Dada a lista de gameplays publicados na página, determine quantos gameplays seus de Contra-Strike foram publicados.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém dois inteiros N e I (1 ≤ N ≤ 104, 1000 ≤ I ≤ 9999), o número de gameplays publicados na página e o seu identificador na universidade, respectivamente.

As próximas N linhas descrevem os gameplays publicados. Cada gameplay é descrito por dois inteiros i e j (1000 ≤ i ≤ 9999, j=0 ou 1), onde i é o identificador na universidade do autor do gameplay, e j=0 se o gameplay é de Contra-Strike, ou j=1 se é de Liga of Legendas.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma única linha com um número indicando quantos gameplays seus de Contra-Strike foram publicados na página.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Problem_2543_UFPR_Gaming {
    public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		  
		  while(sc.hasNextInt()){  
		 int N=sc.nextInt();
		 int I = sc.nextInt();
		 int soma=0;
		 if(N<1 || N>Math.pow(10,4) || I<1000 || I>9999){
		     sc.close();
		     return;
		 }
		 for(int casos=0;casos<N;casos++){
		     int i=sc.nextInt();
		     int j=sc.nextInt();
		     if(i<1000 || i>9999 || j<0 || j>1){
		         sc.close();
		         return;
		     }
		     if(i==I && j==0){
		         soma+=1;
		     }
		 }
		 System.out.println(soma);
		
		}
		sc.close();
	}
}
