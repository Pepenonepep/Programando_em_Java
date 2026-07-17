/*
🇺🇸 English

John wants to set up a panel containing different numbers of LEDs. He does not have many leds, he is not sure if he will be able to mount the desired number. Considering the configuration of the LEDs of the numbers below, make an algorithm that helps John to discover the number of LEDs needed to set the value.

Note: For Javascript programmers, it is recommended to use of "input.trim().split('\n')" to avoid some known problems.


Input
The input contains an integer N, (1 ≤ N ≤ 2000) corresponding to the number of test cases, followed by N lines, each line containing a number (1 ≤ V ≤ 10100) corresponding to the value that John wants to set with the leds.

Output
For each test case, print one line containing the number of LEDs that John needs to set the desired value, followed by the word "leds".

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

João quer montar um painel de leds contendo diversos números. Ele não possui muitos leds, e não tem certeza se conseguirá montar o número desejado. Considerando a configuração dos leds dos números abaixo, faça um algoritmo que ajude João a descobrir a quantidade de leds necessário para montar o valor.

Obs.: Para programadores de Javascript, recomenda-se o uso de "input.trim().split('\n')" para evitar erros conhecidos.


Entrada
A entrada contém um inteiro N, (1 ≤ N ≤ 1000) correspondente ao número de casos de teste, seguido de N linhas, cada linha contendo um número (1 ≤ V ≤ 10100) correspondente ao valor que João quer montar com os leds.

Saída
Para cada caso de teste, imprima uma linha contendo o número de leds que João precisa para montar o valor desejado, seguido da palavra "leds".

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_1168_LED {
    public static int retornoDeLeds(int num) {
        switch (num) {
            case 0:
                return 6;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 3;
            case 8:
                return 7;
            case 9:
                return 6;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            String leds = sc.nextLine();
            for (int j = 0; j < leds.length(); j++) {
                char numChar = leds.charAt(j);
                int numInt = numChar - 48;
                sum += retornoDeLeds(numInt);
            }

            System.out.println(sum + " leds");

        }
        sc.close();
    }
}