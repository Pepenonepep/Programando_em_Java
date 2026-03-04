/*🇺🇸 English
Given two natural numbers N1 and N2, it is said that N1 is contiguous subsequence of N2 if in N1 appear all digits in the same order and contiguously. Create an program that reads two natural numbers and write if the first is a contiguous subsequence of the second.

Input
The input consists of several test cases and ends with the end of file (EOF). The first line of each entry is composed of anatural value N1 (1 <N1 <1010), the second line is composed of a value N2 (N1 <N2<1032).

Output
For each test case print the amount of contiguous subsequences and the position where the substring starts, if there is more of a subsequence, print where it started the last substring. If no there subsequence, print "Nao existe subsequencia" (that means no there subsequence). Show the result as the sample output.

Input Sample	Output Sample
78954
7895478954789547895447895478954
464133
1331646546874694
12
1231321455123214565423112

Caso #1:
Qtd.Subsequencias: 6
Pos: 27


Caso #2:
Nao existe subsequencia


Caso #3:
Qtd.Subsequencias: 3
Pos: 24

/* Class name must be "Main" for your solution to execute */

/* 🇧🇷 Portugues 

Dados dois números naturais N1 e N2, diz-se que N1 é subsequência contígua de N2 se todos os dígitos de N1 aparecem, na mesma ordem e de forma contígua, em N2. Crie uma aplicação que leia dois números naturais e diga se o primeiro é uma subsequência contígua do segundo.

Entrada
A entrada é composta por vários casos de teste e termina com final de arquivo (EOF). A primeira linha de cada entrada é composta por um valor natural N1(1 < N1 < 1010), a segunda linha é composta por um valor N2( N1 < N2 < 1032).

Saída
Para cada caso de teste imprima a quantidade de subsequências contíguas e a posição onde a subsequência é iniciada, caso exista mais de uma subsequência, imprima onde é iniciada a última subsequência. Caso não exista subsequência, imprima "Nao existe subsequencia". Mostre o resultado conforme o exemplo de saída.

Exemplo de Entrada	Exemplo de Saída
78954
7895478954789547895447895478954
464133
1331646546874694
12
1231321455123214565423112

Caso #1:
Qtd.Subsequencias: 6
Pos: 27


Caso #2:
Nao existe subsequencia


Caso #3:
Qtd.Subsequencias: 3
Pos: 24

/* O nome da classe deve ser "Main" para que a sua solução execute */


package Interesting_problems_beecrowd;
import java.io.*;
import java.util.*;

public class Problem_2126_Searching_Subsequences{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int casos = 1;
        
        while(sc.hasNext()) {
            
            String n1 = sc.next();
            String n2 = sc.next();
            
            int qtdSubsequencias = 0;
            int ultimaPosicao = -1;
            
            
            int tamanhoJanela = n1.length();
            
            
            for (int i = 0; i <= n2.length() - tamanhoJanela; i++) {
               
                String pedaco = n2.substring(i, i + tamanhoJanela);
                
                
                if (pedaco.equals(n1)) {
                    qtdSubsequencias++;
                    
                    ultimaPosicao = i + 1; 
                }
            }
            
           
            System.out.printf("Caso #%d:\n", casos);
            if (qtdSubsequencias == 0) {
                System.out.println("Nao existe subsequencia");
            } else {
                System.out.println("Qtd.Subsequencias: " + qtdSubsequencias);
                System.out.println("Pos: " + ultimaPosicao);
            }
            System.out.println(); 
            
            casos++;
        }
        
        sc.close();
    }


}