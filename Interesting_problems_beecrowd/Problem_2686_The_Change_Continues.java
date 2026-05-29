/*
🇺🇸 English

Again Julius asks for your help, he has forgotten a small detail. As his previous program only reported a greeting, he asked him to turn the Sun / Moon degree into HH: MM: SS. Then if you accept: given a degree relative to the position of the Sun / Moon, redo the system only now that beyond the salutation of each period of the day, accurately report the hours, minutes and seconds.

Input
The input contains a floating point M (0 ≥ M <360) representing the position, in degrees, of the Sun/Moon relative to the ground. As they walk in constant motion their program will receive several cases every second(EOF).

Output
Print out what time of day it is: "Boa Tarde!!"(Good Afternoon!!), "Boa Noite!!"(Good Night!!), "Bom Dia!!"(Good Morning!!) and "Boa Madrugada!!"(Good Dawn!!) and on the bottom lines display the hours, minutes and seconds (HH: MM: SS).

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Novamente Júlio pede sua ajuda, ele esqueceu de um pequeno detalhe. Como o seu o programa anterior só informava uma saudação, ele pediu que transformasse o grau do Sol/Lua em HH:MM:SS. Então caso aceite: dado um grau relativo a posição do Sol/Lua, refaça o sistema só que agora além da saudação de cada período do dia, informe exatamente as horas, os minutos e segundos.

Entrada
A entrada contem um pontos flutuantes M (0 ≥ M < 360) representando a posição, em graus,do Sol/Lua em relação a terra. Como eles andam em constante movimento seu programa receberá diversos casos a cada segundo(EOF).

Saída
Imprima qual período do dia ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!", e na linhas de baixo exiba as horas, minutos e segundos (HH:MM:SS).



/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */
package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2686_The_Change_Continues {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextDouble()) {
            double horarioHora = 0;
            double horarioMinutos = 0;
            double horarioSegundos = 0;
            double grau = sc.nextDouble();
            double valorDe1grau = 4.0;
            if (grau < 15.00) {
                horarioHora += 6;
                horarioMinutos = grau * valorDe1grau;
                if (horarioMinutos >= 60) {
                    horarioMinutos = horarioMinutos - 60;
                    horarioHora++;
                }
                horarioSegundos = (horarioMinutos - (int) horarioMinutos) * 10;
                horarioSegundos = Math.round(horarioSegundos);
                System.out.printf("Bom Dia!!\n%02d:%02d:%02d\n", (int) horarioHora, (int) horarioMinutos,
                        (int) horarioSegundos);
            } else if (grau >= 15.00 && grau < 90.00) {
                double testGrau = grau;
                while (testGrau > 15.00) {
                    horarioHora++;
                    testGrau -= 15.00;
                }
                horarioHora += 6;
                if (horarioHora >= 24) {
                    horarioHora = horarioHora - 24;
                }
                horarioMinutos = testGrau * valorDe1grau;
                if (horarioMinutos >= 60) {
                    horarioMinutos = horarioMinutos - 60;
                    horarioHora++;
                }
                horarioSegundos = horarioMinutos - (int) horarioMinutos;
                horarioSegundos = horarioSegundos * 10;
                horarioSegundos = Math.round(horarioSegundos);
                System.out.printf("Bom Dia!!\n%02d:%02d:%02d\n", (int) horarioHora, (int) horarioMinutos,
                        (int) horarioSegundos);

            } else if (grau >= 90.00 && grau < 180.00) {
                double testGrau = grau;
                while (testGrau > 15.00) {
                    horarioHora++;
                    testGrau -= 15.00;
                }
                horarioHora += 6;
                if (horarioHora >= 24) {
                    horarioHora = horarioHora - 24;
                }
                horarioMinutos = testGrau * valorDe1grau;
                if (horarioMinutos >= 60) {
                    horarioMinutos = horarioMinutos - 60;
                    horarioHora++;
                }
                horarioSegundos = horarioMinutos - (int) horarioMinutos;
                horarioSegundos = horarioSegundos * 10;
                horarioSegundos = Math.round(horarioSegundos);
                System.out.printf("Boa Tarde!!\n%02d:%02d:%02d\n", (int) horarioHora, (int) horarioMinutos,
                        (int) horarioSegundos);

            } else if (grau >= 180.00 && grau < 270.00) {
                double testGrau = grau;
                while (testGrau > 15.00) {
                    horarioHora++;
                    testGrau -= 15.00;
                }
                horarioHora += 6;
                if (horarioHora >= 24) {
                    horarioHora = horarioHora - 24;
                }
                horarioMinutos = testGrau * valorDe1grau;
                if (horarioMinutos >= 60) {
                    horarioMinutos = horarioMinutos - 60;
                    horarioHora++;
                }
                horarioSegundos = horarioMinutos - (int) horarioMinutos;
                horarioSegundos = horarioSegundos * 10;
                horarioSegundos = Math.round(horarioSegundos);
                System.out.printf("Boa Noite!!\n%02d:%02d:%02d\n", (int) horarioHora, (int) horarioMinutos,
                        (int) horarioSegundos);

            } else if (grau >= 270.00 && grau < 360) {
                double testGrau = grau;
                while (testGrau > 15.00) {
                    horarioHora++;
                    testGrau -= 15.00;
                }
                horarioHora += 6;
                if (horarioHora >= 24) {
                    horarioHora = horarioHora - 24;
                }
                horarioMinutos = testGrau * valorDe1grau;
                if (horarioMinutos >= 60) {
                    horarioMinutos = horarioMinutos - 60;
                    horarioHora++;
                }
                if (horarioHora >= 24) {
                    horarioHora = horarioHora - 24;
                }
                horarioSegundos = horarioMinutos - (int) horarioMinutos;
                horarioSegundos = horarioSegundos * 10;
                horarioSegundos = Math.round(horarioSegundos);
                System.out.printf("De Madrugada!!\n%02d:%02d:%02d\n", (int) horarioHora, (int) horarioMinutos,
                        (int) horarioSegundos);

            }

        }

        sc.close();
    }
}