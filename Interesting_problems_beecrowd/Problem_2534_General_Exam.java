/*
🇺🇸 English

The national math exam is done every leap year in Nlogonia. Every citizen is evaluated, so it is possible to study the development of logic and math in the country along the years.

After their exams are graded, the citizens are sorted according to their grades (the higher the grade, the better the citizen). They get discounts in their taxes according to their positions in this rank.

The Statistic Central Office (SCO) is in charge of processing the grades obtained in the exam. This year, however, Vasya, one of the people in charge, is at the hospital, and so you were hired to finish his job.

Write a program that, given the number of citizens and their grades, answers queries informing the grade of the citizen that is ranked at a given position.

Input
The input contains several test cases. The first line of each test case contains two integers N (1 ≤ N ≤ 100) and Q (1 ≤ Q ≤ 100), the number of citizens and the number of queries.

Each of the next N lines contains the grade ni obtained by the i-th citizen (0 ≤ ni ≤ 30000).

Each of the next Q lines contains a position pi.

The input ends with end-of-file (EOF).

Output
For each test case, print, for each query, a line containing the grade of the citizen that is ranked at position pi.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Todo ano bissexto é realizado o exame geral de matemática da Nlogônia. Todos os cidadãos da nação são avaliados a fim de se estudar o desenvolvimento lógico e matemático do país ao longo dos anos.

Após as correções, os cidadãos são ordenadados de acordo com suas notas (quanto maior, melhor) e recebem descontos no imposto de renda de acordo com sua qualificação.

O Escritório Central de Estatística (ECE) é encarregado de processar os dados das notas obtidas no exame. Entretanto este ano, Vasya, um dos responsáveis, está internado no hospital com gripe H1N1 e você foi contratado para realizar o seu trabalho.

Escreva um programa que dado o número de habitantes da Nlogônia e todas as notas obtidas, responda as consultas para retornar a nota do cidadão que ficou em determinada posição.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém dois inteiros N (1 ≤ N ≤ 100), Q (1 ≤ Q ≤ 100), o número de habitantes do país e o número de consultas, respectivamente.

As N linhas seguintes contém, cada uma, a nota ni obtida pelo i-ésimo cidadão (0 ≤ ni ≤ 30000).

As próximas Q linhas contém cada uma uma consulta, a posição pi (1 ≤ pi ≤ N) a qual a ECE está interessada em saber a nota.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima, para cada consulta, uma linha contendo a nota do cidadão que ficou classificado na posição pi.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2534_General_Exam{
    public static void main(String[]args)throws IOException{
            Scanner sc= new Scanner(System.in);
            
            while(sc.hasNextInt()){
            StringBuilder st = new StringBuilder();
            int N=sc.nextInt();
            if(N<1 || N>100){
                sc.close();
                return;
            }
            int Q=sc.nextInt();
            if(Q<1 || Q>100){
                sc.close();
                return;
            }
                int[] notas=new int[N];
                for(int p=0;p<N;p++){
                    notas[p]=sc.nextInt(); 
                    if(notas[p]<0 || notas[p]>30000){
                        sc.close();
                        return;
                    }
                }
                for(int p=0;p<N;p++){
                    for(int i=0;i<N;i++){
                        if(notas[p]>notas[i]){
                            int temp = notas[i];
                            notas[i]=notas[p];
                            notas[p]=temp;
                        }
                    }
                }
                for(int p=0;p<Q;p++){
                    int escolha=sc.nextInt();
                    if(escolha<1 || escolha>N){
                        sc.close();
                        return;
                    }
                    st.append(notas[escolha-1]).append("\n");
                    
                }
                System.out.print(st.toString());
            }
            
        
        
        sc.close();
    }
}