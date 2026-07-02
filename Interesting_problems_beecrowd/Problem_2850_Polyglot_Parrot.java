/*
🇺🇸 English

Humberto has a smart parrot. When he has both legs on the ground, the parrot speaks Portuguese. When he lifts his left leg, he speaks in English. Finally, when he raises his right, he speaks French. Nico, Humberto's friend, was fascinated by the animal. In his excitement he asked, "And when he lift both of them?" Before Humberto could respond, the parrot shouted, "Oh, I'll fall, you idiot!"

Input
The input consists of several test cases. Each test case consists of a string informing the parrot's leg raising situation. “direita” means his right leg is raised, “esquerda” means his left leg is raised, “nenhuma” means none of his leg are raised and “as duas” means both his legs are raised.

Output
For each parrot's leg raising condition, print out the language he will use. For English, print “ingles”, for French print “frances” and for Portuguese print “portugues”. If he lifts both legs, print "caiu." Break a line for each test case.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Humberto tem um papagaio muito esperto. Quando está com as duas pernas no chão, o papagaio fala em português. Quando levanta a perna esquerda, fala em inglês. Por fim, quando levanta a direita fala em francês. Nico, amigo de Humberto, ficou fascinado com o animal. Em sua emoção perguntou: “E quando ele levanta as duas?”. Antes que Humberto pudesse responder, o papagaio gritou: “Ai eu caio, idiota!”.

Entrada
A entrada consiste de diversos casos de teste. Cada caso de teste consiste uma string informando qual a situação de levantamento de pernas do papagaio.

Saída
Para cada condição de levantamento de pernas do papagaio, imprima a linguagem que ele utilizará. Caso ele levante as duas pernas, imprima “caiu”. Quebre uma linha a cada caso de teste.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2850_Polyglot_Parrot {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String perna = sc.nextLine();
            if (perna.equals("esquerda")) {
                System.out.println("ingles");
            } else if (perna.equals("direita")) {
                System.out.println("frances");
            } else if (perna.equals("nenhuma")) {
                System.out.println("portugues");
            } else if (perna.equals("as duas")) {
                System.out.println("caiu");
            }

        }

        sc.close();
    }
}
