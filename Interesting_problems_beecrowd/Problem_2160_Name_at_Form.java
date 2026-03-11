/*
🇺🇸 English

Filling forms is a simple task. But it is necessary to check if the reserved space for data is large enough.

Your task is, given a text line, to indicate if it fits in an 80 characters length form.

Input
Input is a text line L (1 ≤ |L| ≤ 500).

Output
The output is given in a single line. It must be "YES" (without quotes) if the text line L is up to 80 characters long. If L has more than 80 characters, the output must be "NO".

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Preencher formulários é uma tarefa simples. Mas é preciso conferir se o espaço reservado para os dados é suficiente.

Sua tarefa é, dada uma linha de texto, indicar se ele cabe ou não cabe em um formulário com 80 caracteres.

Entrada
A entrada é uma linha de texto L (1 ≤ |L| ≤ 500).

Saída
A saída é dada em uma única linha. Ela deve ser "YES" (sem as aspas) se a linha de texto L tem até 80 caracteres. Se L tem mais de 80 caracteres, a saída deve ser "NO".

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2160_Name_at_Form{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        String texto=sc.nextLine();
        int tamanho=texto.length();
        if(tamanho>=1 && tamanho<=500){
        System.out.println(tamanho>80?"NO":"YES");
        }
        sc.close();
    }

}

