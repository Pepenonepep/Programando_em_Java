/*
🇺🇸 English

A long time ago, in a galaxy far, far away...

After the decline of the Empire, scavengers are spread around the universe looking for a lost lightsaber. Everyone knows that a lightsaber emits an unique wave pattern: 42 surrounded by 7 all around. You have a wave sensor that scans a terrain with N x M cells. Look at the example below for an 4 x 7 terrain with a lightsaber in it (at position (2,4)).



You must write a program that, given an N x M terrain, looks for the lightsaber pattern in it. No scan have more than one lightsaber pattern.

Input
The first line of the input has two positive integers N and M, representing respectively the number of rows and the number of columns scanned in a terrain (3 ≤ N, M ≤ 1000). Each of the next N lines have M integers, describing the values scanned in each cell of the terrain (-100 ≤ Tij ≤ 100, for 1 ≤ i ≤ N and 1 ≤ j ≤ M).

Output
The output is a single line with 2 integers X and Y separated by one space. They represent the (X,Y)-coordinate of the lightsaber, if it is found. If the terrain doesn't have a lightsaber pattern, X and Y are both zero.

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Há muito tempo atrás, em uma galáxia muito, muito distante...

Após o declínio do Império, sucateiros estão espalhados por todo o universo procurando por um sabre de luz perdido. Todos sabem que um sabre de luz emite um padrão de ondas específico: 42 cercado por 7 em toda a volta. Você tem um sensor de ondas que varre um terreno com N x M células. Veja o exemplo abaixo para um terreno 4 x 7 com um sabre de luz nele (na posição (2, 4)).



Você deve escrever um programa que, dado um terreno N x M, procura pelo padrão do sabre de luz nele. Nenhuma varredura tem mais do que um padrão de sabre de luz.

Entrada
A primeira linha da entrada tem dois números positivos N e M, representando, respectivamente, o número de linhas e de colunas varridos no terreno (3 ≤ N, M ≤ 1000). Cada uma das próximas N linhas tem M inteiros, que descrevem os valores lidos em cada célula do terreno (-100 ≤ Tij ≤ 100, para 1 ≤ i ≤ N e 1 ≤ j ≤ M).

Saída
A saída é uma única linha com 2 inteiros X e Y separados por um espaço. Eles representam a coordenada (X,Y) do sabre de luz, caso encontrado. Se o terreno não tem um padrão de sabre de luz, X e Y são ambos zero.

Exemplos de Entrada	

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2163_The_Force_Awakens{
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N < 3) {
            sc.close();
            return;
        }
        int M = sc.nextInt();
        if (M > 1000) {
            sc.close();
            return;
        }
        int[][] mat = new int[N][M];
        for (int l = 0; l < N; l++) {
            for (int c = 0; c < M; c++) {
                mat[l][c] = sc.nextInt();
                if (mat[l][c] < -100 || mat[l][c] > 100) {
                    sc.close();
                    return;
                }
            }
        }
        int posicaoDaLinha=0;
        int posicaoDaColuna=0;
        for (int l = 0; l < N; l++) {
            for (int c = 0; c < M; c++) {
                int valor=mat[l][c];
                if (valor == 42 && c != M-1 && l != N-1 && l != 0 && c != 0) {
                    int direita = mat[l][c+1];
                    int esquerda = mat[l][c-1];
                    int baixo = mat[l+1][c];
                    int cima = mat[l-1][c];
                    int diagonalDireitaSuperior = mat[l-1][c+1];
                    int diagonalEsquerdaSuperior = mat[l-1][c-1];
                    int diagonalDireitaInferior = mat[l+1][c+1];
                    int diagonalEsquerdaInferior = mat[l+1][c-1];
                   if(direita == 7 && esquerda == 7 && baixo == 7 && cima == 7 && diagonalDireitaSuperior==7 && diagonalEsquerdaSuperior==7 && diagonalDireitaInferior==7 && diagonalEsquerdaInferior==7)
                    {

                        posicaoDaLinha=l+1;
                        posicaoDaColuna=c+1;
                    System.out.printf("%d %d\n",posicaoDaLinha,posicaoDaColuna);
                    sc.close();
                    return;
                   }
                }
            }
        }

         System.out.printf("%d %d\n",posicaoDaLinha,posicaoDaColuna);
        sc.close();
    }
}