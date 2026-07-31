/*
🇺🇸 English

Ezequiel have an old and valuable clock, but some of its characteristics got lost over time. The pointers still marks the hours and minutes correctly, but the markers and numbers became unreadable.

Ezequiel uses an auxiliary instrument to observe the angles formed by the hour and minute pointers. He asks you to help writing a program that indicates the hour and the minute at the moment of measurement. You must consider that both angles measured at the time 00:00 are equal to zero and both pointers only moves when a corresponding time unit (hour or minute) is completed.

Input
The input consists of several test cases and is finished by the end-of-file (EOF). Each line is a new test case and have two integers h and m (0 ≤ h, m < 360) that are, respectively, the angles measured on the hour and minute pointers.

Output
For each test case output one line with the values of the hour and minute in the format “hh:mm” (without quotes), as seen in the examples.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Ezequiel possui um relógio muito antigo e valioso, mas algumas características dele foram perdidas com o passar do tempo. Os ponteiros ainda marcam as horas e os minutos corretamente, mas seus marcadores e números se tornaram ilegíveis.

Ezequiel utiliza um instrumento auxiliar para observar os ângulos formados pelos ponteiros de hora e de minuto. Ele pede para você ajudá-lo escrevendo um programa que indica a hora e o minuto do momento da medição. Considere que às 00:00 os dois ângulos medidos são iguais a zero e que ambos os ponteiros só se movimentam quando se completa uma unidade de tempo (hora ou minuto) correspondente.

Entrada
A entrada consiste em vários casos de teste e é finalizada pelo fim de arquivo (EOF). Cada linha corresponde a um caso de teste e contém dois valores inteiros h e m (0 ≤ h, m < 360) que são, respectivamente, os ângulos medidos sobre os ponteiros de hora e de minuto.

Saída
Para cada caso de teste, imprima uma única linha com o valor da hora e do minuto no formato "hh:mm" (sem aspas), conforme pode ser observado nos exemplos.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_3084_Old_Clock{
    public static int resultH(int h){
        return (int)h/30;
    }
    public static int resultM(int m){
        return (int)m/6;
    }
    public static void print(int resultHours, int resultMinute){
        if(resultHours>=0 && resultHours<=9){
                if(resultMinute>=0 && resultMinute<=9){
                     System.out.println("0"+resultHours+":0"+resultMinute);
                }
                else{
                    System.out.println("0"+resultHours+":"+resultMinute);
                }
		 }
		 else{
		     if(resultMinute>=0 && resultMinute<=9){
                     System.out.println(resultHours+":0"+resultMinute);
                }
                else{
                    System.out.println(resultHours+":"+resultMinute);
                }
		 }
    }
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
		    int h = sc.nextInt();
		    int m = sc.nextInt();
		    int resultHours = resultH(h);
		    int resultMinute = resultM(m);
		    if(resultMinute==60){
		        resultMinute = 0;
		        resultHours += 1;
		    }
		    print(resultHours,resultMinute);
		}
		
		sc.close();
	}
}
