
/*
🇺🇸 English

A very common and fun game between two players uses a coin and three opaque cups (that is, it is not possible to see what is inside the cup by looking through the side of the cup). The three cups are placed mouth down, in a line, side by side, in positions that we will call A, B, and C. A coin is placed under one of the cups. In the game, a player called the "banca" performs a movement to swap the positions of two cups, dragging the cups in such a way that if the coin is under one of the cups involved in the movement, it remains under the same cup after the swap. The banca player can perform three types of movements, illustrated in the figure below:

1. Swap the cup at position A with the cup at position B.

2. Swap the cup at position B with the cup at position C.

3. Swap the cup at position A with the cup at position C.

The banca player performs several swap movements trying to confuse the other player, called the spectator. At the end, the spectator player must say which position the coin is in. For example, consider that initially the coin is under the cup at position A and that the banca player performs a sequence of only three swaps, executing a type 1 movement, after which the coin ends up under the cup at position B, followed by a type 2 movement, after which the coin ends up under the cup at position C, followed by a type 3 movement, after which the coin ends up under the cup at position A.

In this task, given the description of the sequence of movements and the initial position of the coin, you must write a program that determines the final position of the coin after all the movements.


Input
The first line contains an integer N, the number of movements the banca player performs. The second line contains a character, among A, B, and C, indicating the initial position of the coin. Each of the N following lines contains an integer, indicating the type of movement performed by the banca player in the sequence.

Output
Your program must produce a single line, with a single character among A, B, and C, the position where the coin is at the end of the sequence of movements.

Restrictions • 1 ≤ N ≤ 1000

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Uma brincadeira muito comum e divertida entre dois jogadores usa uma moeda e três copos opacos (ou seja, não é possível ver o que está dentro do copo olhando pela lateral do copo). Os três copos são colocados com a boca para baixo, em uma linha, um ao lado do outro, em posições que vamos chamar de A, B e C. Uma moeda é colocada embaixo de um dos copos. Na brincadeira, um jogador chamado banca realiza um movimento para trocar a posição de dois copos, arrastando os copos de tal modo que se a moeda está em baixo de um dos copos envolvidos no movimento, ela continua embaixo do mesmo copo após a troca de posição. O jogador banca pode realizar três tipos de movimento, ilustrados na figura abaixo:

1. Trocar o copo na posição A com o copo na posição B.

2. Trocar o copo na posição B com o copo na posição C.

3. Trocar o copo na posição A com o copo na posição C.

O jogador banca realiza vários movimentos de troca tentando confundir o outro jogador, chamado espectador. Ao final o jogador espectador deve dizer em qual posição está a moeda. Por exemplo, considere que inicialmente a moeda está embaixo do copo na posição A e que o jogador banca realiza uma sequência de apenas três trocas, executando um movimento do tipo 1, após o qual moeda termina embaixo do copo na posição B, seguido de um movimento do tipo 2, após o qual a moeda termina embaixo do copo na posição C, seguido de um movimento do tipo 3, após o qual a moeda termina embaixo do copo na posição A.

Nesta tarefa, dadas a descrição da sequência de movimentos e a posição inicial da moeda, você deve escrever um programa que determine a posição final da moeda após todos os movimentos.


Entrada
A primeira linha contém um inteiro N, o número de movimentos que o jogador banca realiza. A segunda linha contém um caractere, entre A, B e C, indicando a posição inicial da moeda. Cada uma das N linhas seguintes contém um inteiro, indicando o tipo de movimento efetuado pelo jogador banca na sequência.

Saída
Seu programa deve produzir uma única linha, com um único caractere entre A, B e C, a posição em que a moeda se encontra ao final da sequência de movimentos.

Restrições • 1 ≤ N ≤ 1000

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Problem_3053_Game_Of_Cups {

    public static char posicaoDaMoeda(char ch, int mov) {
        switch (ch) {
            case 'A':
                if (mov == 1)
                    return 'B';
                if (mov == 3)
                    return 'C';

                return 'A';

            case 'B':
                if (mov == 1)
                    return 'A';
                if (mov == 2)
                    return 'C';

                return 'B';

            case 'C':
                if (mov == 2)
                    return 'B';
                if (mov == 3)
                    return 'A';

                return 'C';
        }
        return ch;

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        for (int i = 0; i < n; i++) {
            int mov = sc.nextInt();
            ch = posicaoDaMoeda(ch, mov);
        }
        System.out.println(ch);

        sc.close();
    }
}
