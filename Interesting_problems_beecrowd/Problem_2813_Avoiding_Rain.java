/*
🇺🇸 English

Rafael hates rain, and to avoid getting wet he started to use a weather forecasting system. In this system he can predict if it's going to rain at the time he goes to work and/or at the time he comes back from work.

Rafael also hates to carry an umbrella when it's not raining. To avoid it, he's going to buy several umbrellas and store them
at home and at the office, and he's only going to use it when it's raining. In other words, if it's raining at the time he goes to work, he'll take an umbrella that is at home, use it on the way to work, and leave it there. In a similar way, if it's raining at the time he comes back from work, he'll take an umbrella that is at the office, use it on the way home, and leave it there.

Given the meteorological forecasts, find out how many umbrellas Rafael must buy and store at home and at the office, in a way that he never gets wet and he never has to carry an umbrella if it's not raining.

Input
The first input row has an integer N, indicating how many days were forecast by the meteorological system (1 <= N <= 1000).

Following there will be N rows, each with two words SD and SN, indicating the forecast of the day at the time Rafael goes to work, and at the time Rafael comes back from work, respectively. If the word is "sol", it means that at this time it's not going to rain, and if the word is "chuva", it means that at this time it's going to rain.

Output
For each test case, you should print one row with two integers C and E, indicating how many umbrellas Rafael must buy and store at home and at the office.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Rafael odeia pegar chuva, e para evitá-la ele começou a usar um sistema de previsão do tempo. Neste sistema ele consegue prever se irá chover no horário em que ele vai para o trabalho e/ou no horário que ele volta do
trabalho.

Rafael também odeia carregar guarda-chuva quando não está chovendo. Para evitar isso, ele vai comprar vários guarda-chuvas e deixá-los guardados em casa e no escritório, e só vai usá-los quando estiver chovendo. Ou seja, se estiver chovendo na hora de ir para o trabalho, ele vai pegar um guarda-chuva que está em sua casa, usá-lo no caminho para o trabalho, e deixá-lo lá. De maneira semelhante, se estiver chovendo na hora de voltar para casa, ele vai pegar um guarda-chuva que está no escritório, usá-lo no caminho para casa, e deixá-lo lá.

Dadas as previsões meteorológicas, descubra quantos guarda-chuvas Rafael deve comprar e guardar em casa e no escritório, de modo que ele nunca se molhe e nunca precise carregar o guarda-chuva quando não estiver chovendo.
 

Entrada
A primeira linha da entrada contém um inteiro N, indicando a quantidade de dias previstos pelo sistema meteorológico (1 <= N <= 1000).

Em seguida haverá N linhas, cada uma contendo duas palavras SD e SN, indicando a previsão do tempo para a ida e para a volta do trabalho, respectivamente. Se a palavra for "sol" significa que neste horário fará sol, e se a palavra for "chuva" significa que neste horário irá chover.
 

Saída
Para cada caso de teste imprima uma linha contendo dois inteiros C e E, indicando quantos guarda-chuvas Rafael deve comprar e guardar em sua casa e escritório.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2813_Avoiding_Rain {
    public static boolean textoCorreto(String texto) {
        if ((!texto.equals("sol chuva")) && (!texto.equals("sol sol")) && (!texto.equals("chuva sol"))
                && (!texto.equals("chuva chuva"))) {
            return false;
        }
        return true;

    }

    public static boolean PrimeiraPalavraEhS(String texto) {
        if (texto.charAt(0) == 's') {
            return true;
        }
        return false;
    }

    public static boolean SegundaPalavraEhS(String texto) {
        boolean sucesso = false;
        if (PrimeiraPalavraEhS(texto)) {
            if (texto.charAt(4) == 's') {
                sucesso = true;
            }
        } else {
            if (texto.charAt(6) == 's') {
                sucesso = true;
            }
        }
        return sucesso;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0, e = 0, c_c = 0, c_e = 0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String texto = sc.nextLine();
            if (!textoCorreto(texto)) {
                break;
            }

            if (!PrimeiraPalavraEhS(texto)) {
                if (c > 0) {
                    c -= 1;
                    e += 1;
                } else {
                    c_c++;
                    e += 1;
                }
            }
            if (!SegundaPalavraEhS(texto)) {
                if (e > 0) {
                    e -= 1;
                    c += 1;
                } else {
                    c_e++;
                    c += 1;
                }
            }

        }
        System.out.println(c_c + " " + c_e);
        sc.close();
    }
}