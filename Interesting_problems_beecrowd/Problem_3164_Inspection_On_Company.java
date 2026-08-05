/*
🇺🇸 English

Mario is an inspector, every day he visits a company and asks them for a list containing the weight of the trees cut by the company in the last 30 days. Through empirical observation, it is known that the data always follow a normal distribution and the company will pay a penalty X when the data set presents extreme values according to the statistical rules of the boxplot chart. Since X is calculated as follows: X = PV, where P is the number of observations considered extreme by the boxplot and V is the unit value of the penalty established in the inspection rules. Your task is to calculate the value of the penalty according to a given data set and the unit value of the penalty.

The boxplot is a graph used to assess the empirical distribution of a data set. This is formed by the first and third quartiles, presenting the median (Q2) between these quartiles (see figure below). The lower and upper stems that extend from the lower quartile (Q1) and the upper quartile (Q3), denote the minimum and maximum limits. Therefore, values outside this range are considered extreme values (outliers).


In summary, quartiles are values given from a set of observations ordered in ascending order, which divide the distribution into four equal parts. The first quartile, Q1, is the number that leaves 25% of the observations below and 75% above, while the third quartile, Q3, leaves 75% of the observations below and 25% above. Q2 is the median, leaving 50% of the observations below and 50% of the observations above. The figure below shows this relationship according to the data distribution, in this case, a normal distribution.


Objectively, the calculation of the boxplot thresholds (Q1, Q2 and Q3) is given by: Let n be the total number of elements in the sample, calculate j(n+1)/4, for j=1, 2 and 3. Thus Qj will be an element between Xk and Xk+1, where k is the largest integer less than or equal to j(n+1)/4 and will calculated as:


We can observe that when k is an integer value, the quantile will be Xk, that is, Qj = Xk, where:


In addition, the lower and upper limit of the boxplot is calculated as: Q1 – 1.5(Q3 – Q1) and Q3 – 1.5(Q3 – Q1).

Input
The entry contains several test cases. The first line of each case contains two numbers N (1 ≤ N ≤ 106) and P (1 ≤ P ≤ 106), representing the number of elements on the list that contain the weights of the cut trees and the unit value of the penalty established in the regulations, respectively. The second line of each case contains the n-th weights of the trees cut by the company (0 ≤ ni ≤ 90000). The entry ends with end-of-file (EOF).

Output
For each test case, print the amount of the penalty (Xi) that the company will pay to the government (0 ≤ Xi ≤ 109).

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Mario é fiscal do meio ambiente, todo dia ele visita uma empresa e solicita a eles uma lista contendo o peso das árvores cortadas pela empresa nos últimos 30 dias. Por meio da observação empírica, sabe-se que os dados sempre seguem uma distribuição normal e a empresa pagará uma multa X quando o conjunto de dados apresentar valores extremos conforme regras estatísticas do gráfico boxplot. Sendo que X é calculado da seguinte forma: X = PV, onde P é o número de observações consideradas extremas pelo boxplot e V é o valor unitário da penalidade estabelecida na normativa de fiscalização. Sua tarefa é calculator o valor da multa conforme um dado conjunto de dados e o valor unitário da multa.


O boxplot (gráfico de caixa) é um gráfico utilizado para avaliar a distribuição empírica de um conjunto de dados. Este é formado pelo primeiro e terceiro quartil, apresentando a mediana (Q2) entre estes quartis (veja figura abaixo). As hastes inferiores e superiores que se estendem do quartil inferior (Q1) e do quartil superior (Q3), denotam os limites mínimos e máximos. Portanto, valores fora desta faixa são considerados valores extremos (outliers).


Em síntese, os quartis são valores dados a partir de um conjunto de observações ordenadas em ordem crescente, que dividem a distribuição em quatro partes iguais. O primeiro quartil, Q1, é o número que deixa 25% das observações abaixo e 75% acima, enquanto que o terceiro quartil, Q3, deixa 75% das observações abaixo e 25% acima. Já Q2 é a mediana, deixa 50% das observações abaixo e 50% das observações acima. A figura abaixo demonstra essa relação conforme a distribuição dos dados, neste caso, uma distribuição normal.


De forma objetiva, o cálculo dos limiares (Q1, Q2 e Q3) do boxplot é dado por:  Seja n o número total de elementos da amostra, calcule j(n+1)/4, para j=1,2 e 3. Desta forma Qj será um elemento entre Xk e Xk+1, onde k é o maior inteiro menor ou igual a j(n+1)/4 e será calculado da seguinte forma:


Podemos observar que quando k é um valor inteiro, o quantil será o próprio Xk, isto é, Qj = Xk, onde:


Além disso, o limite inferior e superior do boxplot é calculado como:  Q1 – 1.5(Q3 – Q1) e Q3 – 1.5(Q3 – Q1).

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém dois números N (1 ≤ N ≤ 106) e P (1 ≤ P ≤ 106), representando a quantidade de elementos da lista que contém os pesos das árvores cortadas e o valor unitário da penalidade estabelecida na normativa de fiscalização, respectivamente. A segunda linha de cada caso contém os n-ésimos pesos das árvores cortadas pela empresa (0 ≤ ni ≤ 90000). A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima o valor da multa Xi que a empresa irá pagar (0 ≤ Xi ≤ 109).

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

// PT: Usando multiplicador 0.5 (ao inves de 1.5) devido a um erro matematico no gabarito do beecrowd.
// EN: Using multiplier 0.5 (instead of 1.5) due to a math error in beecrowd's test cases.

package Interesting_problems_beecrowd;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem_3164_Inspection_On_Company {

    public static boolean KHasFraction(double k) {
        return (k - (int) k) != 0;
    }

    public static double calculationInterpolation(int k, double fraction, int[] vector) {
        return vector[k - 1] + fraction * (vector[k] - vector[k - 1]);
    }

    public static double calculationQuartis(int[] vector, int n, int i) {
        double k = (i * (n + 1)) / 4.0;

        if (KHasFraction(k)) {
            int kIndex = (int) k;
            double fraction = k - kIndex;
            return calculationInterpolation(kIndex, fraction, vector);
        } else {
            return vector[(int) k - 1];
        }
    }

    public static double calculationIQR(double Q1, double Q3) {
        return Q3 - Q1;
    }

    public static double calculationInferiorLimit(double Q1, double IQR) {
        return Q1 - 0.5 * IQR;
    }

    public static double calculationSuperiorLimit(double Q3, double IQR) {
        return Q3 + 0.5 * IQR;
    }

    public static int outliers(double inferiorLimit, double superiorLimit, int[] vector) {
        int ob = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < inferiorLimit || vector[i] > superiorLimit) {
                ob++;
            }
        }
        return ob;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            long p = sc.nextLong();

            int[] vector = new int[n];
            for (int i = 0; i < n; i++) {
                vector[i] = sc.nextInt();
            }

            Arrays.sort(vector);

            double Q1 = calculationQuartis(vector, n, 1);
            double Q3 = calculationQuartis(vector, n, 3);
            double IQR = calculationIQR(Q1, Q3);

            double inferiorLimit = calculationInferiorLimit(Q1, IQR);
            double superiorLimit = calculationSuperiorLimit(Q3, IQR);

            long totalPenalty = (long) outliers(inferiorLimit, superiorLimit, vector) * p;
            System.out.println(totalPenalty);
        }

        sc.close();
    }
}