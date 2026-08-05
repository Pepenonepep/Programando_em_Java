/*
🇺🇸 English

The year is 2337. Thousands of human crews travel in space in a crazy way to and fro. And the best: the ships can communicate via radio, it is even possible for crews between different ships to play games.

However, unfortunately the signal quality fades with distance. While nearby ships are able to communicate well, ships that are distant have poor signal strength to communicate. For this reason, the ships preferentially communicate with the nearest ship.

Considering a stretch of space where the ships can be considered points in space, therefore with three-dimensional coordinates, with each axis being able to have a value between 0 and 100 m.u. It is known that the intensity of the communication signal is given by the distance between the ships; so that ships that are spaced up to 20 m.u. have a high intensity; above 20 m.u. and up to 50 m.u. have a medium intensity; while the signal strength above 50 m.u. it is so low that it does not allow communication between ships.

Given the information passed on, help the crew of these ships to be able to know the signal strength between each of them and the nearest ship, to inform them if they will be able to have good communication with each other.

Input
The first line of the entry has an integer N (2 <= N <= 10), which represents the number of ships in the space to be analyzed. The next N lines will receive 3 integer values, separated by space, indicating the discrete x, y and z coordinates of each ship.

Output
One line for each ship, indicating a letter for the signal strength between it and the nearest ship. "A" stands for high intensity; "M" represents medium intensity and "B" represents low intensity.



/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

O ano é 2337. Milhares de naves de tripulações humanas viajam pelo espaço de forma alucinada para lá e para cá. E o melhor: as naves conseguem se comunicar através de rádio, é possível até mesmo que tripulações entre naves distintas jogarem truco.

No entanto, infelizmente a qualidade do sinal esvanece com a distância. Enquanto naves próximas conseguem se comunicar bem, as naves que estão distantes possuem péssima intensidade de sinal para se comunicar. Por esse motivo, as naves comunicam-se preferencialmente com a nave mais próxima.

Considerando um trecho do espaço onde as naves podem ser consideradas pontos no espaço, portanto com coordenadas tridimensionais, com cada eixo podendo ter valor entre 0 e 100 u.m. Sabe-se que a intensidade do sinal de comunicação se dá pela distância entre as naves; de modo que naves que distam entre si até 20 u.m. possuem uma intensidade alta; acima de 20 u.m. e até 50 u.m. possuem uma intensidade média; enquanto a intensidade do sinal acima de 50 u.m. é tão baixa que não possibilita a comunicação entre as naves.

Dadas as informações passadas, ajude os tripulantes destas naves a conseguirem saber a intensidade do sinal entre cada uma delas e a nave mais próxima, para informá-los se eles vão conseguir ter uma boa comunicação entre si.

Entrada
A primeira linha da entrada possui um número inteiro N (2 <= N <= 10), que representa o número de naves no espaço a ser analisado. As N linhas seguintes receberão 3 valores inteiros, separados por espaço, indicando as coordenadas discretas x, y e z de cada nave.

Saída
Uma linha para cada nave, indicando uma letra para a intensidade de sinal entre ela e a nave mais próxima. “A” representa intensidade alta; “M” representa intensidade média e “B” representa intensidade baixa.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_3162_Space_Communication {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            z[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            double menorDistancia = Double.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                double distancia = Math
                        .sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2) + Math.pow(z[i] - z[j], 2));
                if (distancia < menorDistancia) {
                    menorDistancia = distancia;
                }
            }
            if (menorDistancia <= 20) {
                System.out.println("A");
            } else if (menorDistancia <= 50) {
                System.out.println("M");
            } else {
                System.out.println("B");
            }
        }
        sc.close();
    }
}