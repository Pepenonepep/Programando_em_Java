/*
🇺🇸 English

Mr. Amnésio had great difficulty in keeping passwords. To remind them, he always wore numbers, and writing on pieces of paper, which also lost easily, causing it needed to change the password every time this happened. Tired, he thought in a more practical way: put on paper the next number of password, then he always used the same account to remember the password based on the number written on paper. But he also forgot the formula, therefore, asked you to write a program that, given the number of the paper, enter the corresponding password. Write a program that, given a number, enter their password.

Input
The entry will have many test cases. Each test case will have a number N, representing the number written on paper (1001 ≤ N ≤ 9999). The entry ends with the end of the file.

Output
For each test case, print the corresponding password. In all cases, the formula will be the same in the examples below.

*/

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Sr. Amnésio tinha uma grande dificuldade em guardar senhas. Para lembrá-las, ele sempre usava números, e as escrevia em pedaços de papel, que também perdia com facilidade, fazendo com que ele precisasse modificar a senha cada vez que isto acontecia. Cansado, ele pensou em uma forma mais prática: colocava no papel um número próximo da senha, depois ele usava sempre uma mesma conta para lembrar a senha, baseada no número escrito no papel. Mas ele também esquecia a fórmula, por isto, pediu para você escrever um programa que, dado o número do papel, informe a senha correspondente.

Escreva um programa que, dado um número, informe a respectiva senha.

Entrada
A entrada terá diversos casos de teste. A cada caso de teste, terá um número N, que representa o número escrito no papel (1001 ≤ N ≤ 9999). A entrada termina com o fim do arquivo.

Saída
Para cada caso de teste, imprima a senha correspondente. Em todos os casos, a fórmula será a mesma, igual aos exemplos abaixo.

/*O nome da classe deve ser "Main" para que a sua solução execute */


package  Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2146_Password{
    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);

        while(sc.hasNext()){
            int senha=sc.nextInt();
            if(senha<1001 || senha>9999){
                sc.close();
                return;
            }
            senha-=1;
            System.out.println(senha);
        }

        sc.close();
    }

}