/*
🇺🇸 English

Twitter microblog is known for restricting its posts at 140 characters. Your task is to check if a text will fit in a tweet.

Input
Input is a text line T (1 ≤ |T| ≤ 500).

Output
The output is given in a single line. It must be "TWEET" (without quotes) if the text line T is up to 140 characters long. If T has more than 140 characters, the output must be "MUTE".

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

O microblog Twitter é conhecido por limitar as postagens em 140 caracteres. Conferir se um texto vai caber em um tuíte é sua tarefa.

Entrada
A entrada é uma linha de texto T (1 ≤ |T| ≤ 500).

Saída
A saída é dada em uma única linha. Ela deve ser "TWEET" (sem as aspas) se a linha de texto T tem até 140 caracteres. Se T tem mais de 140 caracteres, a saída deve ser "MUTE".



/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2165_Twitting {
    public static void main(String[]args)throws IOException{
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String T= sc.nextLine();
        if(T.length()<1 || T.length()>500){
            sc.close();
            return;
        }
        if(T.length()<=140){
            System.out.println("TWEET");
        }
        else{
            System.out.println("MUTE");
        }

        sc.close();
    }
}
