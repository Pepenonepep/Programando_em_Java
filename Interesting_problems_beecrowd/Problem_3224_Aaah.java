/*
🇧🇷 Portugues 

Jon Marius gritou muito no recente show de Justin Bieber, e agora precisa ir ao médico por causa de sua dor de garganta. As instruções do médico são para dizer "aaah". Infelizmente, os médicos às vezes precisam que Jon Marius diga “aaah” por um tempo, o que Jon Marius nunca foi bom. Cada médico requer um certo nível de “aah” - alguns requerem “aaaaaah”, enquanto outros podem realmente diagnosticar sua garganta com apenas um “h”. (Eles costumam diagnosticar erroneamente, mas isso está além do escopo deste problema.) Como Jon Marius não quer ir ao médico e perder tempo, ele quer comparar quanto tempo consegue segurar o “aaah” com o requisitos do médico. (Afinal, quem quer ser todo tipo “aaah” quando o médico quer que você diga “aaaaaah”?)

A cada dia Jon Marius liga para um médico diferente e pergunta quanto tempo seu “aaah” deve durar. Descubra se Jon Marius perderia seu tempo indo ao médico determinado.

Entrada
A entrada consiste em duas linhas. A primeira linha é o “aaah” que Jon Marius pode dizer naquele dia. A segunda linha é o “aah” que o médico quer ouvir. Apenas 'a' e 'h' minúsculos serão usados na entrada, e cada linha conterá entre 0 e 999 'a's, inclusive, seguido por um único' h '.

Saída
Envie “go” (vá, em inglês) se Jon Marius puder ir ao médico e "no” (não, em inglês) caso contrário.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_3224_Aaah {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.length() >= s2.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}