/*
🇺🇸 English

Kage Bunshin no Jutsu (or the "Shadow Clone Technique", for English speakers) is a ancient technique often used during ninja battles.

When used, the technique creates a copy identical to its user. That way, if a given ninja uses the technique, a copy of that ninja comes to existence, so there are two of the same ninja (the original one and his copy).

The technique is always executed by all ninjas existing in the moment. That way, if the technique is used again, there will be four ninjas in total (the two previous ones and two new copies), and so on.

There are N copies of a given ninja (including the original one). Your task is to determine how many times the technique was used.

Input
The input contains several test cases. Each test case contains a line with the number N (1 ≤ N ≤ 106). It is guaranteed that N is such that it is possible to get exactly N copies of a ninja (including the original one).

The input ends with end-of-file (EOF).

Output
For each test case, print a line with the number of times the technique was used.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

O Kage Bunshin no Jutsu (ou a "técnica dos clones de sombra", para os lusofalantes) é uma técnica milenar bastante utilizada em batalhas ninja.

Quando utilizada, a técnica cria uma cópia idêntica de seu usuário. Desta forma, se um dado ninja usa a técnica, passam a existir dois destes ninjas (o original e a cópia).

A técnica sempre é executada por todos os ninjas existentes no momento. Desta forma, se a técnica for utilizada novamente, passam a existir quatro ninjas idênticos ao original (os dois anteriores e mais duas cópias), e assim por diante.

Há N cópias de um dado ninja (incluindo o original). Sua tarefa é determinar quantas vezes a técnica foi utilizada.

Entrada
A entrada contém vários casos de teste. Cada caso contém uma linha com o número N (1 ≤ N ≤ 106). É garantido que o valor de N é tal que é possível obter exatamente N cópias de um ninja utilizando a técnica (incluindo o original).

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma linha contendo o número de vezes que a técnica foi utilizada.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2544_Kage_Bunshin_no_Jutsu {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int e = (int) (Math.log(N) / Math.log(2));

            System.out.println(e);

        }

        sc.close();
    }
}