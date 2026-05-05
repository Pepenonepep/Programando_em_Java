/*
🇺🇸 English

In the Magic and Sword Tower defense, the player can cast area spells to defeat the enemy units. The spells are elemental: fire, water, air and earth, and the affected region is determined by a circle whose radius depends on the level of the spell.

The table below lists each spell, damage and its radius per level:

The enemy units are delimited by a rectangle of width w and height h, with the lower left corner positioned at the point (x0, y0). The enemy will suffer damage if their bounding rectangle has any intercession with the area defined by the spell circle.

Given the position and the bounding rectangle of the enemy unit, the center of the explosion, the identifier and level of the spell, determine the damage to the unit. If the unit is out of the spell range, the damage is equal to zero.

Input
The input consists of T (1 ≤ T ≤ 1000) test cases, where the value of T is reported in the first line of the input. Each test case consists of two lines. The first contains four integers representing the dimensions w and h (1 ≤ w, h ≤ 1000) of the rectangle and the coordinates x0 and y0 (0 ≤ x0, y0 ≤ 1000) from the lower left corner. The second line of the test case contains a string with the spell identifier (fire, water, earth and air), the level N of this spell (1 ≤ N ≤ 3) and the coordinates cx e cy (0 ≤ cx, cy ≤ 1000) from the center of the explosion area.

Output
For each test case, the output must be the value of the damage received by the unit, followed by a line break.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

No tower defense Magic and Sword, o jogador pode lançar magias de área para derrotar as unidades inimigas. As magias são elementais: fogo, água, ar e terra, e a região afetada é determinada por um círculo cujo raio depende do nível da magia.

A tabela abaixo lista cada magia, o dano e o respectivo raio por nível:

As unidades inimigas são delimitadas por um retângulo de largura w e altura h, com canto inferior esquerdo posicionado no ponto (x0, y0). O inimigo sofrerá dano caso seu retângulo delimitador tenha qualquer intercessão com a área deﬁnida pelo círculo da magia.

Dada a posição e o retângulo delimitador da unidade inimiga, o centro da explosão e o identiﬁcador e o nível da magia, determine o dano sofrido pela unidade. Caso a unidade esteja fora do alcance da magia, o dano sofrido é igual a zero.

Entrada
A entrada consiste em T (1 ≤ T ≤ 1000) casos de teste, onde o valor de T é informado na primeira linha da entrada. Cada caso de teste é composto por duas linhas. A primeira contém quatro número inteiros que repre-sentam as dimensões w e h (1 ≤ w, h ≤ 1000) do retângulo e as coordenadas x0 e y0 (0 ≤ x0, y0 ≤ 1000) do canto inferior esquerdo. A segunda linha do caso de teste contém uma string com o identiﬁcador da magia (ﬁre para fogo, water para água, earth para terra e air para ar), o nível N desta magia (1 ≤ N ≤ 3) e as coordenadas cx e cy (0 ≤ cx, cy ≤ 1000) do centro da área da explosão.

Saída
Para cada caso de teste, a saída deve ser o valor do dano recebido pela unidade, seguido de uma quebra de linha.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;

public class Problem_2632_Magic_and_Sword {
    public static int verificadorDeMagia(String magia, int level) {
        int raio = 0;
        switch (level) {
            case 1:
                if (magia.equals("fire")) {
                    raio = 20;
                } else if (magia.equals("water")) {
                    raio = 10;
                } else if (magia.equals("earth")) {
                    raio = 25;
                } else if (magia.equals("air")) {
                    raio = 18;
                }
                break;
            case 2:
                if (magia.equals("fire")) {
                    raio = 30;
                } else if (magia.equals("water")) {
                    raio = 25;
                } else if (magia.equals("earth")) {
                    raio = 55;
                } else if (magia.equals("air")) {
                    raio = 38;
                }
                break;
            case 3:
                if (magia.equals("fire")) {
                    raio = 50;
                } else if (magia.equals("water")) {
                    raio = 40;
                } else if (magia.equals("earth")) {
                    raio = 70;
                } else if (magia.equals("air")) {
                    raio = 60;
                }
                break;
        }
        return raio;
    }

    public static double verificarDistancia(int cx, int cy, int xp, int yp) {
        int soma1 = cx - xp;
        int soma2 = cy - yp;
        double potencia1 = Math.pow(soma1, 2);
        double potencia2 = Math.pow(soma2, 2);
        return Math.sqrt(potencia1 + potencia2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int xMax = w + x0;
            int yMax = h + y0;
            String magia = sc.next();
            int level = sc.nextInt();
            int raio = verificadorDeMagia(magia, level);
            int cx = sc.nextInt();
            int cy = sc.nextInt();
            int xp = 0;
            int yp = 0;
            if (cx > xMax) {
                xp = xMax;
            }
            if (cx < xMax && cx <= x0) {
                xp = x0;
            }
            if (cx < xMax && cx > x0) {
                xp = cx;
            }
            if (cx == x0) {
                xp = x0;
            }
            if (cx == xMax) {
                xp = xMax;
            }
            if (cy > yMax) {
                yp = yMax;
            }
            if (cy < yMax && cy <= y0) {
                yp = y0;
            }
            if (cy < yMax && cy > y0) {
                yp = cy;
            }
            if (cy == y0) {
                yp = y0;
            }
            if (cy == yMax) {
                yp = yMax;
            }

            double distancia = verificarDistancia(cx, cy, xp, yp);
            if (distancia > raio) {
                System.out.println("0");
            } else {
                if (magia.equals("fire")) {
                    System.out.println("200");
                }
                if (magia.equals("water")) {
                    System.out.println("300");
                }
                if (magia.equals("earth")) {
                    System.out.println("400");
                }
                if (magia.equals("air")) {
                    System.out.println("100");
                }
            }
        }
        sc.close();
    }
}