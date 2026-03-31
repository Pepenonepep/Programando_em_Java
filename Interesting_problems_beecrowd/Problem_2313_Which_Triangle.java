/*
🇺🇸 English

Given three values, find out if they form a triangle. If so, check if the triangle is scalene, isoceles or equilateral and if it is a triangle rectangle or not.

Input
Input is given by three integers A,B e C (0 < A,B,C < 105).

Output
The output must be the one single line containing the string "Invalido" if the input values do not represent a triangle.

If the values can be the sides of a triangle the output must be "Valido-Equilatero" if such triangle is equilateral, "Valido-Escaleno" if it is scalene or "Valido-Isoceles" if it is isoceles. The next line of output must read "Retangulo: S" if the triangle is rectangle or "Retangulo: N" otherwise, as shown in the examples.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Dados três valores, verifique se os três podem formar um triângulo. Em caso afirmativo, verifique se ele é escaleno, isóceles ou equilátero e se trata-se de um triângulo retângulo ou não.

Entrada
A entrada consiste em três números inteiros A,B e C (0 < A,B,C < 105).

Saída
A saída deve conter a string "Invalido" se os valores lidos não formarem um triângulo. Se os valores formarem um triângulo a saída deve ser "Valido-Equilatero", "Valido-Escaleno" ou "Valido-Isoceles" de acordo com a característica do triângulo seguido de "Retangulo: S" se o triângulo for retângulo ou "Retangulo: N" se não for, conforme os exemplos.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */
package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2313_Which_Triangle{

    public static void Triangulo_retangulo(int a, int b, int c){
       System.out.println (Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2)?"Retangulo: S":"Retangulo: N");

}
    public static void main(String[]args)throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();

        if(A<0 || B<0 || C<0 || A>Math.pow(10,5) || B>Math.pow(10,5) || C>Math.pow(10,5)){ 
            sc.close();
            return;
        }
        if(A+B<=C || A+C<=B || B+C<=A){
            System.out.println("Invalido");
        }
        else if(A==B && B==C){
            System.out.println("Valido-Equilatero");
            Triangulo_retangulo(A,B,C);
        }
        else if(A==B || B==C || A==C){
            System.out.println("Valido-Isoceles");
            Triangulo_retangulo(A,B,C);
        }
        else{
            System.out.println("Valido-Escaleno");
            Triangulo_retangulo(A,B,C);
        }




        sc.close();
    }
}
