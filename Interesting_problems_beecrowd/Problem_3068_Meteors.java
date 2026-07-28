/*
🇺🇸 English

On cloudless nights, one can often observe bright spots in the sky that move at great speed and disappear from sight in a few seconds: these are called shooting stars, or meteors. Meteors are actually small dust particles that, when entering the Earth's atmosphere, burn up quickly (usually at a height between 60 and 120 kilometers). If the meteors are large enough, they may not burn up completely in the atmosphere and thus reach the Earth's surface: in this case, they are called meteorites.

Zé Felício is a farmer who loves astronomy and discovered a portal on the Internet that provides a list of positions where meteorites fell. Based on this list, and knowing the location of his farm, Zé Felício wants to know how many meteorites fell within his property. He needs your help to write a computer program that performs this check automatically.

Given:

• a list of points in the Cartesian plane, where each point corresponds to the position where a meteorite fell;

• the coordinates of a rectangle that delimits a farm. The lines that delimit the farm are parallel to the Cartesian axes. Your task is to write a program that determines how many meteorites fell inside the farm (including meteorites that fell exactly on the lines that delimit the farm).

Input
Your program must read several test sets. The first line of a test set contains four integers X1, Y1, X2, and Y2, where (0 ≤ Y2 < Y1 ≤ 10,000) and (0 ≤ X1 < X2 ≤ 10,000), where (X1, Y1) is the coordinate of the upper left corner and (X2, Y2) is the coordinate of the lower right corner of the rectangle that delimits the farm. The second line contains an integer, N (0 ≤ N ≤ 10,000), which indicates the number of meteorites. Then follow N lines, each containing two integers X (0 ≤ X ≤ 10,000) and Y (0 ≤ Y ≤ 10,000), corresponding to the coordinates of each meteorite. The end of the input is indicated by X1 = Y1 = X2 = Y2 = 0.

Output
For each test set in the input, your program must produce two lines in the output. The first line must contain an identifier for the test set, in the format “Teste n”, where n is numbered starting from 1. The second line must contain the number of meteorites that fell inside the farm.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Em noites sem nuvens pode-se muitas vezes observar pontos brilhantes no céu que se deslocam com grande velocidade, e em poucos segundos desaparecem de vista: são as chamadas estrelas cadentes, ou meteoros. Meteoros são na verdade partículas de poeira de pequenas dimensões que, ao penetrar na atmosfera terrestre, queimam-se rapidamente (normalmente a uma altura entre 60 e 120 quilômetros). Se os meteoros são suficientemente grandes, podem não queimar-se completamente na atmosfera e dessa forma atingem a superfície terrestre: nesse caso são chamados de meteoritos.

Zé Felício é um fazendeiro que adora astronomia e descobriu um portal na Internet que fornece uma lista das posições onde caíram meteoritos. Com base nessa lista, e conhecendo a localização de sua fazenda, Zé Felício deseja saber quantos meteoritos caíram dentro de sua propriedade. Ele precisa de sua ajuda para escrever um programa de computador que faça essa verificação automaticamente.

São dados:

• uma lista de pontos no plano cartesiano, onde cada ponto corresponde à posição onde caiu um meteorito;

• as coordenadas de um retângulo que delimita uma fazenda. As linhas que delimitam a fazenda são paralelas aos eixos cartesianos. Sua tarefa é escrever um programa que determine quantos meteoritos caíram dentro da fazenda (incluindo meteoritos que caíram exatamente sobre as linhas que delimitam a fazenda).

Entrada
Seu programa deve ler vários conjuntos de testes. A primeira linha de um conjunto de testes quatro números inteiros X1 , Y1 , X2 e Y2, em que (0 ≤ Y2 < Y1 ≤ 10.000) e (0 ≤ X1 < X2 ≤ 10.000), onde (X1 , Y1 ) é a coordenada do canto superior esquerdo e (X2 , Y2 ) é a coordenada do canto inferior direito do retângulo que delimita a fazenda. A segunda linha contém um inteiro, N (0 ≤ N ≤ 10.000), que indica o número de meteoritos. Seguem-se N linhas, cada uma contendo dois números inteiros X (0 ≤ X ≤ 10.000) e Y (0 ≤ Y ≤ 10.000), correspondendo às coordenadas de cada meteorito. O final da entrada é indicado por X1 = Y1 = X2 = Y2 = 0.

Saída
Para cada conjunto de teste da entrada seu programa deve produzir duas linhas na saída. A primeira linha deve conter um identificador do conjunto de teste, no formato “Teste n”, onde n é numerado a partir de 1. A segunda linha deve conter o número de meteoritos que caíram dentro da fazenda.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_3068_Meteors{

    public static int result(int x, int y, int x1, int y1, int x2, int y2){
       if(x >= x1 && x <= x2 && y >= y2 && y <= y1){
        return 1;
    }
    return 0;
    }
    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int number = 1;
        while(sc.hasNextInt()){
            int response=0;
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            if(x1==0 && y1==0 && x2==0 && y2==0)break;
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                response += result(x,y,x1,y1,x2,y2);
            }
            System.out.println("Teste "+number);
            System.out.println(response);
            number++;
        }

        sc.close();
    }
}