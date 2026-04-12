/*
🇺🇸 English

Googlbook is a famous IT company that opened an office in your town this year! Also, Googlbook has just offered interviews to an internship position in the company!

To be interviewed, you need to send some personal information to the company, that will be used to decide who will earn the position. You sent all information they need except one: your API (Academic Performance Index). To get things worse, Student’s Portal, the system that provide your API, is not working!

Fortunately, you remember all the grades you got in all M subjects you coursed, as well their workloads. Where N1, N2, ..., NM are your grades in each subject, and C1, C2, ..., CM are the workload of the respective subjects.

Given the grades you got and the workload of each subject, determine your API, so you can send it to Googlbook as soon as possible!

Input
The input contains several test cases. The first line of each test case contains integer M (1 ≤ M ≤ 40), the number of subjects you coursed. Each of the next M lines describe a subject. Each line contains two integers Ni and Ci (0 ≤ Ni ≤ 100, 30 ≤ Ci ≤ 120), indicating the grade you got in that subject and its workload, respectively.

The input ends with end-of-file (EOF).

Output
For each test case, print a line containing your API. Round and print it with exactly 4 decimal places.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

 Googlbook é uma famosa empresa de tecnologia mundial que acabou de abrir uma filial na sua cidade! Além disso, a Googlbook também acabou de abrir as inscrições do processo seletivo para uma vaga de estágio na empresa!

Para se inscrever no processo seletivo, você deve enviar algumas informações para a empresa, que irá usá-las para decidir quem será contemplado com a vaga. Você já enviou todas as informações necessárias, exceto uma: seu IRA (Índice de Rendimento Acadêmico). Para piorar, o Portão do Aluno, sistema que disponibiliza o histórico com IRA, está fora do ar!

Felizmente, você lembra de suas notas em todas as M disciplinas que cursou, além de suas respectivas cargas horárias. Onde N1, N2, ..., NM são suas notas em cada disciplina, e C1, C2, ..., CM são as cargas horárias das discplinas respectivas.

Dada a nota obtida e a carga horária de cada disciplina, determine seu IRA para poder enviá-lo para a Googlbook o mais breve possível!

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém o inteiro M (1 ≤ M ≤ 40), o número de disciplinas cursadas. As próximas M linhas descrevem uma disciplina cada. Cada linha contém dois inteiros Ni e Ci (0 ≤ Ni ≤ 100, 30 ≤ Ci ≤ 120), indicando a nota obtida na disciplina e a carga horária da mesma, respectivamente.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma linha contendo o valor do seu IRA. Arredonde e imprima a resposta com exatamente 4 casas decimais.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.util.Locale;
import java.io.IOException;

public class Problem_2533_Internship{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        while(sc.hasNextInt()){
            int M=sc.nextInt();
            double cargaHorariaTotal=0;
            double notaVezesCarga = 0;
            if(M<1 || M>40){
                continue;
            }
            for(int d=0;d<M;d++){
                int N=sc.nextInt();
                if(N<0 || N>100){
                    sc.close();
                    return;
                }
                int C=sc.nextInt();
                if(C<30 || C>120){
                    sc.close();
                    return;
                }
                cargaHorariaTotal+=C;
                notaVezesCarga += N*C;
            }
            double IRA = notaVezesCarga/(cargaHorariaTotal*100);
            System.out.println(String.format("%.4f", IRA));
        }

        sc.close();
    }
}