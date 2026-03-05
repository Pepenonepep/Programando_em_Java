/*🇺🇸 English
Pedrinho is a boy who loves family parties, especially Christmas, when he wins gifts from his parents and grandparents. This year, his father promised him a PS4, but only if Pedrinho could solve some challenges throughout the year, one of them, writing a program that calculates how many days are left until Christmas.

However, Pedrinho is only 9 years old and knows nothing about programming, but he knows that you, his cousin, mess with "computer stuff" and thus, he asked you to write the program for him. Not only that, but he promised to let you play every weekend and for how long you would like to.

Input
The input consists of several test cases. Each line contains the month and the day of the year 2016 (leap year). Read input until EOF.

Output
If it's Christmas, print "E natal!"; if it's Christmas Eve, print "E vespera de natal!"; if it has already passed, print "Ja passou!". Otherwise, print "Faltam X dias para o natal!", being X the number of days left until Christmas.

Input Sample	Output Sample
12 24

11 24

12 29

1 5

12 25

E vespera de natal!

Faltam 31 dias para o natal!

Ja passou!

Faltam 355 dias para o natal!

E natal!

/* Class name must be "Main" for your solution to execute */

/* 🇧🇷 Portugues 

Pedrinho é um garoto que adora festas em família, principalmente o Natal, quando ganha presente dos pais e dos avós. Esse ano, seu pai lhe prometeu um PS4, mas somente se Pedrinho conseguir resolver alguns desafios ao longo do ano, sendo um deles, escrever um programa que calcule quantos dias faltam para o Natal.

Entretanto, Pedrinho tem somente 9 anos e não tem noção alguma de programação, mas sabe que você, primo dele, mexe com "coisas de computador", e dessa forma, pediu para você escrever o programa para ele. Não somente isso, mas prometeu que deixaria você jogar todo final de semana e por quanto tempo quiser!

Entrada
A entrada é composta por vários casos de teste. Cada linha contém o mês e o dia do ano de 2016 (ano bissexto). A entrada termina com fim de arquivo.

Saída
Se for Natal, imprima "E natal!"; se faltar somente um dia, imprima "E vespera de natal!"; se já passou, imprima "Ja passou!". Caso contrário, imprima "Faltam X dias para o natal!", sendo X o número de dias que faltam para o Natal.

Exemplo de Entrada	Exemplo de Saída
12 24

11 24

12 29

1 5

12 25

E vespera de natal!

Faltam 31 dias para o natal!

Ja passou!

Faltam 355 dias para o natal!

E natal!

/* O nome da classe deve ser "Main" para que a sua solução execute */



package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;


public class Problem_2139_Pedrinho_is_Christmas{

static int faltam_dias(int mes,int dias){
    int vet[]= {31,29,31,30,31,30,31,31,30,31,30,25};
    int soma=0;

    for(;mes<12;mes++){
        soma+=vet[mes];
    }
    soma-=dias;
    return soma;
}
    public static void main(String[] args) throws IOException { 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int mes=sc.nextInt();
            int dia=sc.nextInt();
            if(mes==12){
            if(dia==24){
                System.out.println("E vespera de natal!");
            }
            else if(dia==25){
                System.out.println("E natal!");
            }
            else if(dia>25){
                System.out.println("Ja passou!");

            }
            else{
                int falta = 25-dia;
                System.out.printf("Faltam %d dias para o natal!\n",falta);
            }
            }
            else{
                System.out.println("Faltam "+faltam_dias(mes-1,dia)+" dias para o natal!");
            }
        }

        sc.close();
    }

}
