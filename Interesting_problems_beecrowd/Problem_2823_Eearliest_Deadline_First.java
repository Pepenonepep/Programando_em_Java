/*
🇺🇸 English

Your job for this problem is to check if it is possible to schedule a set of periodic tasks under real-time constraints.

A real-time task is defined by two numbers. The first number is the computational cost of the task. It is the computational cost of each complete run of the task. The second number is the period of the process. In other words, the process restarts again after each period.

The task set will be scheduled using the EDF algorithm (Earliest Deadline First). It is known that EDF is optimal. This means that if a set of tasks cannot be scheduled by EDF, there isn't another algorithm that can schedule it.

The operating system that will run these tasks runs on a single core machine. The tasks are preemptable. That is, a task can take the place of another task during its run, if required.

Consider that the cost of switching tasks is 0.

Input
The first line of the input has a value  
1
≤
N
≤
10
, which states the number of processes under schedule.

Every N following line represents a process, and has 2 values 
1
≤
C
≤
5
 and 
C
≤
P
≤
100
, that represent the computational cost and the period of each process, respectively.

Output
The output consists of a single line, with the string OK or the string FAIL, if the scheduling is possible or not, respectively.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Neste problema o seu trabalho é verificar se um conjunto de processos periódicos que possuem restrição de tempo-real pode ser escalonado.

Um processo de tempo real é caracterizado por dois números. O primeiro é o custo computacional do processo. Ou seja, o tempo que o processo gasta quando entrar em execução. O segundo número é o período em que o processo executa. Ou seja, a cada período de tempo, o processo reinicia.

O conjunto será escalonado usando o algoritmo EDF (Earliest Deadline First). Sabe-se que o algoritmo EDF é ótimo. Ou seja, se um conjunto de tarefas não poder ser escalonado pelo EDF, ele não poderá ser escalonado por nenhum outro algoritmo.

O sistema operacional que receberá estas tarefas está rodando em uma máquina single core. As tarefas são preemptáveis. Isto é uma tarefa pode tomar o lugar de outra durante a execução, se for necessário.

Considere que o custo de trocar entre tarefas é 0.

Entrada
A primeira linha da entrada possui um valor 
1
≤
N
≤
10
, que é número de processos a ser avaliado.

Cada N linha seguinte representa um processo, e contém 2 valores 
1
≤
C
≤
5
 e 
C
≤
P
≤
100
, que representam o custo computacional e o período de cada processo, respectivamente.

Saída
A saída consiste de uma única linha, contendo ou o string OK ou do string FAIL, caso o escalonamento seja possível ou não, respectivamente.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2823_Eearliest_Deadline_First {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double soma = 0;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int pp = sc.nextInt();
            soma += (double) c / pp;
        }
        System.out.println(soma > 1.0 ? "FAIL" : "OK");

        sc.close();
    }
}