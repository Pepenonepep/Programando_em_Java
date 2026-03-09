/*
🇺🇸 English

Every year after the contest that takes place in Taxiland, contestants and coaches go to the famous and renowned restaurant Radar. However, the waiters (always very kind and polite) get overwhelmed due to the amount of people, and therefore, end up taking a while to serve them.

Contestants or coaches who sit at the ends are the lucky ones, because they order only once and are served right away, but the others must always order twice, because the waiters (always very kind and polite) are careless and easily forget the orders. Besides, there's a superstition going on among the contestants and coaches that if there's not an even amount of people who don't sit at the ends, none of the university's teams will win the next contest.

So your task is to determine the sum of the number of orders of each one to know if it's worth going to Radar. But whatever the result is, remember: it's always worth going to Radar!

Input
The input consists of the integer T (1 ≤ T ≤ 100) indicating the number of test cases and then, T integers N (3 ≤ N ≤ 104) indicating the number of people. The table is rectangular and there will be at least and at most one person at one end, i.e., if an end is empty, the other must be occupied, otherwise, the two ends must be occupied, but the number of people that are not at the ends must always be even. Read input until T = 0.

Output
Print the sum of the number of orders of each person. There's no newline between the test cases.

*/

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Todo ano após a competição que ocorre na cidade de Taxilândia, os participantes e os coaches vão para o célebre restaurante Radar. Porém, os garçons (sempre muito gentis e educados) ficam sobrecarregados devido à quantidade de pessoas, e consequentemente, acabam demorando um pouco para atender a um pedido.

Os participantes ou coaches que sentam nas pontas são os privilegiados, pois são atendidos com somente um pedido, mas os demais precisam sempre pedir duas vezes, pois os garçons (apesar de gentis e educados) são desatentos e se esquecem facilmente dos pedidos. Além disso, há uma superstição entre os participantes e coaches de que se não houver um número par de pessoas que não sentam nas pontas, na próxima competição nenhuma equipe da universidade conseguirá vencer.

Portanto, sua tarefa é determinar a soma da quantidade de pedidos de cada um para saber se vale a pena ir ao Radar. Mas apesar do resultado, lembre-se: sempre vale a pena ir ao Radar!

Entrada
A entrada é composta por T (1 ≤ T ≤ 100) indicando a quantidade de casos de teste e então, T inteiros N (3 ≤ N ≤ 104), indicando a quantidade de pessoas. A mesa é retangular e haverá pelo menos e no máximo uma pessoa em uma das pontas, isto é, se uma ponta estiver vazia, a outra deve ser ocupada, ou senão, as duas pontas estarão ocupadas, mas o número de pessoas que não estão nas pontas sempre será par. O final da entrada é indicado por T = 0.

Saída
Seu programa deverá imprimir a soma da quantidade de pedidos de cada pessoa. Não haverá linha em branco entre os casos de teste.
*/

/*O nome da classe deve ser "Main" para que a sua solução execute */


package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2143_The_Return_of_Radar{
    public static void main(String[] args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int T=1;
        while(T!=0){
            T = sc.nextInt();
            if(T<1 || T>100){
                sc.close();
                return;
            }
            for(int i=0;i<T;i++){
                int N=sc.nextInt();
                if(N<3 || N>Math.pow(10,4)){
                    sc.close();
                    return;
                }
                if(N%2==0){
                     int soma= (N*2)-2;
                System.out.println(soma);
                soma=0;
                }
                else{
                    int soma= (N*2)-1;
                System.out.println(soma);
                soma=0;
                }
            }

        }


        sc.close();
    }
}
