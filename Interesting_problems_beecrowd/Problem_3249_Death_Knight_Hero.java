/*
🇺🇸 English

There once was a champion of WoW

Arthasdk the name he was bestowed

He Death Gripped you to his side

His Chains of Ice stopped your stride

And Obliterates made you say ”OWW!”

But one day our hero got puzzled

His Death Grip totally fizzled

In his darkest despair

He could barely hear

”OMG NOOB u Chains of Iced than u Death Gripped”

Input
You are given a recording of the abilities our hero used in his battles.

The first line of input will contain a single integer n (1 ≤ n ≤ 100), the number of battles our hero played.

Then follow n lines each with a sequence of ki (1 ≤ ki ≤ 1000) characters, each of which are either ’C’, ’D’ or ’O’. These denote the sequence of abilities used by our hero in the i-th battle. ’C’ is Chains of Ice, ’D’ is Death Grip and ’O’ is Obliterate.

Output
Output the number of battles our hero won, assuming he won each battle where he did not Chains of Ice immediately followed by Death Grip.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Era uma vez um campeão de WoW

Arthasdk o nome que lhe foi dado

Ele Death Gripped você ao seu lado

Suas Chains of Ice pararam seu passo

E Obliterates fez você dizer "OWW!"

Mas um dia nosso herói ficou intrigado

Seu Death Grip fracassou totalmente

Em seu mais escuro desespero

Ele mal conseguia ouvir

”OMG NOOB u Chains of Iced então u Death Gripped”

Entrada
Você recebe uma gravação das habilidades que nosso herói usou em suas batalhas.

A primeira linha de entrada conterá um único inteiro n (1 ≤ n ≤ 100), o número de batalhas que nosso herói jogou.

Em seguida, siga n linhas, cada uma com uma sequência de caracteres ki (1 ≤ ki ≤ 1000), cada um dos quais sendo 'C', 'D' ou 'O'. Isso denota a sequência de habilidades usadas por nosso herói na i-ésima batalha. 'C' é Chains of Ice, 'D' é Death Grip e 'O' é Obliterate.

Saída
Imprima o número de batalhas que nosso herói venceu, supondo que ele venceu cada batalha em que não usou Chains of Ice imediatamente seguido por Death Grip.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_3249_Death_Knight_Hero {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int result = 0;

        for (int j = 0; j < n; j++) {
            String text = sc.nextLine();
            if (!text.contains("CD")) {
                result += 1;
            }
        }

        System.out.println(result);
        sc.close();
    }
}