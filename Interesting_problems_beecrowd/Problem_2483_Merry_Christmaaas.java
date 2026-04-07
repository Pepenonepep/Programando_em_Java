/*
🇺🇸 English

You get so happy at Christmas that you want to scream at everyone: "Merry Christmas!!". To put all this happiness out, you wrote a program that, given an I index of happiness, your Christmas scream is more lively.

Input
The input consists of an integer I (1 < I ≤ 104) that represents that happiness index.

Output
The output consists of the phrase "Feliz natal!" ("Merry Christmas" in Portuguese), and the last a of the sentence is repeated I times. A line break is necessary after printing the sentence.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Você fica tão feliz no natal que tem vontade de gritar para todo mundo: "Feliz natal!!". Pra colocar toda essa felicidade pra fora, você montou um programa que, colocado um índice I de felicidade, seu grito de natal é mais animado.

Entrada
A entrada é composta por um inteiro I (1 < I ≤ 104) que representa o índice de felicidade.

Saída
A saída é composta pela frase "Feliz natal!", sendo repetidas I vezes a última letra a da frase. Uma quebra de linha é necessária após a impressão da frase.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.util.Locale;
import java.io.IOException;



public class Problem_2483_Merry_Christmaaas{
        public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        StringBuilder st = new StringBuilder();
        
        int i=sc.nextInt();
        
        if(i>1 && i<=Math.pow(10,4)){
            st.append("Feliz nat");
            for(int r=0;r<i;r++){
                st.append("a");
            }
            st.append("l!");
            System.out.println(st.toString());
            
        }
        
        sc.close();
    }
}  

