
/*
🇺🇸 English

Dodô, Leo e Pepper often spend the early hours of the morning chatting somewhere in the condominium Jardim Botânico IV. In the last few sessions, Dodo has been talking about the RPG game he and Leo are creating, and Leo (not surprisingly) has spoken about heavy metal and Pepper was fascinated by the story of Greek mythology told by Leo.

The boys decided to adopt a strategy to divide the sessions equally among the subjects, só each one to them can speculate as much as possible and arrive at unbilievable conclusions. They wall play “rock, paper and scissors” to decide the subject of today’s session, and then they will alternate the subjects in the next sessions. Given the moves of Dodo, Leo and Pepper, in this order, you must determine the subject of today’s session.

Input
The input is composed of several test cases and ends with end of file (EOF). Each test case consists of a single line, which contains the plays of each of the boys, as shown in the exemples.

Output
For each test case, print a single line with the message "Os atributos dos monstros vao ser inteligencia, sabedoria…" to indicate that Dodo is the winner, the message "Iron Maiden's gonna get you, no matter how far!" to indicate that Leo is the winner, the message "Urano perdeu algo muito precioso…" to indicate that Pepper is the winner, of the message "Putz vei, o Leo ta demorando muito pra jogar…" if there is a tie.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Dodô, Leo e Pepper passam várias madrugadas conversando, em algum lugar do Condomínio Jardim Botânico IV. Diversos assuntos astrais ganham pauta nestas conversas homéricas. Nas últimas sessões, Dodô tem falado do jogo de RPG que ele e Leo estão inventando, Leo (para “variar”, mas com razão) tem falado do gênero musical heavy metal e Pepper ficou fascinado com a história da mitologia grega contada por Leo.

Os garotos resolveram adotar uma estratégia para dividir as sessões igualmente entre os assuntos, de modo que eles possam especular cada um ao máximo e chegarem a conclusões astronômicas. Eles irão jogar “pedra, papel e tesoura” para decidir o assunto da sessão de hoje, e então irão alternar os assuntos nas próximas sessões. Dadas as jogadas de Dodô, Leo e Pepper, nesta ordem, você deve determinar o assunto da sessão de hoje.

Entrada
A entrada é composta por vários casos de teste e termina com fim de arquivo. Cada caso de teste é composto por uma única linha, que contém as jogadas de cada um dos garotos, como mostrado nos exemplos.

Saída
Para cada caso de teste, imprima uma única linha com a mensagem "Os atributos dos monstros vao ser inteligencia, sabedoria..." para indicar que Dodô é o vencedor, a mensagem "Iron Maiden's gonna get you, no matter how far!" para indicar que Leo é o vencedor, a mensagem "Urano perdeu algo muito precioso..." para indicar que Pepper é o vencedor, ou a mensagem "Putz vei, o Leo ta demorando muito pra jogar..." se houver empate.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2626_JB6_Team {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String dodo = sc.next();
            String leo = sc.next();
            String pepper = sc.next();

            if (vence(dodo, leo) && vence(dodo, pepper) && leo.equals(pepper)) {
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
            } else if (vence(leo, dodo) && vence(leo, pepper) && dodo.equals(pepper)) {
                System.out.println("Iron Maiden's gonna get you, no matter how far!");
            } else if (vence(pepper, dodo) && vence(pepper, leo) && dodo.equals(leo)) {
                System.out.println("Urano perdeu algo muito precioso...");
            } else {
                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
            }
        }
        sc.close();
    }

    public static boolean vence(String a, String b) {
        if (a.equals("pedra") && b.equals("tesoura"))
            return true;
        if (a.equals("papel") && b.equals("pedra"))
            return true;
        if (a.equals("tesoura") && b.equals("papel"))
            return true;
        return false;
    }
}