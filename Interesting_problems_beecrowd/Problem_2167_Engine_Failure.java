/*
🇺🇸 English

Engineer Joe realizes that always happened a speed fall when the measures of an engine speed slope were made at 10 ms time interval. But this fall happened at varying points at each new engine test.

Joe got curious with that lack of pattern and wants to know, for each engine test, what is the first point in which this speed fall happens.

Input
The input is an engine test and is given in two lines. The first one has the number N of speed measures (1 < N ≤ 100). The second line has N integers: the engine RPM (revolutions per minute) Ri of each measure (0 ≤ Ri ≤ 10000, for all Ri, such that 1 ≤ i ≤ N). A measure is considered a speed fall if it is lower than the previous measure.

Output
The output is the measure index where the first speed fall happened in the test. If no speed fall happens the output must be the number zero.

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Ao observar a curva de velocidade de um motor, o engenheiro Zé percebeu que sempre ocorria uma queda quando as medidas eram feitas em intervalos de 10 ms. Mas esta queda acontecia em medidas diferentes a cada novo teste do motor.

Zé ficou curioso com essa falta de padrão e quer saber, para cada teste do motor, qual a primeira medida em que ocorre uma queda de velocidade.

Entrada
A entrada é um teste do motor e é dada em duas linhas. A primeira tem o número N de medidas de velocidade do motor (1 < N ≤ 100). A segunda linha tem N inteiros: o número de RPM (rotações por minuto) Ri de cada medida (0 ≤ Ri ≤ 10000, para todo Ri, tal que 1 ≤ i ≤ N). Uma medida é considerada uma queda se é menor que a medida anterior.

Saída
A saída é o índice da medida em que houve a primeira queda de velocidade no teste. Caso não aconteça uma queda de velocidade a saída deve ser o número zero.

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2167_Engine_Failure{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        if(n<=1 || n>100){
            sc.close();
            return;
        }
        int[] v= new int[n];
        for(int p=0;p<n;p++){
            v[p]=sc.nextInt();
            int r = v[p];
            if(r<0 || r>10000){
                sc.close();
                return;
            }
        }
        int posicao=0;
        for(int p=0;p<n;p++){
            if(p==n-1){
                if(v[p-1]>v[p]){
                    posicao = p+1;
                    System.out.println(posicao);
                    sc.close();
                    return;
                }
            }
            else if (v[p]>v[p+1]){
                posicao=p+2;
                System.out.println(posicao);
                sc.close();
                return;
            }
        }
        System.out.println(posicao);
        sc.close();
    }
    
}
