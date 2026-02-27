/*
English:

Paul and Peter have made a long journey since they left Brazil to compete in the ICPC World Finals, in Phuket, Thailand. They noticed that in each place where they stopped, they had to adjust their watches because of the time zone.

This way, to plan for upcoming trips, they asked you to create a mobile application that, given the departure time, travel time and the destination time zone with respect to the origin, you have to inform the time of arrival of each flight in the destination.

For example, if they left a place at 10 am for a 4 hour journey to a destination that is on the east, in a time zone with an extra hour with respect to the time zone of the starting point, the arrival time will be 10 hours + 4 hours + 1 hour (due de time zone), i.e. they will arrive at 15 hours. Note that if the calculated time is 24, its program should print 0 (zero).

Input
The input contains 3 integers: S (0 ≤ S ≤ 23), T (1 ≤ T ≤ 12) y F (-5 ≤ F ≤ 5), separated by a space, respectively indicating the time of departure, the travel time and destination time zone with respect to the origin.

Output
Print an integer that indicates the local time specified in destination, as the examples below.

Input Samples	Output Samples
10 7 3

20

22 6 -2

2
0 3 -4

23
*/

/*
Class name must be "Main" for your solution to execute
 */

/*
Português:

Paulo e Pedro fizeram uma longa jornada desde que partiram do Brasil para competir na Final Mundial da Maratona, em Phuket, Tailândia. Notaram que a cada escala que faziam, tinham que ajustar seus relógios por causa do fuso horário.

Assim, para melhor se organizarem para as próximas viagens, eles pediram que você faça um aplicativo para celular que, dada a hora de saída, tempo de viagem e o fuso do destino com relação à origem, você informe a hora de chegada de cada vôo no destino.

Por exemplo, se eles partiram às 10 horas da manhã para uma viagem de 4 horas rumo a um destino que fica à leste, em um fuso horário com uma hora a mais com relação ao fuso horário do ponto de partida, a hora de chegada terá que ser: 10 horas + 4 horas de viagem + 1 hora de deslocamento pelo fuso, ou seja, chegarão às 15 horas. Note que se a hora calculada for igual a 24, seu programa deverá imprimir 0 (zero).

Entrada
A entrada contém 3 inteiros: S (0 ≤ S ≤ 23), T (1 ≤ T ≤ 12) e F (-5 ≤ F ≤ 5), separados por um espaço, indicando respectivamente a hora da saída, o tempo de viagem e o fuso horário do destino com relação à origem.

Saída
Imprima um inteiro que indica a hora local prevista no destino, conforme os exemplos abaixo.

Exemplos de Entrada	Exemplos de Saída
10 7 3

20

22 6 -2

2
0 3 -4

23
*/

/*
  O nome da classe deve ser "Main" para que a sua solução execute
 */

package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2057_Time_Zone{
  public static void main(String[]args)throws IOException{
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int S = sc.nextInt();
    if(S<0 || S>23){
        sc.close();
        return;
    }
    int T = sc.nextInt();
    if(T<1 || T>12){
        sc.close();
        return;
    }
    int F = sc.nextInt();
    if(F<-5 || F>5){
        sc.close();
        return;
    }
   int soma_saida_tempo= S+T;
   if(soma_saida_tempo>24){
       int resultado = soma_saida_tempo-24;
       resultado += F;
       System.out.println(resultado);
   }
   else{
       int resultado = soma_saida_tempo+F;
       if(resultado<0){
        resultado=24+resultado;
        System.out.println(resultado);
       }
       else{
        if(resultado!=24 || resultado!=0){
          System.out.println(resultado);
        }
        else if(resultado==24){
          System.out.println(0);
        }
        else{
          System.out.println(S);
        }
       }
      
   }
    
    sc.close();
}
}