/*
🇺🇸 English

In the game The Witcher, Sigismund Dijkstra is the leader of the Redanian Secret Service, because of this he is one of the most important people in the world.

In addition Dijkstra has a large treasure, which has several types of jewelry.

Dijkstra is very curious to know how many different types of jewelry his treasure has.

Knowing that you are the best programmer on the continent Dijkstra hired you to check how many different types of jewelry he has in his treasure.

Input
The entry consists of several lines and each contains a string describing one of Dijkstra's jewels. This string is composed only of the characters '(' and ')', the sum of the length of all the string does not exceed 106.

Output
Print how many different kinds of jewelry Dijkstra has.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

No jogo O Bruxo, Sigismund Dijkstra é o líder do Serviço Secreto Redaniano, por causa disso ele é uma das pessoas mais importantes do mundo.

Além disso Dijkstra possui um grande tesouro, o qual possui diversos tipos de jóias.

Dijkstra está muito curioso para saber quantos tipos de jóias diferentes seu tesouro possui.

Sabendo que você é o melhor programador do continente Dijkstra te contratou para verificar quantos tipos de jóias distintas ele tem em seu tesouro.

Entrada
A entrada consiste de várias linhas e cada uma contém uma string que descreve uma das jóias de Dijkstra. Essa string é composta apenas dos caracteres '(' e ')', a soma do tamanho de todas as string não excede 106.

Saída
Imprima quantos tipos de jóias distintas Dijkstra tem.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.IOException;

public class  Problem_2653_Dijkstra {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		Set<String> listJewels = new HashSet<>();
	
	    while(sc.hasNext()){
	        String jewel = sc.nextLine();
	        
	        if(!jewel.trim().isEmpty()){
	            listJewels.add(jewel);
	        }
	    }
	    System.out.println(listJewels.size());
		sc.close();
	}
}