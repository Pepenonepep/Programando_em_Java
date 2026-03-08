/*
🇺🇸 English

Gilberto is a famous sfiha vendor. However, although everyone likes his sfihas, he can only give the change with two different bills, i.e., it's not always possible to get the right change. In order to make Gil's life easier, write a program for him to check whether it's possible to give the exact change using two different bills.

Available bills: 2, 5, 10, 20, 50 and 100.

Input
The input contains an integer N representing the buy price and then an integer M representing the price paid by the costumer (N < M ≤ 104). Read input until N = M = 0.

Output
Print "possible" if it's possible to give the exact change or "impossible" if it's not.

Input Sample	Output Sample
11 23
500 650
100 600
9948 9963
1 2
2 4
0 0

possible
possible
impossible
possible
impossible
impossible
*/

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Gilberto é um famoso vendedor de esfirras na região. Porém, apesar de todos gostarem de suas esfirras, ele só sabe dar o troco com duas notas, ou seja, nem sempre é possível receber o troco certo. Para facilitar a vida de Gil, escreva um programa para ele que determine se é possível ou não devolver o troco exato utilizando duas notas.

As notas disponíveis são: 2, 5, 10, 20, 50 e 100.

Entrada
A entrada deve conter o valor inteiro N da compra realizada pelo cliente e, em seguida, o valor inteiro M pago pelo cliente (N < M ≤ 104). A entrada termina com N = M = 0.

Saída
Seu programa deverá imprimir "possible" se for possível devolver o troco exato ou "impossible" se não for possível.

Exemplo de Entrada	Exemplo de Saída
11 23
500 650
100 600
9948 9963
1 2
2 4
0 0

possible
possible
impossible
possible
impossible
impossible
*/

/*O nome da classe deve ser "Main" para que a sua solução execute */


package Interesting_problems_beecrowd;
import java.io.*;
import java.util.*;

public class Problem_2140_Two_Bills{
public static void main(String[] args) throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int dois=2,cinco=5,dez=10,vinte=20,cinquenta=50,cem=100;
        int N= sc.nextInt();
        int M=sc.nextInt();
        if(N<M && M<=Math.pow(10,4)){
            while(N!=0 && M!=0){
                int res=M-N;
                if(dois+cinco == res || dois+dez==res || dois+vinte==res || dois+cinquenta==res || dois+cem==res || cinco+dez==res || cinco+vinte==res || cinco+cinquenta==res || cinco+cem==res || dez+vinte==res || dez+cinquenta==res || dez+cem==res || vinte+cinquenta==res || vinte+cem==res || cinquenta+cem==res){
                    System.out.println("possible");
                }
                else{
                    System.out.println("impossible");
                }
                

                N=sc.nextInt();
                M=sc.nextInt();
            }
        }




    sc.close();
}
}


