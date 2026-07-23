/*
🇺🇸 English

Vinicius takes his fitness very seriously, and every morning at 6 a.m., rain or shine, in summer and winter, he runs in a track around a pond. Along the race track there are N equally spaced signs. To not be discouraged from exercising, Vinicius counts the number of signs he has passed and checks to see if he has run at least 10%, at least 20%, . . . , at least 90% of his training.

Let’s help Vinicius by calculating for him the number of signs he needs to count to have completed at least 10%, 20%, . . . , 90% of his training, given the number of laps he wants to run and the total number of signs along the track

For example, suppose Vinicius wants to run 3 laps and the track has 17 signs. To ensure that he has run at least 30% of his training, he needs to count 16 signs. To guarantee at least 60%, he needs to count 31 signs.

Input
The input consists of a single line, which contains two integers, V and N (1 ≤ V, N ≤ 104 ), where V is the desired number of laps and N is the number of signs along the track.

Output
Your program must output a single line, containing nine integers, representing the numbers of signs that must be counted to ensure that at least 10%, 20%, . . . , 90% of the training has been completed, respectively.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Vinicius leva muito a sério seu condicionamento físico e, diariamente às 6h da manhã, chova ou faça sol, no verão e no inverno, ele corre no entorno de uma lagoa. Ao longo da pista de corrida existem N placas igualmente espaçadas. Para não desanimar do exercício, Vinicius conta o número de placas pelas quais ele já passou e verifica se ele já correu pelo menos 10%, pelo menos 20%, : : : , pelo menos 90% do percurso.

Vamos ajudar o Vinicius, calculando para ele o número de placas que ele precisa contar para ter completado pelo menos 10%, 20%, : : : , 90% da corrida, dados o número de voltas que ele pretende correr e o número total de placas ao longo da pista.

Por exemplo, suponhamos que Vinicius queira dar 3 voltas e o número de placas seja 17. Então, para garantir ter corrido pelo menos 30% do percurso, ele precisa contar 16 placas. Para garantir pelo menos 60%, ele precisa contar 31 placas.

Entrada
A entrada consiste de uma única linha que contém dois inteiros, V e N (1 ≤ V;N ≤ 104), onde V é o número pretendido de voltas e N é o número de placas na pista.

Saída
Seu programa deve produzir uma única linha com nove inteiros representando os números de placas que devem ser contadas para garantir o cumprimento, respectivamente, de 10%, 20%, : : : , 90% da meta.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2968_Hour_for_a_Run {
    public static double resultado(double totalDePlacas, double porcentagem){
        return Math.ceil((totalDePlacas*porcentagem)/100);
    }
	public static void main(String[] args) throws IOException{
	    Scanner sc = new Scanner(System.in);
	    double v = sc.nextDouble();
	    double n = sc.nextDouble();
	    for(int i=1;i<=9;i++){
	        if(i==9){
	            System.out.printf("%d\n",(int)resultado(v*n,i*10.0));
	        }
	        else {
	           System.out.printf("%d ",(int)resultado(v*n,i*10.0));
	       }
	    }    
	}
}