/*
🇺🇸 English

The teacher is teaching you about sensors. This is a very important element in many applications. To better understand the concepts of precision, the teacher asked to perform a practical assembly of the Thermo Ind v4.0 sensor in the new Automation laboratory.

As a good student you wrote down the formula for calculating the accuracy of a sensor:

σ
=
√
∑
Q
T
1
(
X
i
−
¯¯¯¯¯
X
)
2
Q
T
−
1

Where QT is the number of times the test was performed, 
X
 the value measured in each test and 
¯¯¯¯¯
X
 the mean of the values.

To perform the test you have been doing H hours testing, and every M minutes you have checked the X value of the temperature delivered by the sensor.

Now that you have the measurements, and as you have the ability to program, make a program that delivers sensor accuracy.

Input
There are several test cases, each case consisting of two lines. The first one contains two values H and M. The second consists of the floating point values Xi indicating the value of each sensor measurement.

It is guaranteed that there will be at least 5 and at most 105 measures per case and that these values are in the interval [0, 255] with two decimal places.

Output
For each test case, print a single line with a number indicating the sensor's accuracy. The calculated value must be displayed with 5 digits after the decimal point.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

O professor está te ensinando sobre sensores. Este é um elemento muito importante em diversas aplicações. Para aprender melhor os conceitos de precisão o professor pediu para realizar uma montagem prática do sensor Termo Ind v4.0 no novo laboratório de Automação.

Você como bom aluno anotou a fórmula para o cálculo da precisão de um sensor:

σ
=
√
∑
Q
T
1
(
X
i
−
¯¯¯¯¯
X
)
2
Q
T
−
1

Onde QT é a quantidade de vezes que foi realizado o teste, 
X
 o valor medido em cada teste e 
¯¯¯¯¯
X
 a média dos valores.

Para realizar o teste você ficou H horas fazendo testes, e a cada M minutos você verificou o valor X da temperatura entregue pelo sensor.

Agora que você tem as medidas, e como você tem a habilidade de programar, faça um programa que entregue a precisão do sensor.

Entrada
Existem vários casos de teste, cada caso consiste de duas linhas. A primeira contém dois valores H e M. E a segunda consiste dos valores de ponto flutuante Xi indicando o valor de cada medida do sensor.

É garantido que haverão no mínimo 5 e no máximo 105 medidas por caso e que estes valores estão no intervalo [0, 255] com duas casas decimais.

Saída
Para cada caso de teste, imprima uma única linha com um número indicando a precisão do sensor. O valor calculado deve ser apresentado com 5 dígitos após o ponto decimal.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */
package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Problem_2774_Sensor_Accuracy {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int h = sc.nextInt();
            int m = sc.nextInt();

            int qt = (h * 60) / m;

            List<Double> medidas = new ArrayList<>();
            double somaTotal = 0;

            for (int i = 0; i < qt; i++) {
                double x = sc.nextDouble();
                medidas.add(x);
                somaTotal += x;
            }

            double media = somaTotal / qt;

            double somaQuadrados = 0;
            for (double x : medidas) {
                somaQuadrados += Math.pow(x - media, 2);
            }

            double precisao = somaQuadrados / (qt - 1);
            precisao = Math.sqrt(precisao);

            System.out.printf("%.5f\n", precisao);
        }

        sc.close();
    }
}