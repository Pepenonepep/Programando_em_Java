/*
🇺🇸 English

Lately, several people are going to Dr. Cláudia Café com Leite to know if they are consuming the recommended daily amount of vitamin C. This exhausted her so she asked you to write a program for her that, given the daily intake of foods rich in vitamin C by a person, returns how much this person has to consume more or less to achieve the recommended amount.

In order to do such, you can use the following table:

Foods rich in Vitamin C	    Amount of Vitamin C
suco de laranja         	    120 mg
morango fresco	                85 mg
mamao	                        85 mg
goiaba vermelha	                70 mg
manga	                        56 mg
laranja	                        50 mg
brocolis	                    34 mg
Consider the recommended daily intake of vitamin C is between 110 mg and 130 mg, inclusive.

Input
Each test case consists of an integer T (1 ≤ T ≤ 7) indicating that the person daily intakes T foods among the 7 foods from the table. The next T lines with an integer N and a food (lowercase and no blank spaces) indicates that the person intakes an amount N of that food. Read input until T = 0.

Output
For each test case (T), if the intake exceeds the recommended limit, print "Menos X mg", in which X represents how much less the person must consume to reach the recommended limit; if the intake doesn't reach the recommended amount, print "Mais X mg", in which X represents how much more the person must consume to reach the recommended amount; if the intake is between the recommended amount range, print "X mg", in which X represents the daily amount of vitamin C intaken by the person.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Ultimamente, diversas pessoas estão indo à Dra. Cláudia Café com Leite para saber se estão consumindo a quantidade recomendada diária de vitamina C. Isso tem a deixado exausta, e por isso ela lhe pediu para escrever um programa que, dado o consumo diário de alimentos ricos em vitamina C por uma pessoa, indique o quanto essa pessoa deve consumir a mais ou a menos para atingir o recomendado.

Para tal, você poderá utilizar a tabela a seguir:

Alimentos ricos em Vitamina C	Quantidade de Vitamina C
suco de laranja	                        120 mg
morango fresco	                        85 mg
mamao	                                85 mg
goiaba vermelha	                        70 mg
manga	                                56 mg
laranja	                                50 mg
brocolis	                            34 mg
Considere que o consumo diário recomendado de vitamina C está entre 110 mg e 130 mg, inclusive.

Entrada
Cada caso de teste é composto um inteiro T (1 ≤ T ≤ 7) indicando que a pessoa consome diariamente T alimentos entre os 7 alimentos da tabela. Em seguida, haverá T linhas com um inteiro N e um alimento (totalmente em caixa baixa e sem acentuações), indicando que a pessoa consome uma quantidade N daquele alimento. A entrada termina com T = 0.

Saída
Para cada caso de teste (T), se o consumo ultrapassou o limite recomendado, imprima "Menos X mg", em que X representa a quantidade a menos a ser consumida para atingir o limite recomendado; se o consumo não atingiu o recomendado, imprima "Mais X mg", em que X representa a quantidade a mais para atingir o recomendado; se o consumo está dentro do intervalo recomendado, imprima "X mg", em que X representa a quantidade consumida diariamente pela pessoa.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;
import java.util.Scanner;
import java.util.Locale;
import java.io.IOException;

public class Problem_2486_C_Mais_ou_Menos{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        while (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            if (t == 0) break;

            int mgTotal = 0;

            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                sc.skip("\\p{javaWhitespace}*");
                String alimento = sc.nextLine();

                if (alimento.equals("suco de laranja"))      mgTotal += 120 * n;
                else if (alimento.equals("morango fresco"))  mgTotal += 85 * n;
                else if (alimento.equals("mamao"))           mgTotal += 85 * n;
                else if (alimento.equals("goiaba vermelha")) mgTotal += 70 * n;
                else if (alimento.equals("manga"))           mgTotal += 56 * n;
                else if (alimento.equals("laranja"))         mgTotal += 50 * n;
                else if (alimento.equals("brocolis"))        mgTotal += 34 * n;
            }
            if (mgTotal < 110) {
                System.out.println("Mais " + (110 - mgTotal) + " mg");
            } else if (mgTotal > 130) {
                System.out.println("Menos " + (mgTotal - 130) + " mg");
            } else {
                System.out.println(mgTotal + " mg");
            }
        }
        sc.close();
    }
}


