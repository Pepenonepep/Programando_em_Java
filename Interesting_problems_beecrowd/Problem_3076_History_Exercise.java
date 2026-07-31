/*
🇺🇸 English

After a very good history class - suceeding a very poor math class - some students from a specific school are in doubt on a simple problem. The teacher asked them about the numeric value (for the sake of simplicity, it must be in decimal and should contain arabic algarisms) of the century of a given year but, as only few students got it, she decided to ask you to help creating a program that does exactly this for educational purposes.

For those who not remember this history class, the century 1, for example, means the years among 1 and 100, the century 2 the years among 101 and 200, the century 3 the years among 201 and 300 and so on.

Input
The input contains several test cases and is finished by the end-of-file. Each line is a new test case and contains a single integer N (1 ≤ N ≤ 109), that means the value of some year that should be processed.

Output
For each test case, output a line with the value of the century of the corresponding year.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Após uma aula muito boa de história - sucedendo uma aula muito ruim de matemática - alguns alunos de uma determinada escola estão com dúvidas em um simples problema. A professora pediu que eles informassem o valor numérico (por simplicidade deve ser em decimal e em algarismos arábicos) do século de um determinado ano, mas como poucos alunos estavam acertando ela decidiu pedir sua ajuda para criar um programa que fizesse exatamente isso a fins educativos.

Para quem não se lembra desta aula de história, o século 1, por exemplo, compreende os anos entre 1 e 100, o século 2 os anos entre 101 e 200, o século 3 os anos entre 201 e 300 e assim por diante.  

Entrada
A entrada consiste em vários casos de teste e é terminada pelo final de arquivo (EOF). Cada linha é um novo caso de teste e contém um único inteiro N (1 ≤ N ≤ 109), que corresponde ao valor de algum ano que deve ser processado.

Saída
Para cada caso de teste, imprima uma única linha contendo o valor do século do ano correspondente.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_3076_History_Exercise {
    public static int result(int num) {
        if (num >= 1 && num <= 100) {
            return 1;
        }
        int re = 0;
        if (num % 100 == 0) {
            re = num / 100;
        } else {
            re = num / 100 + 1;
        }

        return re;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(result(num));
        }

        sc.close();
    }
}
