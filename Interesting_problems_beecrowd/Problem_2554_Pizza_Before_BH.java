/*
🇺🇸 English

The Nlogonian Aquatic Surf Championship, to be hosted in Bonita Horeleninha (BH) city, is about to start! Before going to BH, you and your N-1 friends decided to go for a pizza, so you can relax and have some fun (and, of course, eat!).

At this moment you are choosing the date for the event. To make sure everyone can enjoy it, it was decided that the meeting is to be set in a day so that all the N people can show up at the pizzeria on that date.

Given the list of dates considered for the event and the information about which people can show up at which dates, determine if the event can happen and, if it can, print its date. If more than one date is possible, the event must occur as early as possible.

Input
The input contains several test cases. The first line of each test case contains integers N and D (1 ≤ N, D ≤ 50), the number of people and the number of considered dates. People are numbered from 1 to N. Next D lines describe the considered dates. Each line begins with a date in the format day∕month∕year. The line is followed by N integers p1,p2,...,pN. The integer pi is 1 if the i-th person can show up at the considered date, or 0 otherwise. It is guaranteed that dates are always valid, and there aren’t leading zeros. Also, all dates are given in order, from the earliest to the latest day.

The input ends with end-of-file (EOF).

Output
For each test case, print one line with the date in the format day∕month∕year, exactly as it appears in the input. If it is not possible to hold the event, print “Pizza antes de FdI” (without quotes).

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Está chegando a grande final do Campeonato Nlogonense de Surf Aquático, que este ano ocorrerá na cidade de Bonita Horeleninha (BH)! Antes de viajar para BH, você e seus N-1 amigos decidiram combinar algum dia para ir a uma pizzaria, para relaxar e descontrair (e, naturalmente, comer!).

Neste momento está sendo escolhida a data do evento. Para que todas as pessoas possam participar, foi decidido que o encontro na pizzaria ocorrerá em um data tal que todas as N pessoas podem comparecer à pizzaria nesta data. Portanto, nem toda data pode ser escolhida, pois algumas pessoas podem ter outros compromissos já marcados em alguns dias.

Dada a lista de datas consideradas para o evento e a informações de quais pessoas podem comparecer em quais datas, determine se o evento poderá ocorrer e, em caso positivo, sua data. Caso mais de uma data seja possível, o evento deve ocorrer o mais cedo possível.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém os inteiros N e D (1 ≤ N, D ≤ 50), o número de pessoas e o número de datas consideradas, respectivamente. As pessoas são numeradas de 1 a N. As próximas D linhas descrevem uma data considerada. Cada linha começa com a data na forma dia∕mes∕ano. A linha é seguida de N inteiros p1,p2,...,pN. O inteiro pi é 1 se a pessoa i pode comparecer na data considerada, ou 0 caso contrário. É garantido que as datas são sempre válidas, e não há zeros à esquerda. Além disso, as datas são dadas em ordem, do dia mais cedo para o dia mais tarde.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma linha contendo a data que o evento deve ocorrer, na forma dia∕mes∕ano, de maneira idêntica à da entrada. Caso não seja possível realizar o evento, imprima “Pizza antes de FdI” (sem aspas).

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2554_Pizza_Before_BH {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int d = sc.nextInt();

            String dataEscolhida = "";
            boolean encontrou = false;

            for (int i = 0; i < d; i++) {
                String dataAtual = sc.next();
                int pessoasQuePodem = 0;

                for (int j = 0; j < n; j++) {
                    pessoasQuePodem += sc.nextInt();
                }

                if (pessoasQuePodem == n && !encontrou) {
                    dataEscolhida = dataAtual;
                    encontrou = true;
                }
            }

            if (encontrou) {
                System.out.println(dataEscolhida);
            } else {
                System.out.println("Pizza antes de FdI");
            }
        }

        sc.close();

    }
}