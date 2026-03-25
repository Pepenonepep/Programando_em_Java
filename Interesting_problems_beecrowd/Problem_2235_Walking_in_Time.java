/*
🇺🇸 English

Imagine you have a time machine that can be used up to three times, and every use of the machine you can choose to go back to the past or go to the future. The machine has three fixed loans; each credit represents a certain number of years, and can be used to get this amount of years for the past or for the future. You can make one, two or three trips, and each of these three credits can only be used once. For example, if the credits are 5, 12 and 9, you could decide to make two trips: go five years into the future and then go back nine years to the past. This way, you end four years in the past, in 2012. It could also make three trips, all going to the future, using the credits in any order, ending in 2042.

In this problem, given the values of the three machine credits, your program should say if is possible or not travel back in time and return to the present, making at least one trip and at most three trips; always using each of the three credit at most once.

Input
The input consists of a single line containing three credits A, B e C (1 ≤ A, B, C ≤ 1000).

Output
Your program should print a line containing the character 'S' if it possible travel in time and back to present, or 'N' if it's not possible.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Imagine que você tenha uma máquina do tempo que pode ser usada no máximo três vezes, e a cada uso da máquina você pode escolher voltar para o passado ou ir para o futuro. A máquina possui três créditos fixos; cada crédito representa uma certa quantidade de anos, e pode ser usado para ir essa quantidade de anos para o passado ou para o futuro. Você pode fazer uma, duas ou três viagens, e cada um desses três créditos pode ser usado uma vez apenas. Por exemplo, se os créditos forem 5, 12 e 9, você poderia decidir fazer duas viagens: ir 5 anos para o futuro e, depois, voltar 9 anos para o passado. Dessa forma, você terminaria quatro anos no passado, em 2012. Também poderia fazer três viagens, todas indo para o futuro, usando os créditos em qualquer ordem, terminando em 2042.

Neste problema, dados os valores dos três créditos da máquina, seu programa deve dizer se é ou não possível viajar no tempo e voltar para o presente, fazendo pelo menos uma viagem e, no máximo, três viagens; sempre usando cada um dos três créditos no máximo uma vez.

Entrada
A entrada consiste de uma linha contendo os valores dos três créditos A, B e C (1 ≤ A, B, C ≤ 1000).

Saída
Seu programa deve imprimir uma linha contendo o caracter “S” se é possível viajar e voltar para o presente, ou “N” caso contrário.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2235_Walking_in_Time {
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if(A<1 || B<1 || C<1 || A>1000 || B>1000 || C>1000){
            sc.close();
            return;
        } 
        if(A+B==C || A+C==B || C+B==A || A==B || A==C || B==C){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }

        sc.close();
        
    }    
}
