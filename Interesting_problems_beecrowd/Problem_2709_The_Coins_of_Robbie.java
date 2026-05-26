/*
🇺🇸 English

Robbie is a very charismatic robot, and one of the things that he most likes to do, besides playing with Glória, it's to collect coins. Robbie has several coins with equal or different values, and all with the same size. They are stored in an organized manner on top of each other, inside a glass cylinder. Robbie always plays a little game with Glória using his coins whenever she asks to play hide and seek with him, or when she asks him to take her for a walk. The rule of the game is: Glória has to choose any number N, which will be added, then for each coin N  the value of the coin Vi is added until there aren't more coins, in other words Ʃ of ((VM-(N*0) )+(VM-(N*1))+(VM-(N*2))...), M is the number of coins. Such as that if there are 5 coins with values of 1, 2, 3, 4 and 5, and Glória chooses 2 as number of jumps (did not understand what the author meant here by jumps), then the coins will be added as 5, 3 and 1, resulting in 9. In the end, Robbie checks if the sum of these coins is a prime number, if it results in yes, he will do what Glória wants, if it doesn't, the little girl will convince Robbie to play again, because she can always make him do everything, saying that will make him stop telling stories if he doesn't complies.

You, as a good developer of U.S Robots, will help this two friends, by coding a computer program that will give the result of the game.

Input
The input contains several test cases. The first line of a test case contains an integer M (2 ≤ M ≤ 20) that represents the quantity of coins. Each of the next lines M contains an integer Vi (1 ≤ Vi ≤500) that represents the value of coins Mi , and for the last one, a integer N (1 ≤ N ≤ M) that’s the jump in the added choosen by Gloria.

The input ends with EOF.

Output
Print “You’re a coastal aircraft, Robbie, a large silver aircraft.”, if Gloria win the game, or “Bad boy! I’ll hit you.”, if Glória loose the game. The output should be no quotation marks.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Robbie é um robô muito carismático, e uma das coisas que ele mais gosta de fazer, além de brincar com Glória, é colecionar moedas. Robbie possui várias moedas com valores iguais ou diferente, e de mesmo mesmo tamanho. e elas são guardadas de maneira organizada uma sobre a outra dentro de um cilindro de vidro. Robbie sempre faz um joguinho com Glória usando suas moedas quando ela pede pra brincar com ele de esconde-esconde, ou quando ela pede pra ele levá-la para passear. O jogo acontece da seguinte maneira: Glória escolhe um número N que será o salto das moedas que serão somadas, então a cada Nmoedas o valor Vi da moeda é somado até que não haja mais moedas, ou seja, Σ de ((VM-(N*0))+(VM-(N*1))+(VM-(N*2) )...), M é o número de moedas. Por exemplo, se existirem 5 moedas com os valores 1, 2 , 3, 4 e 5, e Glória escolher 2 como valor do salto, então serão somadas as moedas 5, 3 e 1, resultando em 9, ao final Robbie verifica se a soma dessas moedas é um número primo, se isso acontecer ele faz o que a Glória quer, caso contrário, a garotinha convence Robbie a jogar novamente, pois ela sempre consegue convencer ele de tudo, alegando que deixará de contar histórias pra ele, caso ele não faça a vontade dela.

Você como um bom programador da U.S. Robots, ajudará esses dois amigos, escrevendo um programa irá dizer o resultado do jogo.

Entrada
A entrada contém vários casos de teste. A primeira linha de um caso de teste contém um inteiro M (2 ≤ M ≤ 20 ) que representa a quantidade de moedas. Cada uma das próximas M linhas contém um inteiro Vi (1 ≤ Vi ≤ 500) que representa o valor da moeda Mi , e por último um inteiro N (1 ≤ N ≤ M) que é o salto na soma escolhido por Glória.

A entrada termina em EOF.

Saída
Imprima “You’re a coastal aircraft, Robbie, a large silver aircraft.”, caso Glória ganhe o jogo, ou “Bad boy! I’ll hit you.”, caso Glória não ganhe o jogo. A saída não deve conter aspas.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Problem_2709_The_Coins_of_Robbie {

    public static boolean Ehprimo(int x) {
        int cont = 1;
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                cont++;
            }
        }
        if (cont != 2) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int M = sc.nextInt();
            int[] vetor = new int[M];
            for (int i = 0; i < M; i++) {
                vetor[i] = sc.nextInt();
            }
            int N = sc.nextInt();
            int soma = 0;
            for (int i = M - 1; i >= 0; i -= N) {
                soma += vetor[i];
            }
            if (Ehprimo(soma) == true) {
                System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            } else {
                System.out.println("Bad boy! I’ll hit you.");
            }
        }

        sc.close();
    }
}
