/*
 * 🇺🇸 English
 * 
 * The Nlogonian Aquatic Surf Championship, to be hosted in Bonita Horeleninha
 * (BH) city, is about to start! The game CheeseBreadSweeper is very popular in
 * this town!
 * 
 * The game board consists on a matrix with N rows and M columns. Each cell
 * contains a Cheese Bread or the number of Cheese Breads present in its
 * adjacent cells. A cell is adjacent to another if it is immediately on the
 * left, the right, above or bellow the cell. Please notice that, if a cell does
 * not contain a Bread Cheese, then it must have a number from 0 to 4,
 * inclusive.
 * 
 * Given the positions of the Cheese Breads, determine the game board!
 * 
 * Input
 * The input contains several test cases. The first line of each test case
 * contains integers N and M (1 ≤ N, M ≤ 100). Next N lines contains M integers
 * each, separated by spaces, describing the Cheese Breads on the board. The
 * j-th integer in the i-th line is 1 if there is a Cheese Bread at row i and
 * column j of the board, or 0 otherwise.
 * 
 * The input ends with end-of-file (EOF).
 * 
 * Output
 * For each test case, print N lines with M integers each, not separated by
 * spaces, describing the board’s configuration. If a cell contains a Cheese
 * Bread, print 9 for it; otherwise, print the number the cell must contain.
 * 
 * /* Class name must be "Main" for your solution to execute
 */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
 * 🇧🇷 Portugues
 * 
 * Está chegando a grande final do Campeonato Nlogonense de Surf Aquático, que
 * este ano ocorrerá na cidade de Bonita Horeleninha (BH)! Nesta cidade, o jogo
 * PãodeQueijoSweeper é bastante popular!
 * 
 * O tabuleiro do jogo consiste em uma matriz de N linhas e M colunas. Cada
 * célula da matriz contém um pão de queijo ou o número de pães de queijo que
 * existem nas celulas adjacentes a ela. Uma célula é adjacente a outra se
 * estiver imediatamente à esquerda, à direita, acima ou abaixo da célula. Note
 * que, se não contiver um pão de queijo, uma célula deve obrigatoriamente
 * conter um número entre 0 e 4, inclusive.
 * 
 * Dadas as posições dos pães de queijo, determine o tabuleiro do jogo!
 * 
 * Entrada
 * A entrada contém vários casos de teste. A primeira linha de cada caso contém
 * os inteiros N e M (1 ≤ N, M ≤ 100). As próximas N linhas contém M inteiros
 * cada, separados por espaços, descrevendo os pães de queijo no tabuleiro. O
 * j-ésimo inteiro da i-ésima linha é 1 se existe um pão de queijo na linha i e
 * coluna j do tabuleiro, ou 0 caso contrário.
 * 
 * A entrada termina com fim-de-arquivo (EOF).
 * 
 * Saída
 * Para cada caso de teste, imprima N linhas com M inteiros cada, não separados
 * por espaços, descrevendo a configuração do tabuleiro. Se uma posição contém
 * um pão de queijo, imprima 9 para ela; caso contrário, imprima o número cuja
 * posição deve conter.
 * 
 * /*O nome da classe deve ser "Main" para que a sua solução execute
 */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2552_CheeseBreadSweeper {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] matriz = new int[N][M];

            for (int l = 0; l < N; l++) {
                for (int c = 0; c < M; c++) {
                    matriz[l][c] = sc.nextInt();
                }
            }

            for (int l = 0; l < N; l++) {
                for (int c = 0; c < M; c++) {

                    if (matriz[l][c] == 1) {
                        System.out.print(9);
                    } else {
                        int soma = 0;

                        if (l > 0) {
                            soma += matriz[l - 1][c];
                        }
                        if (l < N - 1) {
                            soma += matriz[l + 1][c];
                        }
                        if (c > 0) {
                            soma += matriz[l][c - 1];
                        }
                        if (c < M - 1) {
                            soma += matriz[l][c + 1];
                        }

                        System.out.print(soma);
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}