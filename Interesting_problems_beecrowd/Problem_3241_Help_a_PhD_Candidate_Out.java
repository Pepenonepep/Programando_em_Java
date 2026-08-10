/*
🇺🇸 English

Jon Marius forgot how to add two numbers while doing research for his PhD. And now he has a long list of addition problems that he needs to solve, in addition to his computer science ones! Can you help him?

On his current list Jon Marius has two kinds of problems: addition problems on the form ”a+b” and the ever returning problem ”P=NP”. Jon Marius is a quite distracted person, so he might have so solve this last problem several times, since he keeps forgetting the solution. Also, he would like to solve these problems by himself, so you should skip these.

Input
The first line of input will be a single integer N (1 ≤ N ≤ 1000) denoting the number of testcases. Then follow N lines with either ”P=NP” or an addition problem on the form ”a + b”, where a, b ∈ [0, 1000] are integers.

Output
Output the result of each addition. For lines containing “P=NP”, output “skipped”.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Jon Marius esqueceu como somar dois números enquanto fazia pesquisas para seu doutorado. E agora ele tem uma longa lista de problemas adicionais que precisa resolver, além dos de informática! Você pode ajudá-lo?

Em sua lista atual, Jon Marius tem dois tipos de problemas: problemas de adição na forma ”a + b” e o problema sempre recorrente ”P = NP”. Jon Marius é uma pessoa bastante distraída, então ele pode ter resolvido esse último problema várias vezes, já que sempre se esquece da solução. Além disso, ele gostaria de resolver esses problemas sozinho, portanto, você deve ignorá-los.

Entrada
A primeira linha de entrada será um único inteiro N (1 ≤ N ≤ 1000) denotando o número de casos de teste. Em seguida, siga N linhas com ”P = NP” ou um problema de adição na forma ”a + b”, onde a, b ∈ [0, 1000] são inteiros.

Saída
Produza o resultado de cada adição. Para linhas contendo “P = NP”, imprima “pulado”.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_3241_Help_a_PhD_Candidate_Out {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            if (line.equals("P=NP")) {
                System.out.println("skipped");
                continue;
            }
            if (line.contains("+")) {
                String[] numbers = line.split("\\+");
                int num1 = Integer.parseInt(numbers[0]);
                int num2 = Integer.parseInt(numbers[1]);
                System.out.println(num1 + num2);
            } else {
                String[] numbers = line.split("\\-");
                int num1 = Integer.parseInt(numbers[0]);
                int num2 = Integer.parseInt(numbers[1]);
                System.out.println(num1 - num2);
            }

        }
        sc.close();
    }
}