/*
🇺🇸 English

Your printer has been infected by a virus and is printing gibberish. After staring at several printed pages for a while, you realize that it is printing every line inside-out. In other words, the left half of each line is being printed starting in the middle of the page and proceeding out toward the left margin. Similarly, the right half of each line is being printed starting at the right margin and proceeding in toward the middle of the page.

For example, the line:
THIS LINE IS GIBBERISH

is being printed as:
I ENIL SIHTHSIREBBIG S

In the same way, the line " MANGOS " is being printed as "NAM  SOG".Your task is to unscramble a String line from its printed form back into its original order. You can assume that line contains an even number of characters.

Input
The input contains many test cases. The first line of input contains an integer N that indicates the number of test cases. Follow N lines, each one with a string with the maximum of 100 uppercase letters ('A'-'Z') and spaces (' '). that must be unscrambled from its printed form back into its original order, like example above.

Output
Each line of input must produce a line of output, with the decoded message, like example above.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois de olhar para várias páginas impressas por um tempo, você percebe que ele está imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada linha está sendo impressa a partir do meio da página até a margem esquerda. Do mesmo modo, a metade direita de cada linha está sendo impressa à partir da margem direita e prosseguindo em direção ao centro da página.

Por exemplo a linha:
THIS LINE IS GIBBERISH

está sendo impressa como:
I ENIL SIHTHSIREBBIG S

Da mesma foma, a linha " MANGOS " está sendo impressa incorretamente como "NAM  SOG". Sua tarefa é desembaralhar (decifrar) a string a partir da forma como ela foi impressa para a sua forma original. Você pode assumir que cada linha conterá um número par de caracteres.

Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Seguem N linhas, cada uma com uma frase com no mínimo 2 e no máximo 100 caracteres de letras maiúsculas e espaços que deverá ser desembaralhada (decifrada) à partir da forma impressa para a sua forma original, conforme especificação acima.

Saída
Para cada linha de entrada deverá ser impressa uma linha de saída com a frase decifrada, conforme a especificação acima.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Problem_1235_Inside_Out{
    public static void main(String[]args)throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            String Text = sc.nextLine();
            int t=Text.length();
            int partT=t/2;
            for(int j=partT-1;j>=0;j--){
                sb.append(Text.charAt(j));
            }
            for(int z=t-1;z>=partT;z--){
                sb.append(Text.charAt(z));
            }
            sb.append("\n");
            System.out.print(sb.toString());
        }
        
        sc.close();
    }
}