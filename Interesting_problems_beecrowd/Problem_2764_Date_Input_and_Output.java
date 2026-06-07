/*
🇺🇸 English

Your teacher would like to make a program with the following characteristics:

Read a date in the DD/MM/YY format;
Print the date in MM/DD/YY format;
Print the date in the YY/MM/DD format ;
Print the date in DD-MM-YY format.
Input
The input consists of several test files. In each test file there is one line. The line has the following DD/MM/YY format where DD, MM and YY are integers. As shown in the following input example.

Output
For each file in the entry, you have an output file. The output file has three lines according to procedures 2, 3, and 4. As shown in the following output example.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

O seu professor gostaria de fazer um programa com as seguintes características:

Leia uma data no formato DD/MM/AA;
Imprima a data no formato MM/DD/AA;
Imprima a data no formato AA/MM/DD;
Imprima a data no formato DD-MM-AA.
Entrada
A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem uma linha. A linha tem o seguinte formato DD/MM/AA onde DD, MM, AA são números inteiros. Conforme mostrado no exemplo de entrada a seguir.

Saída
Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem três linhas conforme os procedimentos 2, 3 e 4. Conforme mostra o exemplo de saída a seguir.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2764_Date_Input_and_Output {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String data = sc.next();
            int dia1 = ((data.charAt(0) - 48));
            int dia2 = (data.charAt(1) - 48);
            int mes1 = ((data.charAt(3) - 48));
            int mes2 = (data.charAt(4) - 48);
            int ano1 = ((data.charAt(6) - 48));
            int ano2 = (data.charAt(7) - 48);
            System.out.printf("%d%d/%d%d/%d%d\n", mes1, mes2, dia1, dia2, ano1, ano2);
            System.out.printf("%d%d/%d%d/%d%d\n", ano1, ano2, mes1, mes2, dia1, dia2);
            System.out.printf("%d%d-%d%d-%d%d\n", dia1, dia2, mes1, mes2, ano1, ano2);
        }
        sc.close();
    }

}